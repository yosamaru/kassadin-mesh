package com.yosamaru.kassadin.auth.config;

import com.yosamaru.kassadin.common.config.BaseSwaggerConfig;
import com.yosamaru.kassadin.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.yosamaru.kassadin.auth.controller")
                .title("kassadin认证中心")
                .description("kassadin认证中心相关接口文档")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
