/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ables
 */
@Entity
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String title;
    private String author;
    @Column(unique = true)
    private String isbn;
    private String publisher;
    private String lang;
    private double price;
    private double oldPrice;
    private boolean active;
    private SimpleDateFormat createDate;
    private SimpleDateFormat updateDate;
    private String about;
    private SimpleDateFormat releaseDate;
    private String imageLocation;
    private int quantityOrdered;
    private int quantityInStock;
    private int quantityInCart;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return lang;
    }

    public void setLanguage(String language) {
        this.lang = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public SimpleDateFormat getCreateDate() {
        return createDate;
    }

    public void setCreateDate(SimpleDateFormat createDate) {
        this.createDate = createDate;
    }

    public SimpleDateFormat getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(SimpleDateFormat updateDate) {
        this.updateDate = updateDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public SimpleDateFormat getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(SimpleDateFormat releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
//        return "Book{" + "title=" + title + ", author=" + author + ", isbn=" + isbn + ", publisher=" + publisher + '}';
        return title + " with isbn "+isbn+" is written by "+author;
    }

    public int getQuantityInCart() {
        return quantityInCart;
    }

    public void setQuantityInCart(int quantityInCart) {
        this.quantityInCart = quantityInCart;
    }
    
    
}
