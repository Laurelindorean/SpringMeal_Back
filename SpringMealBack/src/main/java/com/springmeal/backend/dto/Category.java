/**
 * 
 */
package com.springmeal.backend.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "category")
public class Category {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToMany
	@JoinColumn(name = "id_category")
	private List<Dish> dish;

	// CONSTRUCTORES
	public Category() {

	}

	public Category(int id) {
		this.id = id;
	}

	public Category(String name) {
		this.name = name;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Dish> getDish() {
		return dish;
	}

	public void setDish(List<Dish> dish) {
		this.dish = dish;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", dish=" + dish + "]";
	}

}
