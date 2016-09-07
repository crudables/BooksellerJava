/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ables
 */
@Entity
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Map<String, Book> map;

    public Cart(){
    super();
    }
    public Cart(Map<String, Book> map) {
        super();
        this.map = map;
    }

//    public Cart(){
//    map = new HashMap();
//    }
//  
//    //add product to cart
//    @Override
//    public boolean addBook(Book b) {
//        if(map.containsKey(b.getIsbn())){
//        Book book = map.get(b.getIsbn());
//        book.setPrice(book.getPrice()+ b.getPrice());
//        book.setQuantityInCart(book.getQuantityInCart() + b.getQuantityInCart());
//        return true;
//        }
//        map.put(b.getIsbn(), b);
//        return false;
//    }
//
//    @Override
//    public boolean removeBook(String isbn)throws Exception {
//        if(map.containsKey(isbn)){
//        map.remove(isbn);
//        return true;
//        }
//        else{
//        throw new Exception("Book not found");
//        }
//    }
//
//    @Override
//    public Collection<Book> getCartDetails() {
//        return map.values();
//    }
//
//    @Override
//    public int bookCount() {
//        return map.size();
//    }
//
//    @Override
//    public Book getBookFromCart(String isbn) throws Exception {
//        if(map.containsKey(isbn)){
//        return map.get(isbn);
//        }
//        else{
//        throw new Exception("Book not found");
//        }
//    }
//
//    @Override
//    public double getCartPrice() {
//        double totalPrice = 0.0;
//        Iterator it = getCartDetails().iterator();
//        while(it.hasNext()){
//        totalPrice += ((Book)it.next()).getPrice();
//        }
//        
//        return totalPrice;
//    }
    public Long getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }
    public Map<String, Book> getMap() {
        return map;
    }

    public void setMap(Map<String, Book> map) {
        this.map = map;
    }

}
