package com.springcloud.test.teigninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TeigninfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeigninfoApplication.class, args);
    }

}
