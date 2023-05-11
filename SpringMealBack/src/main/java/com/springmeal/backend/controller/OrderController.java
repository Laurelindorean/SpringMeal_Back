/**
 * 
 */
package com.springmeal.backend.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.Slot;
import com.springmeal.backend.dto.User;
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
	@PreAuthorize("hasRole('admin')")
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

	@PutMapping("/orders/{id}")
	@PreAuthorize("hasRole('admin')")
	public Order updateOrder(@PathVariable(name = "id") int id, @RequestBody Order order) {
		Order order_sel = new Order();
		order_sel = orderServiceImpl.findById(id);
		order_sel.setDate(order.getDate());
		order_sel.setSlot(order.getSlot());
		order_sel.setUser(order.getUser());
		return orderServiceImpl.updateOrder(order_sel);
	}

	@DeleteMapping("/orders/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteOrder(@PathVariable(name = "id") int id) {
		orderServiceImpl.deleteOrder(id);
	}

	@GetMapping("/orders/user")
	public List<Order> findByUser(@RequestBody User user) {
		return orderServiceImpl.findByUser(user);
	}
	
	@GetMapping("/orders/date/{date}")
	public List<Order> findByDate(@PathVariable("date") Date date) {
		return orderServiceImpl.findByDate(date, "=");
	}
	@GetMapping("/orders/future")
	public List<Order> findByDate() {
		Date date = new Date(System.currentTimeMillis());
		return orderServiceImpl.findByDate(date, ">=");
	}

	@GetMapping("/orders/user/date/{date}")
	public List<Order> findByUserDate(@RequestBody User user, @PathVariable("date") Date date) {
		return orderServiceImpl.findByUserDate(user, date, "=");
	}

	@GetMapping("/orders/user/future")
	public List<Order> findByUserDate(@RequestBody User user) {
		Date date = new Date(System.currentTimeMillis());
		return orderServiceImpl.findByUserDate(user, date, ">=");
	}

	@GetMapping("/orders/slot/date/{date}")
	public List<Order> findBySlotDate(@RequestBody Slot slot, @PathVariable("date") Date date) {
		return orderServiceImpl.findBySlotDate(slot, date);
	}
}
