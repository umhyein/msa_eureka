package com.example.msa_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaEurekaApplication.class, args);
    }

}
