/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.springmeal.backend.dao.IDishDAO;
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
	public List<Dish> listDish() {
		return iDishDAO.findAll();
	}

	@Override
	public Dish saveDish(Dish dish) {
		return iDishDAO.save(dish);
	}

	@Override
	public Dish findById(int id) {
		return iDishDAO.findById(id).get();
	}

	@Override
	public Dish updateDish(Dish dish) {
		return iDishDAO.save(dish);
	}

	@Override
	public void deleteDish(int id) {
		iDishDAO.deleteById(id);
	}
	
	@Override
	public List<Dish> findByName(String name) {
		return iDishDAO.findByName(name);
	}
	
	@Override
	public List<Dish> findByPartialName(String partial_name) {
		return iDishDAO.findByPartialName(partial_name);
	}

	@Override
	public List<Dish> findByCategoryPartialName(int category_id, String partial_name) {
		return iDishDAO.findByCategoryPartialName(category_id, partial_name);
	}
	
	@Override
	public Page<Dish>  findByCategory(String category, Pageable pageable) {
		return iDishDAO.findByCategoryName(category, pageable);
	}

	@Override
	public Page<Dish> listDishOrdered(Pageable pageable) {
		return iDishDAO.findAll(pageable);
	}


	
	

}
