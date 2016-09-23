/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ables
 */
@Controller
@RequestMapping("/")
public class IndexController {
    
    @RequestMapping(value = "/")
    public ModelAndView showIndex() {
        ModelAndView mv = new ModelAndView("index");
        mv.setViewName("index");
        System.out.println("in the controller nowwww?");
        return mv;
    }
    @RequestMapping("/index")
    public ModelAndView home(){
    ModelAndView mv = new ModelAndView("home");
    return mv;
    }
}
