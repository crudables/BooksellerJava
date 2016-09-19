/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.ui;

import com.ables.booksellers.model.Address;
import com.ables.booksellers.model.Customer;
import com.ables.booksellers.service.PersistenceServiceImpl;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import javax.servlet.annotation.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ables
 */
@Component
@SpringUI
@Theme("valo")
public class VaadinUI extends UI{
    
    
    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false,ui=VaadinUI.class)
//            , initParams = {
//            @WebInitParam(name = "ui", value = "com.ables.booksellers.ui.VaadinUI"),
//            @WebInitParam(name = "productionMode", value = "false") }
//    )
    public static class Servlet extends VaadinServlet {
    }
    
    
    Button but;
    String firstName;
    String lastName;
    String username;
    String password;
    String mobilePhone;
    String homAdd;
    String email;
    TextField firstNameF, lastNameF, usernameF,passwordF,mobileF,emailF,homeAddF;
    @Autowired
    private PersistenceServiceImpl psi;
    @Override
    protected void init(VaadinRequest request) {
//        getPage().setTitle("My first vaadin");
//        
//        HorizontalLayout layout = new HorizontalLayout();
//        layout.addComponent(new Label("Next Button"), 0);
//        
//        Button but = new Button();
//        but.setIcon(FontAwesome.BOOK);
//        but.addClickListener(new Button.ClickListener() {
//
//            @Override
//            public void buttonClick(Button.ClickEvent event) {
//                Notification not = new Notification("Seen", "Show");
//                not.show(getPage());
//            }
//        });
//        layout.addComponent(but);
//	    setContent(layout);
        
        createUI();
    }
    
    private void createUI(){
    VerticalLayout mainVLayout = new VerticalLayout();
        setContent(mainVLayout);
        GridLayout gl = new GridLayout(5,5);
        
        GridLayout gl2 = new GridLayout(4, 4);
        
         Label firstLabel = new Label("First Name");
         firstNameF = new TextField();
        Label lastLabel = new Label("Last Name");
         lastNameF = new TextField();
        Label userLabel = new Label("Username");
         usernameF = new TextField();
        Label passLabel = new  Label("Password");
        passwordF = new TextField();
         but = new Button("Submit");
         but.addClickListener(new Button.ClickListener() {

        @Override
        public void buttonClick(Button.ClickEvent event) {
            submitData();
        }
    });
        
        
        Label mobLabel = new Label("Mobile Number");
         mobileF = new TextField();
        Label emLabel = new Label("Email");
         emailF = new TextField();
        Label homLabel = new Label("Home Add");
         homeAddF = new TextField();
        
        gl2.addComponent(mobLabel, 0, 0);
        gl2.addComponent(mobileF, 1, 0);
        gl2.addComponent(emLabel, 0, 1);
        gl2.addComponent(emailF, 1, 1);
        gl2.addComponent(homLabel, 0, 2);
        gl2.addComponent(homeAddF, 1, 2);
        
        gl.addComponent(firstLabel, 0, 0);
        gl.addComponent(firstNameF, 1, 0);
        gl.addComponent(lastLabel, 0, 1);
        gl.addComponent(lastNameF,1,1);
        gl.addComponent(userLabel, 0, 2);
        gl.addComponent(usernameF, 1, 2);
        gl.addComponent(passLabel, 0, 3);
        gl.addComponent(passwordF,1,3);
        gl.addComponent(but, 1, 4);
        mainVLayout.addComponent(gl);
        mainVLayout.setSpacing(true);
        mainVLayout.addComponent(gl2);
        
        
        
        
    }
    
    private void getDat(){
    firstName = firstNameF.getValue();
    lastName = lastNameF.getValue();
    username = usernameF.getValue();
    password = passwordF.getValue();
    mobilePhone = mobileF.getValue();
    email = emailF.getValue();
    homAdd = homeAddF.getValue();
        
    }
    private void submitData(){
        getDat();
        Customer cus = new Customer(firstName, lastName, username, password);
        Address add = new Address(email, mobilePhone, homAdd);
        cus.getAddress().add(add);
        System.out.println("got here");
                
    
    }
}

