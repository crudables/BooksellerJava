/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ables
 */
@Entity
public class Users implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
  protected   String firstName;
   protected String lastName;
   protected String username;
  protected String password;
 
}
