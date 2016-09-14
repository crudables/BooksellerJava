/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import org.springframework.stereotype.Component;

/**
 *
 * @author ables
 */
@Component
@SpringUI()
@Theme("valo")
public class VaadinUI extends UI{
    
    @WebServlet(value = "/*", asyncSupported = true, initParams = {
            @WebInitParam(name = "ui", value = "com.ables.booksellers.ui.VaadinUI"),
            @WebInitParam(name = "productionMode", value = "false") })
    public static class Servlet extends VaadinServlet {
    }
    
    @Override
    protected void init(VaadinRequest request) {
        System.out.println("ffffffffffff");
	    setContent(new Button("Click me"));
    }
}
