package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@SpringBootApplication
@RestController
@RefreshScope

public class ConfigServerApplication {
	
	@Value("${message: Using key datasource-driver-class-name in the client.}")
	private String message;

	@RequestMapping("/showconfig")
	String message() {
		return message;
	}
	
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);             
    }    
}