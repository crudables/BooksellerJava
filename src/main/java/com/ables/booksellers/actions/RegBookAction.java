/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ables
 */
public class RegBookAction extends ActionSupport{
    public String execute(){
        System.out.println("his shud store book");
    return SUCCESS;
}
}
