/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 *
 * @author ables
 */
@Namespace("/")
@ResultPath("/WEB-INF/views/jsp/")
public class AdminAction extends ActionSupport{
 
    @Action("newbook",results = {@Result("success")})
    public String showpage(){
    
    }
}