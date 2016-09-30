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
//@Namespace("admin")
@ResultPath("/WEB-INF/views/jsp/")
@Results({@Result(location = "admin.jsp",name = "success")
})

public class AdminAction extends ActionSupport{
    
    @Action("/admin")
 public String showAdmin(){
        System.out.println("Showing admin");
 return SUCCESS;
 }
 
}
