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

/**
 *
 * @author ables
 */
@ResultPath("/WEB-INF/views/jsp/admin/")
@Result(name = "success", location = "newbook.jsp")
public class NewBookAction extends ActionSupport{
 private String type;
    
//    @Action("/newbook")
//    public String newbook(){
//    return SUCCESS;
//    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String execute(){
        System.out.println("print success");
        return SUCCESS;
    }
    
   
}
