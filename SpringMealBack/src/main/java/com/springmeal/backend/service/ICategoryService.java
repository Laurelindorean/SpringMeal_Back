/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Category;

/**
 * @author aitor
 *
 */
public interface ICategoryService {
	// Metodos del CRUD
	public List<Category> listCategory();

	public Category saveCategory(Category category);

	public Category findById(int id);

	public Category updateCategory(Category category);

	public void deleteCategory(int id);
}
