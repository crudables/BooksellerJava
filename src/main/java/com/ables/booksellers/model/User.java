/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ables
 */
@Entity
public class User implements Serializable{
  protected  String firstName;
   protected String lastName;
   @Id
   protected String username;
  protected String password;
   protected Address address;
}
