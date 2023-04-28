/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Order;

/**
 * @author Palmira
 *
 */
public interface IOrderDAO extends JpaRepository<Order, Integer>{

}
