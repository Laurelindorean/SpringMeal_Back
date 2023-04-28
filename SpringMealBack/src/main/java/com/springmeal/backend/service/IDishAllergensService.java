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
	public List<DishAllergens> listarDishAllergens();

	public DishAllergens guardarDishAllergens(DishAllergens dishAllergens);

	public DishAllergens dishAllergensById(int id);

	public DishAllergens actualizarDishAllergens(DishAllergens dishAllergens);

	public void eliminarDishAllergens(int id);
}
