/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.bookseller.config;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
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
        ds.setDriverClassName("jdbc:postgresql://localhost:5432/BookSeller");
        ds.setUsername("ables");
        ds.setPassword("quietstorm");
        return ds;
    }
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource ds){
        LocalSessionFactoryBuilder sf = new LocalSessionFactoryBuilder(ds);
//        sf.addAnnotatedClasses(Book.class);
        return sf.buildSessionFactory();
            
    }

    
    @Bean(name="transactionManager")
   public HibernateTransactionManager getTransacionManager(SessionFactory sf){
   HibernateTransactionManager htm = new HibernateTransactionManager(sf);
   return htm;
   }
}
