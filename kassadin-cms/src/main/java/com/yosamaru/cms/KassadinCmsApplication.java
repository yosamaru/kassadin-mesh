package com.yosamaru.cms;

import com.yosamaru.cms.config.CmsOutputSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableBinding({CmsOutputSource.class})
public class KassadinCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KassadinCmsApplication.class, args);
    }

}
