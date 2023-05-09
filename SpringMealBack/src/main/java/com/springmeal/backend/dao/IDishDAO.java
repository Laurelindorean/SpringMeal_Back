/**
 * 
 */
package com.springmeal.backend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springmeal.backend.dto.Category;
import com.springmeal.backend.dto.Dish;

/**
 * @author aitor, joan
 *
 */
public interface IDishDAO extends JpaRepository<Dish, Integer> {
    @Autowired
    List<Dish> findByName(String name);
    
    @Autowired
    List<Dish> findByCategory(Category category);
    
    @Query(value = "SELECT * FROM dish WHERE name LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
    List<Dish> findByPartialName(String partial_name);

}
