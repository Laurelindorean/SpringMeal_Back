/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Dish;

/**
 * @author aitor
 *
 */
public interface IDishDAO extends JpaRepository<Dish, Integer> {

}
