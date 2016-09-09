/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.bookseller.config;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author ables
 */
@Configuration
@ComponentScan("com.ables.bookseller")
@EnableTransactionManagement
public class AppContextConfig {
    
    @Bean(name = "viewResolver")
public InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/views/jsp/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
}

@Bean(name = "dataSource")
public DataSource getDataSource() {
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName("org.postgresql.Driver");
    dataSource.setUrl("jdbc:postgresql://localhost:5432/BookSeller?currentSchema=App");
    dataSource.setUsername("ables");
    dataSource.setPassword("quietstorm");
 
    return dataSource;
}


@Bean
   public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
      LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
      em.setDataSource(getDataSource());
      em.setPackagesToScan(new String[] { "com.ables.bookseller.model" });
 
      JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
      em.setJpaVendorAdapter(vendorAdapter);
      em.setJpaProperties(additionalProperties());
 
      return em;
   }
   
   
   @Bean
   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(emf);
 
      return transactionManager;
   }
   
    Properties additionalProperties() {
      Properties properties = new Properties();
      properties.setProperty("hibernate.hbm2ddl.auto", "update");
      properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL82Dialect");
      properties.setProperty("hibernate.show_sql", "true");
      return properties;
   }
}
