/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Dish;
import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.OrderDish;
import com.springmeal.backend.service.OrderDishServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class OrderDishController {

	@Autowired
	OrderDishServiceImpl orderDishServiceImpl;

	@GetMapping("/orderdish")
	@PreAuthorize("hasRole('admin')")
	public List<OrderDish> listOrderDish() {
		return orderDishServiceImpl.listOrderDish();
	}

	@PostMapping("/orderdish")
	public ResponseEntity<OrderDish> saveOrderDish(@RequestBody OrderDish orderDish) {
		System.out.println(orderDish.getDish().getId());
		System.out.println(orderDish.getOrder().getId());
		return ResponseEntity.ok(orderDishServiceImpl.saveOrderDish(orderDish));
	}

	@GetMapping("/orderdish/{id}")
	@PreAuthorize("hasRole('admin')")
	public OrderDish findById(@PathVariable(name = "id") int id) {
		OrderDish orderDish_id = new OrderDish();
		orderDish_id = orderDishServiceImpl.findById(id);
		return orderDish_id;
	}

	@PutMapping("/orderdish/{id}")
	public OrderDish updateOrderDish(@PathVariable(name = "id") int id, @RequestBody OrderDish orderDish) {
		OrderDish orderDish_sel = new OrderDish();
		orderDish_sel = orderDishServiceImpl.findById(id);
		orderDish_sel.setDish(orderDish.getDish());
		orderDish_sel.setOrder(orderDish.getOrder());
		return orderDishServiceImpl.updateOrderDish(orderDish_sel);
	}

	@DeleteMapping("/orderdish/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteOrderDish(@PathVariable(name = "id") int id) {
		orderDishServiceImpl.deleteOrderDish(id);
	}

	@GetMapping("/orderdish/order")
	@PreAuthorize("hasRole('admin')")
	public List<Dish> findByOrder(@RequestBody Order order) {
		List<OrderDish> in = orderDishServiceImpl.findByOrder(order);
		List<Dish> out = new ArrayList<Dish>();
		for (OrderDish item : in) {
			out.add(item.getDish());
		}
		return out;

		/*
		 * List<OrderDish> in = orderDishServiceImpl.findByOrder(order); List<Dish> out
		 * = new ArrayList<Dish>(); for (OrderDish item : in) { out.add(item.getDish());
		 * } return out;
		 */

	}

}
