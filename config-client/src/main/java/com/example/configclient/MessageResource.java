package com.example.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {

    @Value("${message: Go to (http://localhost:8080/rest/message) to see if the server works. /n if this appears, the client works but the server is not refreshing.}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}