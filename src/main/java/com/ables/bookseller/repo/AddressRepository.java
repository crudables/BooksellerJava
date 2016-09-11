/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.bookseller.repo;

import com.ables.booksellers.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ables
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Long>{
    public Address findByMobilePhone(String mobilePhone);
    public Address findByEmail(String email);
    public Address findById(Long id);
    public Address findByMobilePhoneAndEmailAndHomeAddress(String mobilePhone, String email, String homeAddress);
    
    
}
