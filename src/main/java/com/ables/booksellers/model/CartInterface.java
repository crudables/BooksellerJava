/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.util.Collection;

/**
 *
 * @author ables
 */
public interface CartInterface {
    boolean addBook(Book b);
    boolean removeBook(String isbn)throws Exception;
    Collection<Book> getCartDetails();
    Book getBookFromCart(String isbn)throws Exception;
    int bookCount();
    double getCartPrice();
    
}
