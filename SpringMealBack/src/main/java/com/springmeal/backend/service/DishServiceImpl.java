/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IDishDAO;
import com.springmeal.backend.dto.Category;
import com.springmeal.backend.dto.Dish;

/**
 * @author aitor
 *
 */
@Service
public class DishServiceImpl implements IDishService {

	@Autowired
	IDishDAO iDishDAO;

	@Override
	public List<Dish> listarDish() {
		return iDishDAO.findAll();
	}

	@Override
	public Dish guardarDish(Dish dish) {
		return iDishDAO.save(dish);
	}

	@Override
	public Dish dishById(int id) {
		return iDishDAO.findById(id).get();
	}

	@Override
	public Dish actualizarDish(Dish dish) {
		return iDishDAO.save(dish);
	}

	@Override
	public void eliminarDish(int id) {
		iDishDAO.deleteById(id);
	}
	
	@Override
	public List<Dish> dishByName(String name) {
		return iDishDAO.findByName(name);
	}
	
	@Override
	public List<Dish> dishByCategory(Category category) {
		return iDishDAO.findByCategory(category);
	}

}
