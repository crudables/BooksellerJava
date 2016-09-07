/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ables
 */
public class Customer extends Users{
    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set address;
     @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
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

    public Set getAddress() {
        return address;
    }

    public void setAddress(Set address) {
        address = new HashSet();
        this.address = address;
    }

    public Long getId() {
        return id;
    }
    
}
