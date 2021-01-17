package com.yosamaru.batch.config;

import com.yosamaru.batch.listener.JobListener;
import com.yosamaru.batch.pojo.entity.AccessDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.batch.item.database.orm.JpaNativeQueryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Slf4j
@Configuration
@EnableBatchProcessing
public class DataBatchConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;    //用于构建JOB

    @Autowired
    private StepBuilderFactory stepBuilderFactory;  //用于构建Step

    @Autowired
    private EntityManagerFactory emf;           //注入实例化Factory 访问数据

    @Autowired
    private JobListener jobListener;            //简单的JOB listener

    /**
     * 一个简单基础的Job通常由一个或者多个Step组成
     */
    @Bean
    public Job dataHandleJob() {
        return jobBuilderFactory.get("dataHandleJob").
                incrementer(new RunIdIncrementer()).
                start(handleDataStep()).    //start是JOB执行的第一个step
                listener(jobListener).      //设置了一个简单JobListener
                build();
    }

    /**
     * 一个简单基础的Step主要分为三个部分
     * ItemReader : 用于读取数据
     * ItemProcessor : 用于处理数据
     * ItemWriter : 用于写数据
     */
    @Bean
    public Step handleDataStep() {
        return stepBuilderFactory.get("getData").
                <AccessDO, AccessDO>chunk(100).        // <输入,输出> 。chunk通俗的讲类似于SQL的commit; 这里表示处理(processor)100条后写入(writer)一次。
                faultTolerant().retryLimit(3).retry(Exception.class).skipLimit(100).skip(Exception.class). //捕捉到异常就重试,重试100次还是异常,JOB就停止并标志失败
                reader(getDataReader()).         //指定ItemReader
                processor(getDataProcessor()).   //指定ItemProcessor
                writer(getDataWriter()).         //指定ItemWriter
                build();
    }

    @Bean
    public ItemReader<? extends AccessDO> getDataReader() {
        //读取数据,这里可以用JPA,JDBC,JMS 等方式 读入数据
        JpaPagingItemReader<AccessDO> reader = new JpaPagingItemReader<>();
        //这里选择JPA方式读数据 一个简单的 native SQL
        String sqlQuery = "SELECT * FROM AccessDO";
        try {
            JpaNativeQueryProvider<AccessDO> queryProvider = new JpaNativeQueryProvider<>();
            queryProvider.setSqlQuery(sqlQuery);
            queryProvider.setEntityClass(AccessDO.class);
            queryProvider.afterPropertiesSet();
            reader.setEntityManagerFactory(emf);
            reader.setPageSize(3);
            reader.setQueryProvider(queryProvider);
            reader.afterPropertiesSet();
            //所有ItemReader和ItemWriter实现都会在ExecutionContext提交之前将其当前状态存储在其中,如果不希望这样做,可以设置setSaveState(false)
            reader.setSaveState(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reader;
    }

    @Bean
    public ItemProcessor<AccessDO, AccessDO> getDataProcessor() {
        return new ItemProcessor<AccessDO, AccessDO>() {
            @Override
            public AccessDO process(AccessDO AccessDO) throws Exception {
                log.info("processor data : " + AccessDO.toString());  //模拟  假装处理数据,这里处理就是打印一下
                return AccessDO;
            }
        };
//        lambda也可以写为:
//        return AccessDO -> {
//            log.info("processor data : " + AccessDO.toString());
//            return AccessDO;
//        };
    }

    @Bean
    public ItemWriter<AccessDO> getDataWriter() {
        return list -> {
            for (AccessDO AccessDO : list) {
                log.info("write data : " + AccessDO); //模拟 假装写数据 ,这里写真正写入数据的逻辑
            }
        };
    }
}
