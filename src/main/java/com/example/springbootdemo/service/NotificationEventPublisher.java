package com.example.springbootdemo.service;

import com.example.springbootdemo.model.NotificationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishNotificationEvent(final String message) {
        log.info("Notification Event Published");
        NotificationEvent notificationEvent = new NotificationEvent(this, message);
        applicationEventPublisher.publishEvent(notificationEvent);
    }
}
