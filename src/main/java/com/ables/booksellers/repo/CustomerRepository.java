/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.repo;

import com.ables.booksellers.model.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ables
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
     public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByFirstNameAndLastName(String firstName, String LastName);

}
