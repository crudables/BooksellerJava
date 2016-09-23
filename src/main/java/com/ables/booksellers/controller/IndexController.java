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
@RequestMapping(value = "/")
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(ModelMap mm) {
        System.out.println("in the controlller now?");
        mm.addAttribute("name", "my name");
        return "index";
    }
}
