/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Order;

/**
 * @author Palmira
 *
 */
public interface IOrderService {

	// CRUD Methods
	public List<Order> listOrder();

	public Order saveOrder(Order order);

	public Order orderById(int id);

	public Order updateOrder(Order order);

	public void deleteOrder(int id);
}
