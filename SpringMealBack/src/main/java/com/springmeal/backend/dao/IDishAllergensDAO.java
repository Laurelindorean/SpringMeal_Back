/**
 * 
 */
package com.springmeal.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Dish;
import com.springmeal.backend.dto.DishAllergens;

/**
 * @author aitor, joan
 *
 */
public interface IDishAllergensDAO extends JpaRepository<DishAllergens, Integer> {
    List<DishAllergens> findByDish(Dish dish);
}
