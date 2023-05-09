/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.ICategoryDAO;
import com.springmeal.backend.dto.Category;

/**
 * @author aitor
 *
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	ICategoryDAO iCategoryDAO;

	@Override
	public List<Category> listarCategory() {
		return iCategoryDAO.findAll();
	}

	@Override
	public Category guardarCategory(Category category) {
		return iCategoryDAO.save(category);
	}

	@Override
	public Category findById(int id) {
		return iCategoryDAO.findById(id).get();
	}

	@Override
	public Category actualizarCategory(Category category) {
		return iCategoryDAO.save(category);
	}

	@Override
	public void eliminarCategory(int id) {
		iCategoryDAO.deleteById(id);

	}
}
