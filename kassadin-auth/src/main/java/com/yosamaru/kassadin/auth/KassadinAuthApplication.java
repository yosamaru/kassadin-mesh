package com.yosamaru.kassadin.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yosamaru.kassadin")
public class KassadinAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(KassadinAuthApplication.class, args);
    }

}
