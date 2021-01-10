package com.yosamaru.oms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yosamaru.oms.dao")
public class MybatisPlusConfig {
}
