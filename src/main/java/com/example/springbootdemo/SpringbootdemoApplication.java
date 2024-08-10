package com.example.springbootdemo;

import com.example.springbootdemo.model.NotificationEvent;
import com.example.springbootdemo.service.AsyncDemo;
import com.example.springbootdemo.service.NotificationEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);

		AsyncDemo asyncDemo = (AsyncDemo) context.getBean("asyncDemo");
		asyncDemo.print();

		NotificationEventPublisher notificationEventPublisher = (NotificationEventPublisher) context.getBean("notificationEventPublisher");
		notificationEventPublisher.publishNotificationEvent("dummy notification message");
	}

}
