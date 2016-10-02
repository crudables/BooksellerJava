/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author ables
 */
@Action("act")
@ResultPath("/WEB-INF/views/jsp/admin/")
@Results({
@Result(name = "submit", location = "allbooks.jsp"),
@Result(name = "form", location = "newbook.jsp")
})

public class ActAction extends ActionSupport{
    private String type;
    String result;
    public String execute(){
        System.out.println("type is :"+type);
        switch(type){
        case "submit":
            System.out.println("Submitting a form");
            type = " Show book list";
            break;
        case "form":
            System.out.println("Showing book form");
            type = "form";
        }
        return type;
    }
    
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
