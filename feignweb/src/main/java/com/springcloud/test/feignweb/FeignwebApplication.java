package com.springcloud.test.feignweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.springcloud.test.feignweb.server")

public class FeignwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignwebApplication.class, args);
    }

}
