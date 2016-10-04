/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.springframework.data.annotation.Version;

/**
 *
 * @author ables
 */
@Entity
public class Category implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Version
    Long id;
    @Column(unique = true)
    private String name;
    private String createdDate;
    private LocalDateTime createDateL;
    private LocalDateTime updatedDateL;
    private String updatedDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name="Category_id"),inverseJoinColumns = @JoinColumn(name="Book_id"))
    private Set<Book> books = new HashSet<>();

    public Category(){
    super();
    }
    
    public Category(String name) {
        
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    
               @Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Category other = (Category) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (name == null) {
		if (other.getName() != null)
			return false;
	} else if (!name.equals(other.getName()))
		return false;
	return true;
}
    
      @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

    public LocalDateTime getCreateDateL() {
        return createDateL;
    }

    public void setCreateDateL(LocalDateTime createDateL) {
        this.createDateL = createDateL;
    }

    public LocalDateTime getUpdatedDateL() {
        return updatedDateL;
    }

    public void setUpdatedDateL(LocalDateTime updatedDateL) {
        this.updatedDateL = updatedDateL;
    }
}
