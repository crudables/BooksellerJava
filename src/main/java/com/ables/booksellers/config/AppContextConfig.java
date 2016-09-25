/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.config;

import com.jolbox.bonecp.BoneCPDataSource;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author ables
 */
@Configuration
@ComponentScan(basePackages = {"com.ables.booksellers"})
@EnableTransactionManagement
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"com.ables.booksellers.repo"})
public class AppContextConfig extends WebMvcConfigurerAdapter{
    
    @Bean(name = "viewResolver")
public InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setViewClass(JstlView.class);
    viewResolver.setPrefix("/WEB-INF/views/jsp/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
}

@Bean(destroyMethod = "close")
public BoneCPDataSource getDataSource() {
    BoneCPDataSource dataSource = new BoneCPDataSource();
    dataSource.setDriverClass("org.postgresql.Driver");
    dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/BookSeller");
    dataSource.setUsername("ables");
    dataSource.setPassword("quietstorm");
 
    return dataSource;
}


@Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
      LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
      em.setDataSource(getDataSource());
      em.setPackagesToScan("com.ables.booksellers.model");
      JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
      em.setJpaVendorAdapter(vendorAdapter);
      em.setJpaProperties(additionalProperties());
 
      return em;
   }
   
   
   @Bean
   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
 
      return transactionManager;
   }
   @Bean
   public Properties additionalProperties() {
      Properties properties = new Properties();
      properties.setProperty("hibernate.hbm2ddl.auto", "update");
      properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL82Dialect");
      properties.setProperty("hibernate.show_sql", "true");
      return properties;
   }
    
//   
   @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
                        .addResourceLocations("/resources/");
}
        
        @Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
        
//         @Bean
//    public TilesConfigurer tilesConfigurer(){
//        TilesConfigurer tilesConfigurer = new TilesConfigurer();
//        tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/views/**/tiles.xml"});
//        tilesConfigurer.setCheckRefresh(true);
//        return tilesConfigurer;
//    }
//    
//     @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        TilesViewResolver viewResolver = new TilesViewResolver();
//        registry.viewResolver(viewResolver);
//    }
}