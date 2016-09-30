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
@Result(name = "success",location = "category.jsp")
public class NewcatAction extends ActionSupport{
    @Action()
    public String newCat(){
        System.out.println("Shiud register new cat");
    return SUCCESS;
    }
}
