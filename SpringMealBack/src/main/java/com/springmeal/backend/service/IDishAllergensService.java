/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.DishAllergens;

/**
 * @author aitor
 *
 */
public interface IDishAllergensService {
	// Metodos del CRUD
	public List<DishAllergens> listDishAllergens();

	public DishAllergens saveDishAllergens(DishAllergens dishAllergens);

	public DishAllergens findById(int id);

	public DishAllergens updateDishAllergens(DishAllergens dishAllergens);

	public void deleteDishAllergens(int id);
}
