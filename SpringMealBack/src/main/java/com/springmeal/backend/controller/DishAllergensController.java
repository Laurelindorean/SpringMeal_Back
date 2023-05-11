/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.DishAllergens;
import com.springmeal.backend.service.DishAllergensServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class DishAllergensController {

	@Autowired
	DishAllergensServiceImpl dishAllergensServiceImpl;

	@GetMapping("/dishallergens")
	public List<DishAllergens> listDishAllergens() {
		return dishAllergensServiceImpl.listDishAllergens();
	}

	@PostMapping("/dishallergens")
	@PreAuthorize("hasRole('admin')")
	public DishAllergens saveDishAllergens(@RequestBody DishAllergens dishAllergens) {
		return dishAllergensServiceImpl.saveDishAllergens(dishAllergens);
	}

	@GetMapping("/dishallergens/{id}")
	public DishAllergens findById(@PathVariable(name = "id") int id) {
		DishAllergens dishAllergens = new DishAllergens();
		dishAllergens = dishAllergensServiceImpl.findById(id);
		return dishAllergens;
	}

	@PutMapping("/dishallergens/{id}")
	@PreAuthorize("hasRole('admin')")
	public DishAllergens updateDishAllergens(@PathVariable(name = "id") int id,
			@RequestBody DishAllergens dishAllergens) {
		DishAllergens dishAllergenSelected = new DishAllergens();
		DishAllergens dishAllergensUpdated = new DishAllergens();
		dishAllergenSelected = dishAllergensServiceImpl.findById(id);
		dishAllergenSelected.setId(id);
		dishAllergenSelected.setAllergens(dishAllergens.getAllergens());
		dishAllergenSelected.setDish(dishAllergens.getDish());
		dishAllergensUpdated = dishAllergensServiceImpl.updateDishAllergens(dishAllergenSelected);
		return dishAllergensUpdated;
	}

	@DeleteMapping("/dishallergens/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteDishAllergens(@PathVariable(name = "id") int id) {
		dishAllergensServiceImpl.deleteDishAllergens(id);
	}

}
