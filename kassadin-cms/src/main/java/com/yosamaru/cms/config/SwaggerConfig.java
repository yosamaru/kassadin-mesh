package com.yosamaru.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.yosamaru.cms.controller"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag("CMS", "CMS管理"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("CMS中心")
                .description("订单中心，集中管理账号信息。")
                .termsOfServiceUrl("http://127.0.0.1:8081/")
                .contact(
                        new Contact(
                                "CMS中心",
                                "http://127.0.0.1:8081/",
                                "")).version("1.0.0").build();
    }}
