package org.cabSystem.config;

import org.cabSystem.model.RosterList;
import org.cabSystem.repository.CustomerRepository;
import org.cabSystem.service.DataService;
import org.cabSystem.service.DatabaseDataServiceImpl;
import org.cabSystem.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@EnableJpaRepositories( basePackages = "org.cabSystem.repository" )
@EntityScan(basePackages = "org.cabSystem.model")
@ComponentScan({"org.cabSystem.repository"})
@Import({H2DBConfig.class,MySqlConfig.class})
@Configuration
public class SmsConfig {

    @Autowired
    CustomerRepository repository;

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
