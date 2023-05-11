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
	public List<Category> listCategory() {
		return iCategoryDAO.findAll();
	}

	@Override
	public Category saveCategory(Category category) {
		return iCategoryDAO.save(category);
	}

	@Override
	public Category findById(int id) {
		return iCategoryDAO.findById(id).get();
	}

	@Override
	public Category updateCategory(Category category) {
		return iCategoryDAO.save(category);
	}

	@Override
	public void deleteCategory(int id) {
		iCategoryDAO.deleteById(id);

	}
}
