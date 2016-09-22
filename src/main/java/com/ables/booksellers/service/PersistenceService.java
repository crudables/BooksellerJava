/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.service;

import com.ables.booksellers.model.Address;
import com.ables.booksellers.model.Book;
import com.ables.booksellers.model.Cart;
import com.ables.booksellers.model.Category;
import com.ables.booksellers.model.Customer;
import com.ables.booksellers.model.Staff;

/**
 *
 * @author ables
 */
public interface PersistenceService {
    //define methods for customer
    
    public Customer createCustomer(Customer customer);
    public Customer editCustomer(Customer customer);
    //method definition for staff
   public Staff createStaff(Staff staff);
    public Staff editStaff(Staff staff);
    
    //definition for address methods
    
    public Address createAddress(Address a);
    public Address editAddress(Address address);
    
    //definitions for category
    
     public Category createCategory(Category c);
    public Category editCategory(Category category); 
    
    //definition for book method
    
   public Book createBook(Book b);
 public Book editBook(Book b);
 
 //definition for cart
 
    public Cart createCart(Cart c);
    public Cart editCart(Cart c);
}
