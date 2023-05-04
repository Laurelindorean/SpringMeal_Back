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
 * @author aitor
 *
 */
@Entity
@Table(name = "dishallergens")
public class DishAllergens {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_dish")
	private Dish dish;
	
	@ManyToOne
	@JoinColumn(name = "id_allergens")
	private Allergen allergens;


	// CONSTRUCTORES
	public DishAllergens() {

	}

	public DishAllergens(Dish dish, Allergen allergens) {
		this.dish = dish;
		this.allergens = allergens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Allergen getAllergens() {
		return allergens;
	}

	public void setAllergens(Allergen allergens) {
		this.allergens = allergens;
	}

	


	

}
