/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ables
 */
@Entity
public class Staff extends Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String staffId;

    public Staff(){}
    public Staff(String staffId,String firstName,String lastName,String username, String password) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    String nextOfKin;
    
    
}
