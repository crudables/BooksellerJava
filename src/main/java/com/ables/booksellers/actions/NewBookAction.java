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

@ResultPath("/WEB-INF/views/jsp/admin")
@Results({
@Result(name = "success", location = "newbook.jsp")
})
public class NewBookAction extends ActionSupport{
    @Action("/new")
 public String newBook(){
     System.out.println("showing new book");
     return SUCCESS;
 }
}
