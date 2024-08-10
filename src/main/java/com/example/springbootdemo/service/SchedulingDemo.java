package com.example.springbootdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SchedulingDemo {

    @Scheduled(fixedRate = 5000)
    public void scheduledLogging() {
        log.info("logged in scheduled task!!!");
    }
}
