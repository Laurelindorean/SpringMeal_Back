/**
 * 
 */
package com.springmeal.backend.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "orderdish")
public class OrderDish {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_orders")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "id_dish")
	private Dish dish;

	// Constructors

	public OrderDish() {

	}

	/**
	 * @param id
	 * @param order
	 * @param dish
	 */
	public OrderDish(int id, Order order, Dish dish) {
		super();
		this.id = id;
		this.order = order;
		this.dish = dish;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the dish
	 */
	public Dish getDish() {
		return dish;
	}

	/**
	 * @param dish the dish to set
	 */
	public void setDish(Dish dish) {
		this.dish = dish;
	}

}
