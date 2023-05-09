/**
 * 
 */
package com.springmeal.backend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Category;
import com.springmeal.backend.dto.Dish;

/**
 * @author aitor
 *
 */
public interface IDishDAO extends JpaRepository<Dish, Integer> {
    @Autowired
    List<Dish> findByName(String name);
    
    @Autowired
    List<Dish> findByCategory(Category category);

}
