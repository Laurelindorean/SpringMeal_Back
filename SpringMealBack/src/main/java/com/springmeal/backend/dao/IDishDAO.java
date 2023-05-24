/**
 * 
 */
package com.springmeal.backend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springmeal.backend.dto.Dish;

/**
 * @author aitor, joan, palmira
 *
 */
public interface IDishDAO extends JpaRepository<Dish, Integer> {
    
	@Autowired
    List<Dish> findByName(String name);
    @Autowired
    Page<Dish> findAll(Pageable pageable);
    
    @Autowired
    Page<Dish> findByCategoryName(String category, Pageable pageable);
    
    @Query(value = "SELECT * FROM dish WHERE LOWER(name) LIKE CONCAT('%', LOWER(?1), '%')", nativeQuery = true)
    List<Dish> findByPartialName(String partial_name);

    @Query(value = "SELECT * FROM dish WHERE id_category = ?1 AND name LIKE CONCAT('%', LOWER(?2), '%')", nativeQuery = true)
    List<Dish> findByCategoryPartialName(int id_category, String partial_name);

}
