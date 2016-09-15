/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

/**
 *
 * @author ables
 */
@Entity
@Component("customer")
public class Customer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
     private String firstName;
    private String lastName;
    private String username;
   @Column(unique = true)
   private String password;
    
    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> address = new ArrayList<>();
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

    public List getAddress() {
        return address;
    }

    public void setAddress(List address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }
    
    
           @Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Staff other = (Staff) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (username == null) {
		if (other.getUsername() != null)
			return false;
	} else if (!username.equals(other.getUsername()))
		return false;
	return true;
}

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
