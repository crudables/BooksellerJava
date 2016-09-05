/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.bookseller.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author ables
 */
public class SpringWebAppInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext anc = new AnnotationConfigWebApplicationContext();
        anc.register(ApplicationContextConfig.class);
        ServletRegistration.Dynamic dispatcher = sc.addServlet("springdispatcher", new DispatcherServlet(anc));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
    
}
