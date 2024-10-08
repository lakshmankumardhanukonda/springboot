package com.example.springbootdemo.model;
import org.springframework.context.ApplicationEvent;

public class NotificationEvent extends ApplicationEvent {

    private String message;

    public NotificationEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
