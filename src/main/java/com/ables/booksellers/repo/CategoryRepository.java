/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.repo;

import com.ables.booksellers.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ables
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
    public Category findById(Long id);
    public Category findByName(String name);
}
