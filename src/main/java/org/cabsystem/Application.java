package org.cabsystem;

import org.cabsystem.config.SmsConfig;
import org.cabsystem.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] s) {

        System.setProperty("spring.profiles.active", "mysql");
        ApplicationContext context = SpringApplication.run(SmsConfig.class, s);
        EmpService empService = context.getBean(EmpService.class);

    }

}
