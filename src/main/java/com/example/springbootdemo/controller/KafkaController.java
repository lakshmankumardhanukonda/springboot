package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Notification;
import com.example.springbootdemo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping(value = "/send-message/{message}")
    public String sendNotification(@PathVariable String message) {
        kafkaService.sendNotification(message);
        return "Message sent successfully";
    }
}
