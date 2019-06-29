package com.haiqiang.springcloudeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurakaApplication.class, args);
    }

}
