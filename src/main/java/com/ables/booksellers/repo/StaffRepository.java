/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.repo;

import com.ables.booksellers.model.Staff;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ables
 */
@Repository
public interface StaffRepository extends CrudRepository<Staff, Long>{
    public List<Staff> findByFirstName(String firstName);
    public List<Staff> findByLastName(String lastName);
    public List<Staff> findByfirstNameAndLastName(String firstName, String lastName);
    public Staff findByStaffId(String staffId);
    public Staff findByUsername(String username);
    
    
}
