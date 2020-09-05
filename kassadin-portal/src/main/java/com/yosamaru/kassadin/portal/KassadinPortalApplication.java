package com.yosamaru.kassadin.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yosamaru.kassadin")
public class KassadinPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(KassadinPortalApplication.class, args);
    }

}