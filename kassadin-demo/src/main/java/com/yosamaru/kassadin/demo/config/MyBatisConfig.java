package com.yosamaru.kassadin.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("com.yosamaru.kassadin.mapper")
public class MyBatisConfig {
}
