package org.cabSystem;

import org.cabSystem.config.SmsConfig;
import org.cabSystem.model.RosterList;
import org.cabSystem.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@EnableJpaRepositories(basePackages = "org.cabSystem.repository")
@EntityScan(basePackages = "org.cabSystem.model")
@ComponentScan({ "org.cabSystem.repository" })
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] s) {

        System.setProperty("spring.profiles.active", "mysql");
        ApplicationContext context = SpringApplication.run(SmsConfig.class, s);
        EmpService empService = context.getBean(EmpService.class);
        long count = empService.getCountOfAllEmp();
        System.out.println(count);
        Scanner rosterList = new Scanner(System.in);
        System.out.println("Enter Your Employe Id");
        String empId = rosterList.nextLine();
        // System.out.println("Enter Your cabId :");
        // String cabId = rosterList.nextLine();
        System.out.println("Enter your route :");
        String routeAllocate = rosterList.nextLine();
        System.out.println("Enter dateFrom :");
        String dateFrom = rosterList.nextLine();
        System.out.println("Enter Your dateTo :");
        String dateTo = rosterList.nextLine();
        System.out.println("Select your Shift ");
        String shift = rosterList.next();

        empService.addNewRoster(new RosterList(empId, routeAllocate, dateFrom, dateTo, shift));
        System.out.println("data saved");
        // empService.dataDelete();
        // System.out.println("Data Deleted");

    }

}
