/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.controller;

import com.ables.booksellers.model.Book;
import com.ables.booksellers.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ables
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    PersistenceService ps;
    @RequestMapping(value = "/")
    public String showIndex(ModelMap map) {
//        ModelAndView mv = new ModelAndView("index");
//        mv.setViewName("index");
        System.out.println("in the controller nowwww?");
        return "admin/admin";
    }
    public String newBook(@ModelAttribute()Book book,ModelMap map){
    return "";
    }
}
