package com.yosamaru.oms;

import com.yosamaru.oms.config.OmsSinkSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableBinding(OmsSinkSource.class)
public class KassadinOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KassadinOmsApplication.class, args);
    }

}
