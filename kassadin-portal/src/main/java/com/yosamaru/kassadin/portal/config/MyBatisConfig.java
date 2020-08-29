package com.yosamaru.kassadin.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.yosamaru.kassadin.mapper","com.yosamaru.kassadin.portal.dao"})
public class MyBatisConfig {
}
