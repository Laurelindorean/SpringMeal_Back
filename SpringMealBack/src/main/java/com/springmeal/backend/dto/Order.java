/**
 * 
 */
package com.springmeal.backend.dto;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "orders")
public class Order {

	// Fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_orders")
	private List<OrderDish> orderDish;

	@ManyToOne
	@JoinColumn(name = "id_slot")
	private Slot slot;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	// Constructors

	public Order() {

	}

	/**
	 * @param id
	 * @param date
	 * @param orderDish
	 * @param slot
	 * @param user
	 */
	public Order(int id, Date date, List<OrderDish> orderDish, Slot slot, User user) {
		super();
		this.id = id;
		this.date = date;
		this.orderDish = orderDish;
		this.slot = slot;
		this.user = user;
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the orderDish
	 */
	@JsonIgnore
	public List<OrderDish> getOrderDish() {
		return orderDish;
	}

	/**
	 * @param orderDish the orderDish to set
	 */
	public void setOrderDish(List<OrderDish> orderDish) {
		this.orderDish = orderDish;
	}

	/**
	 * @return the slot
	 */
	public Slot getSlot() {
		return slot;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
