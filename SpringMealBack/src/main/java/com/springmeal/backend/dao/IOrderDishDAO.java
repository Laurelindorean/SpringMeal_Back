/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.OrderDish;
import java.util.List;


/**
 * @author Palmira, Joan
 *
 */
public interface IOrderDishDAO extends JpaRepository<OrderDish, Integer>{
    List<OrderDish> findByOrder(Order order);
}
