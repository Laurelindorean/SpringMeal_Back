/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Category;
import com.springmeal.backend.service.CategoryServiceImpl;

/**
 * @author aitor, Palmira, Joan
 *
 */
@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryServiceImpl categoryServiceImpl;

	@GetMapping("/categories")
	public List<Category> listCategory() {
		return categoryServiceImpl.listCategory();
	}

	@PostMapping("/categories")
	@PreAuthorize("hasRole('admin')")
	public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
		return ResponseEntity.ok(categoryServiceImpl.saveCategory(category));
	}

	@GetMapping("/categories/{id}")
	public Category findById(@PathVariable(name = "id") int id) {
		Category category = new Category();
		category = categoryServiceImpl.findById(id);
		return category;
	}

	@PutMapping("/categories/{id}")
	@PreAuthorize("hasRole('admin')")
	public Category updateCategory(@PathVariable(name = "id") int id, @RequestBody Category category) {

		Category category_seleccionado = new Category();
		Category category_actualizado = new Category();
		category_seleccionado = categoryServiceImpl.findById(id);
		category_seleccionado.setId(id);
		category_seleccionado.setName(category.getName());

		category_actualizado = categoryServiceImpl.updateCategory(category_seleccionado);

		return category_actualizado;
	}

	@DeleteMapping("/categories/{id}")
	@PreAuthorize("hasRole('admin')")
	public ResponseEntity<String> deleteCategory(@PathVariable(name = "id") int id) {
		categoryServiceImpl.deleteCategory(id);
		return ResponseEntity.ok("Deleted");
	}

}
