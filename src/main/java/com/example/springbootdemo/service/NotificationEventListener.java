package com.example.springbootdemo.service;

import com.example.springbootdemo.model.NotificationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationEventListener implements ApplicationListener<NotificationEvent> {


    @Override
    public void onApplicationEvent(NotificationEvent event) {
        log.info("Notification Event Listened");
        log.info("message :: " + event.getMessage());
    }
}
