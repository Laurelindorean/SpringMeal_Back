/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Category;
import com.springmeal.backend.dto.Dish;

/**
 * @author aitor
 *
 */
public interface IDishService {
	// Metodos del CRUD
	public List<Dish> listarDish();

	public Dish guardarDish(Dish dish);

	public Dish dishById(int id);

	public Dish actualizarDish(Dish dish);

	public void eliminarDish(int id);

	public List<Dish> dishByName(String name);
	
	public List<Dish> dishByCategory(Category category);
}
