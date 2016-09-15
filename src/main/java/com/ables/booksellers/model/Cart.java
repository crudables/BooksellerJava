/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.stereotype.Component;

/**
 *
 * @author ables
 */
@Entity
@Component("cart")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @MapKey()
//    private Map<String, Book> map = new HashMap<>();
    @OneToMany(targetEntity = Book.class)
    private List<Book> cart = new ArrayList<>();
    public Cart(){
    super();
    }
    public Cart(List cart) {
        super();
        cart = new ArrayList<>();
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
    
      @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
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
	return true;
}

    public List<Book> getCart() {
        return cart;
    }

    public void setCart(List<Book> cart) {
        this.cart = cart;
    }
}
