/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.model;

import java.io.Serializable;
import java.time.Clock;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ables
 */
@Entity
public class Category implements Serializable{
    private String name;
    private Clock createdDate;
    private Clock updatedDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clock getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Clock createdDate) {
        this.createdDate = createdDate;
    }

    public Clock getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Clock updatedDate) {
        this.updatedDate = updatedDate;
    }
}
