/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.OrderDish;

/**
 * @author Palmira
 *
 */
public interface IOrderDishDAO extends JpaRepository<OrderDish, Integer>{

}
