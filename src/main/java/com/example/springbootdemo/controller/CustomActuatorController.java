package com.example.springbootdemo.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customActuator")
public class CustomActuatorController {

    @ReadOperation
    public String getCurrentDatabaseStatus() {
        return "Current Database status of application";
    }
}
