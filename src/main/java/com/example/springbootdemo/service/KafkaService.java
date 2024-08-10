package com.example.springbootdemo.service;

import com.example.springbootdemo.kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {

    @Autowired
    private KafkaProducer kafkaProducer;

    public void sendNotification(String message) {
        kafkaProducer.sendNotification(message);
        log.info("Message placed successfully");
    }
}
