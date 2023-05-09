/**
 * 
 */
package com.springmeal.backend.service;

import java.sql.Date;
import java.util.List;

import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.Slot;
import com.springmeal.backend.dto.User;

/**
 * @author Palmira
 *
 */
public interface IOrderService {

	// CRUD Methods
	public List<Order> listOrder();

	public Order saveOrder(Order order);

	public Order findById(int id);

	public Order updateOrder(Order order);

	public void deleteOrder(int id);

	public List<Order> findByUser(User user);

	public List<Order> findByDate(Date date, String cmp);

	public List<Order> findByUserDate(User user, Date date, String cmp);

	public List<Order> findBySlotDate(Slot slot, Date date);
}
