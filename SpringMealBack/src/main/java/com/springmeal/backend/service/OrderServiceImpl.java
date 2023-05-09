/**
 * 
 */
package com.springmeal.backend.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IOrderDAO;
import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.Slot;
import com.springmeal.backend.dto.User;

/**
 * @author Palmira
 *
 */
@Service
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
	public Order findById(int id) {
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

	@Override
	public List<Order> findByUser(User user) {
		return iOrderDAO.findByUser(user);
	}
	
	@Override
	public List<Order> findByDate(Date date, String cmp) {
		return iOrderDAO.findByDate(date, cmp);
	}

	@Override
	public List<Order> findByUserDate(User user, Date date, String cmp) {
		return iOrderDAO.findByUserDate(user.getId(), date, cmp);
	}

	@Override
	public List<Order> findBySlotDate(Slot slot, Date date) {
		return iOrderDAO.findBySlotDate(slot.getId(), date);
	}

}
