/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.bookseller.service;

import com.ables.bookseller.repo.AddressRepository;
import com.ables.bookseller.repo.BookRepository;
import com.ables.bookseller.repo.CartRepository;
import com.ables.bookseller.repo.CategoryRepository;
import com.ables.bookseller.repo.CustomerRepository;
import com.ables.booksellers.model.Address;
import com.ables.booksellers.model.Book;
import com.ables.booksellers.model.Cart;
import com.ables.booksellers.model.Category;
import com.ables.booksellers.model.Customer;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ables
 */
@Service
@Repository
@Transactional
public class PersistenceServiceImpl implements PersistenceService{
    @Autowired
    BookRepository bookRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CartRepository cartRepository;
    public void registerBook(Book book){
        Book findBook = bookRepository.findByIsbn(book.getIsbn());
        if(findBook == null ){
        bookRepository.save(book);
        }
    }
    
    public void registerAdd(Address address){
    Address add = addressRepository.findByMobilePhoneAndEmailAndHomeAddress(address.getMobilePhone(), address.getEmail(), address.getHomeAddress());
    if(add == null){
    addressRepository.save(address);
    }
    }
    
    public void persistCustomer(Customer customer){
    customerRepository.save(customer);
    }
    
    public void persistCategory(Category category){
    Category cat = categoryRepository.findByName(category.getName());
    if(cat == null){
    categoryRepository.save(category);
    }
    }
    
    public void persistCart(Cart cart){
        Objects.requireNonNull(cart, "cart object cannot be null");
        cartRepository.save(cart);
    }
    
    
}