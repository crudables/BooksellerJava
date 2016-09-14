/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.config;

import com.vaadin.spring.server.SpringVaadinServlet;
import java.util.Objects;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author ables
 */
public class WebInit implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.scan(WebApplicationInitializer.class.getPackage().getName());
        sc.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = sc.addServlet("vaadin", SpringVaadinServlet.class);
        Objects.requireNonNull(dispatcher, "Dispatcher cannot be null");
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
        System.out.println("dddddddddddddddddd");
    }
    
    
}
