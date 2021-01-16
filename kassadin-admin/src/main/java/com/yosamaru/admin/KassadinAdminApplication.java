package com.yosamaru.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class KassadinAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(KassadinAdminApplication.class, args);
    }

}
