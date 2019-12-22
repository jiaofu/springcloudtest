package com.springcloud.test.eurekaone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 加上启用Eureka服务注解（标记其为Eureka服务）
public class EurekaoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaoneApplication.class, args);
    }

}
