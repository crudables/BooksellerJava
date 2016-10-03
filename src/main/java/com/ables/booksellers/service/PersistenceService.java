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
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author ables
 */
public interface PersistenceService {
    //define methods for customer
    
    public Customer createCustomer(Customer customer);
    public Customer editCustomer(Customer customer);
    public List<Customer> findCustomerByFirstName(String name);
    public List<Customer> findCustByLastName(String lastname);
    public List<Customer> findCustByFirstAndLast(String first, String last);
    public List<Customer> fetchAllCustomer();
    //method definition for staff
   public Staff createStaff(Staff staff);
    public Staff editStaff(Staff staff);
    public List<Staff> findStaffByFirstName(String firstName);
    public List<Staff> findStaffByLastName(String lastName);
    public List<Staff> findStaffByFirstAndLast(String first, String last);
    public Staff findStaffById(Long id);
    public Staff findStaffByUsername(String username);
    public List<Staff> fetchAllStaff();
    
    //definition for address methods
    
    public Address createAddress(Address a);
    public Address editAddress(Address address);
    public List<Address> findAddByPhone(String phone);
    public List<Address> findAddByEmail(String email);
    public Address findAddByThree(String phone,String email,String add);
    public Address findAddById(Long id);
    
    //definitions for category
    
     public Category createCategory(Category c);
    public Category editCategory(Category category); 
        public Category findCatById(Long id);
    public Category findCatByName(String name);
    public List<Category> fetchAllCategory();
    
    //definition for book method
    
   public Book createBook(Book b);
 public Book editBook(Book b);
 public Book findBookById(Long id);
 public List<Book> findBookByTitle(String title);
 public List<Book> findBookByAuthor(String author);
 public List<Book> findBookByPublisher(String publisher);
 public List<Book> findBookByReleasedDate(LocalDateTime date);
 public List<Book> findBookByCreatedDate(LocalDateTime date);
 public Book findBookByIsbn(String isbn);
 public List<Book> findBookByCategory(String category);
 public List<Book> fetchAllBook();
 
 
 //definition for cart
 
    public Cart createCart(Cart c);
    public Cart editCart(Cart c);
    public Cart findCartById(Long id);
    public List<Cart> fetchAllCart();

}
