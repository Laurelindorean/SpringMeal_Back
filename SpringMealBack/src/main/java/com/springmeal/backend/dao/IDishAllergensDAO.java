/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.DishAllergens;

/**
 * @author aitor
 *
 */
public interface IDishAllergensDAO extends JpaRepository<DishAllergens, Integer> {

}
