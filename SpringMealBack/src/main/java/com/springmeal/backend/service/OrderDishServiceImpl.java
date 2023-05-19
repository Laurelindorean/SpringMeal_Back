/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IOrderDishDAO;
import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.OrderDish;

/**
 * @author Palmira
 *
 */
@Service
public class OrderDishServiceImpl implements IOrderDishService {

	@Autowired
	IOrderDishDAO iOrderDishDAO;

	@Override
	public List<OrderDish> listOrderDish() {
		return iOrderDishDAO.findAll();
	}

	@Override
	public OrderDish saveOrderDish(OrderDish orderDish) {
		return iOrderDishDAO.save(orderDish);
	}

	@Override
	public OrderDish findById(int id) {
		return iOrderDishDAO.findById(id).get();
	}

	@Override
	public OrderDish updateOrderDish(OrderDish orderDish) {
		return iOrderDishDAO.save(orderDish);
	}

	@Override
	public void deleteOrderDish(int id) {
		iOrderDishDAO.deleteById(id);
	}

	@Override
	public List<OrderDish> findByOrder(Order order) {
		return iOrderDishDAO.findByOrder(order);
	}

}
