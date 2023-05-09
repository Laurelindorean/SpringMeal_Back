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
	public List<Category> listarCategory();

	public Category guardarCategory(Category category);

	public Category findById(int id);

	public Category actualizarCategory(Category category);

	public void eliminarCategory(int id);
}
