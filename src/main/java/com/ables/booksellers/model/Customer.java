/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ables
 */
@Entity
public class Customer extends Users{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(targetEntity = Address.class)
    private List address;
     @OneToOne
    private Cart cart;

    public Customer() {
        super();
    }

    public Customer(String firstName,String lastName, String username, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List getAddress() {
        return address;
    }

    public void setAddress(List address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }
    
}
