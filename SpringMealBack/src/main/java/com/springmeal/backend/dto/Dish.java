/**
 * 
 */
package com.springmeal.backend.dto;

import java.awt.Image;
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
 * @author aitor
 *
 */
@Entity
@Table(name = "dish")
public class Dish {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String description;
	private Image image;
	
	@OneToMany
	@JoinColumn(name = "allergen")
	private List<Allergens> allergen;

	@ManyToOne
	@JoinColumn(name = "id_category")
	private Category category;

	// CONSTRUCTORES
	public Dish() {

	}

	public Dish(String name, String description, Image image, Category category) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.category = category;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Allergens")
	public Allergens getAllergen() {
		return allergen;
	}

	public void setAllergen(Allergens allergen) {
		this.allergen = allergen;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + "]";
	}

}
