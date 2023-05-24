/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IDishAllergensDAO;
import com.springmeal.backend.dto.Dish;
import com.springmeal.backend.dto.DishAllergens;

/**
 * @author aitor
 *
 */
@Service
public class DishAllergensServiceImpl implements IDishAllergensService {

	@Autowired
	IDishAllergensDAO iDishAllergensDAO;

	@Override
	public List<DishAllergens> listDishAllergens() {
		return iDishAllergensDAO.findAll();
	}

	@Override
	public DishAllergens saveDishAllergens(DishAllergens dishAllergens) {
		return iDishAllergensDAO.save(dishAllergens);
	}

	@Override
	public DishAllergens findById(int id) {
		return iDishAllergensDAO.findById(id).get();
	}

	@Override
	public DishAllergens updateDishAllergens(DishAllergens dishAllergens) {
		return iDishAllergensDAO.save(dishAllergens);
	}

	@Override
	public void deleteDishAllergens(int id) {
		iDishAllergensDAO.deleteById(id);

	}

	public List<DishAllergens> findByDish(Dish dish) {
		return iDishAllergensDAO.findByDish(dish);
	}
}
