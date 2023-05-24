/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.springmeal.backend.dto.Dish;

/**
 * @author aitor
 *
 */
public interface IDishService {
	// Metodos del CRUD
	public List<Dish> listDish();

	public Dish saveDish(Dish dish);

	public Dish findById(int id);

	public Dish updateDish(Dish dish);

	public void deleteDish(int id);

	public List<Dish> findByName(String name);
	
	public List<Dish> findByPartialName(String partial_name);

	public List<Dish> findByCategoryPartialName(int category_id, String partial_name);
	
	public Page<Dish> findByCategory(String category, Pageable pageable);
	
	public Page<Dish> listDishOrdered(Pageable pageable);
}
