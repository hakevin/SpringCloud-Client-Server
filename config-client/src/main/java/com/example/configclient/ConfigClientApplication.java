package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientApplication {
//	
//	@RestController
//	@RefreshScope
//	public class MessageController {
//	@Value("${message:Hello default}")
//	private String message;
//	@RequestMapping("/message")
//	String message() {
//	return message;
//	}
//	}
//	

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}

