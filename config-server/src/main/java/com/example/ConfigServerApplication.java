package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication(scanBasePackages={"com.example.demo", "com.example"})

public class ConfigServerApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
     
}