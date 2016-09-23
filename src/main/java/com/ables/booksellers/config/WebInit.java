/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.config;

import java.util.Objects;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author ables
 */
@EnableWebMvc
public class WebInit implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan(this.getClass().getPackage().getName());
//        context.refresh();
        context.setConfigLocation(this.getClass().getPackage().getName());
        sc.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = sc.addServlet("dispatcherservlet", new DispatcherServlet(context));
        Objects.requireNonNull(dispatcher, "Dispatcher cannot be null");
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
    
    
}
