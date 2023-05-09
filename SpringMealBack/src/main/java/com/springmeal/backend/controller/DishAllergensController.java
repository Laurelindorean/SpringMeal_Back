/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Category;
import com.springmeal.backend.dto.DishAllergens;
import com.springmeal.backend.service.CategoryServiceImpl;
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
	public List<DishAllergens> listarDishAllergens() {
		return dishAllergensServiceImpl.listarDishAllergens();
	}

	@PostMapping("/dishallergens")
	public DishAllergens guardarDishAllergens(@RequestBody DishAllergens dishAllergens) {
		return dishAllergensServiceImpl.guardarDishAllergens(dishAllergens);
	}

	@GetMapping("/dishallergens/{id}")
	public DishAllergens dishAllergensById(@PathVariable(name = "id") int id) {
		DishAllergens dishAllergens = new DishAllergens();
		dishAllergens = dishAllergensServiceImpl.dishAllergensById(id);
		return dishAllergens;
	}

	@PutMapping("/dishallergens/{id}")
	public DishAllergens actualizarDishAllergens(@PathVariable(name = "id") int id,
			@RequestBody DishAllergens dishAllergens) {

		DishAllergens dishAllergenSelected = new DishAllergens();
		DishAllergens dishAllergensUpdated = new DishAllergens();
		dishAllergenSelected = dishAllergensServiceImpl.dishAllergensById(id);
		dishAllergenSelected.setId(id);
		dishAllergenSelected.setAllergens(dishAllergens.getAllergens());
		dishAllergenSelected.setDish(dishAllergens.getDish());

		dishAllergensUpdated = dishAllergensServiceImpl.actualizarDishAllergens(dishAllergenSelected);

		return dishAllergensUpdated;
	}

	@DeleteMapping("/dishallergens/{id}")
	public void eliminarDishAllergens(@PathVariable(name = "id") int id) {
		dishAllergensServiceImpl.eliminarDishAllergens(id);
	}

}
