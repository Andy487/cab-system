package org.cabsystem.config;

import org.cabsystem.repository.RosterRepository;
import org.cabsystem.service.DataService;
import org.cabsystem.service.DatabaseDataServiceImpl;
import org.cabsystem.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@EnableJpaRepositories( basePackages = "org.cabsystem.repository" )
@EntityScan(basePackages = "org.cabsystem.model")
//@ComponentScan({"org.cabSystem.*"})
@Import({H2DBConfig.class,MySqlConfig.class})
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "org.cabsystem")
@Configuration
public class SmsConfig {

    @Autowired
    RosterRepository repository;

    @Autowired
    DataSource dataSource;

    @Bean
    public DataService dataService() {
        DataService service = new DatabaseDataServiceImpl(repository);
        return service;
    }

    @Bean
    public EmpService empService(){
        return new EmpService();
    }
}
