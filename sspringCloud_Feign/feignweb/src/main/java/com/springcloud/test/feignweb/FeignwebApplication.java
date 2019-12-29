package com.springcloud.test.feignweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springcloud.test")
@EnableEurekaClient
public class FeignwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignwebApplication.class, args);
    }

}
