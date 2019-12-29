package com.springboot.test.eurekawtwo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 加上启用Eureka服务注解（标记其为Eureka服务）
public class Eurekawtwo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekawtwo1Application.class, args);
    }

}
