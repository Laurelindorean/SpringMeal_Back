/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.OrderDish;

/**
 * @author Palmira
 *
 */
public interface IOrderDishService {

	// CRUD Methods
	public List<OrderDish> listOrderDish();

	public OrderDish saveOrderDish(OrderDish orderDish);

	public OrderDish orderDishById(int id);

	public OrderDish updateOrderDish(OrderDish orderDish);

	public void deleteOrderDish(int id);
}
