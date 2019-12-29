package com.springcloud.test.ribbonclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ribbonclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ribbonclient2Application.class, args);
    }

}
