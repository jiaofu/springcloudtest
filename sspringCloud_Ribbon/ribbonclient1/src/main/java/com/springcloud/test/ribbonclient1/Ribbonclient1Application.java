package com.springcloud.test.ribbonclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ribbonclient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ribbonclient1Application.class, args);
    }

}
