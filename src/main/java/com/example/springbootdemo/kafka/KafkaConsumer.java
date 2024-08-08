package com.example.springbootdemo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "notification_topic", groupId = "notification_group")
    public void listenToNotification(String message) {
        log.info("Message received successfully");
        log.info("Message :: " + message);
    }
}
