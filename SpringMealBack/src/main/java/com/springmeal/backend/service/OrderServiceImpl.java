/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmeal.backend.dao.IOrderDAO;
import com.springmeal.backend.dto.Order;

/**
 * @author Palmira
 *
 */
public class OrderServiceImpl implements IOrderService {

	@Autowired
	IOrderDAO iOrderDAO;

	@Override
	public List<Order> listOrder() {
		return iOrderDAO.findAll();
	}

	@Override
	public Order saveOrder(Order order) {
		return iOrderDAO.save(order);
	}

	@Override
	public Order orderById(int id) {
		return iOrderDAO.findById(id).get();
	}

	@Override
	public Order updateOrder(Order order) {
		return iOrderDAO.save(order);
	}

	@Override
	public void deleteOrder(int id) {
		iOrderDAO.deleteById(id);
	}

}
