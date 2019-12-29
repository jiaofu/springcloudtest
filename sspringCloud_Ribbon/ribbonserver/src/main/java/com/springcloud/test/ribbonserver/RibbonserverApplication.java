package com.springcloud.test.ribbonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RibbonserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonserverApplication.class, args);
    }

}
