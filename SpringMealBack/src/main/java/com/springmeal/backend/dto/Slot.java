/**
 * 
 */
package com.springmeal.backend.dto;

import java.sql.Time;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "slot")
public class Slot {

	// Fields

	@Id
	private int id;
	private Time start;
	private Time end;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_slot")
	private List<Order> order;

	// Constructors

	public Slot() {

	}

	/**
	 * @param id
	 * @param start
	 * @param end
	 * @param order
	 */
	public Slot(int id, Time start, Time end, List<Order> order) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.order = order;
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
	 * @return the start
	 */
	public Time getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Time start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public Time getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Time end) {
		this.end = end;
	}

	/**
	 * @return the order
	 */
	@JsonIgnore
	public List<Order> getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
