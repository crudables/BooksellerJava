/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ables
 */
@Component
public class StringToLocalDateTime {
    public LocalDateTime changeDate(String date, String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime ldt = LocalDateTime.parse(date, formatter);
        return ldt;
    }
}
