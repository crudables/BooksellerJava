/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.bookseller.config;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author ables
 */
@Configuration
@ComponentScan("com.ables.bookseller")
@EnableTransactionManagement
public class ApplicationContextConfig {
    @Bean(name="viewResolver")
    public InternalResourceViewResolver getInterViewResolver(){
    InternalResourceViewResolver  viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("WEB-INF/views");
    viewResolver.setSuffix("jsp");
          return viewResolver;  
    }
    
    @Bean(name="dataSource")
    public DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/BookSeller");
        ds.setUsername("ables");
        ds.setPassword("quietstorm");
        return ds;
    }
//    @Bean(name="sessionFactory")
//    public SessionFactory getSessionFactory(DataSource ds){
//        LocalSessionFactoryBuilder sf = new LocalSessionFactoryBuilder(ds);
////        sf.addAnnotatedClasses(Book.class);
//        return sf.buildSessionFactory();
//            
//    }

    
//    @Bean(name="transactionManager")
//   public HibernateTransactionManager getTransacionManager(SessionFactory sf){
//   HibernateTransactionManager htm = new HibernateTransactionManager(sf);
//   return htm;
//   }
   
   @Bean(name="entityManagerFactory")
   public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
   LocalContainerEntityManagerFactoryBean  entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
   entityManagerFactoryBean.setDataSource(dataSource);
   entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
   entityManagerFactoryBean.setJpaDialect(new HibernateJpaDialect());
   entityManagerFactoryBean.setPackagesToScan("com.ables.bookseller.model");
   entityManagerFactoryBean.setJpaPropertyMap(hibernateJpaProperties());
   return entityManagerFactoryBean;
   }
   
   private Map<String, ?> hibernateJpaProperties() {
    HashMap<String, String> properties = new HashMap<>();
    properties.put("hibernate.hbm2ddl.auto", "create");
    properties.put("hibernate.show_sql", "false");
    properties.put("hibernate.format_sql", "false");
    properties.put("hibernate.hbm2ddl.import_files", "insert-data.sql");
    properties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
     
    properties.put("hibernate.c3p0.min_size", "2");
    properties.put("hibernate.c3p0.max_size", "5");
    properties.put("hibernate.c3p0.timeout", "300"); // 5mins
     
    return properties;
   }
   
   @Bean(name="transactionManager")
   public JpaTransactionManager transactionManager(EntityManagerFactory emf){
   JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
   return transactionManager;
   }
}
