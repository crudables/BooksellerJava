/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.service;

import com.ables.booksellers.model.Address;
import com.ables.booksellers.model.Customer;

/**
 *
 * @author ables
 */
public interface PersistenceService {
    public Customer saveCustomer(Customer customer);
//    public Address saveAdd(Address address);
}
