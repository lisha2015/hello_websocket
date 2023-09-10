package com.example.demo.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    WebSocketServer webSocketServer;

    @GetMapping("/hello")
    public String hello(){
        webSocketServer.sendOneMessage("admin", "hello world");
        return "hello world";
    }
}
