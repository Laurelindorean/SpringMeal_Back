/**
 * 
 */
package com.springmeal.backend.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Order;
import com.springmeal.backend.service.OrderServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	OrderServiceImpl orderServiceImpl;

	@GetMapping("/orders")
	public List<Order> listOrder() {
		return orderServiceImpl.listOrder();
	}

	@PostMapping("/orders")
	public Order saveOrder(@RequestBody Order order) {
		return orderServiceImpl.saveOrder(order);
	}

	@GetMapping("/orders/{id}")
	public Order findById(@PathVariable(name = "id") int id) {
		Order order_id = new Order();
		order_id = orderServiceImpl.findById(id);
		return order_id;
	}
	
	@GetMapping("/orders/date/{date}")
	public List<Order> findByDate(@PathVariable(name = "date") Date date) {
		return orderServiceImpl.findByDate(date);
	}

	@PutMapping("/orders/{id}")
	public Order updateOrder(@PathVariable(name = "id") int id, @RequestBody Order order) {
		Order order_sel = new Order();
		order_sel = orderServiceImpl.findById(id);
		order_sel.setDate(order.getDate());
		order_sel.setSlot(order.getSlot());
		// this line has an error because we haven't implemented the User Entity yet
		order_sel.setUser(order.getUser());
		return orderServiceImpl.updateOrder(order_sel);
	}

	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable(name = "id") int id) {
		orderServiceImpl.deleteOrder(id);
	}
}
