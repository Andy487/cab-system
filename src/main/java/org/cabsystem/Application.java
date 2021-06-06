package org.cabsystem;

import org.cabsystem.config.SmsConfig;
import org.cabsystem.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] s) {

        System.setProperty("spring.profiles.active", "h2db");
        ApplicationContext context = SpringApplication.run(SmsConfig.class, s);
        EmpService empService = context.getBean(EmpService.class);
        System.out.println("Use http://localhost:8080/rosterlist?date=20-8-2021 in browser");


    }

}
