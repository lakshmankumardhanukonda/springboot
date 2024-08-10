package com.example.springbootdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncDemo {

    @Async
    public void print() {
        try {
            Thread.sleep(1000);
            log.info("In AsyncDemo Class print method");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
