/**
 * 
 */
package com.springmeal.backend.controller;

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
	public List<OrderDish> listOrderDish() {
		return orderDishServiceImpl.listOrderDish();
	}

	@PostMapping("/orderdish")
	public OrderDish saveOrderDish(@RequestBody OrderDish orderDish) {
		return orderDishServiceImpl.saveOrderDish(orderDish);
	}

	@GetMapping("/orderdish/{id}")
	public OrderDish orderDishById(@PathVariable(name = "id") int id) {
		OrderDish orderDish_id = new OrderDish();
		orderDish_id = orderDishServiceImpl.orderDishById(id);
		return orderDish_id;
	}

	@PutMapping("/orderdish/{id}")
	public OrderDish updateOrderDish(@PathVariable(name = "id") int id, @RequestBody OrderDish orderDish) {
		OrderDish orderDish_sel = new OrderDish();
		orderDish_sel = orderDishServiceImpl.orderDishById(id);
		orderDish_sel.setDish(orderDish.getDish());
		orderDish_sel.setOrder(orderDish.getOrder());
		return orderDishServiceImpl.updateOrderDish(orderDish_sel);
	}

	@DeleteMapping("/orderdish/{id}")
	public void deleteOrderDish(@PathVariable(name = "id") int id) {
		orderDishServiceImpl.deleteOrderDish(id);
	}

}
