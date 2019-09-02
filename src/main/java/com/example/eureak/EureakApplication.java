package com.example.eureak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureakApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureakApplication.class, args);
    }

}
