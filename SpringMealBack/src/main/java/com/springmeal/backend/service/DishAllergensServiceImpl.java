/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IDishAllergensDAO;
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
	public List<DishAllergens> listarDishAllergens() {
		return iDishAllergensDAO.findAll();
	}

	@Override
	public DishAllergens guardarDishAllergens(DishAllergens dishAllergens) {
		return iDishAllergensDAO.save(dishAllergens);
	}

	@Override
	public DishAllergens findById(int id) {
		return iDishAllergensDAO.findById(id).get();
	}

	@Override
	public DishAllergens actualizarDishAllergens(DishAllergens dishAllergens) {
		return iDishAllergensDAO.save(dishAllergens);
	}

	@Override
	public void eliminarDishAllergens(int id) {
		iDishAllergensDAO.deleteById(id);

	}
}
