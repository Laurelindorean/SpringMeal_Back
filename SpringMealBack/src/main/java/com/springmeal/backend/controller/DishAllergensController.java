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
	public DishAllergens findById(@PathVariable(name = "id") int id) {
		DishAllergens dishAllergens = new DishAllergens();
		dishAllergens = dishAllergensServiceImpl.findById(id);
		return dishAllergens;
	}

	@PutMapping("/dishallergens/{id}")
	public DishAllergens actualizarDishAllergens(@PathVariable(name = "id") int id,
			@RequestBody DishAllergens dishAllergens) {

		DishAllergens dishAllergens_seleccionado = new DishAllergens();
		DishAllergens dishAllergens_actualizado = new DishAllergens();
		dishAllergens_seleccionado = dishAllergensServiceImpl.findById(id);
		dishAllergens_seleccionado.setId(id);
		dishAllergens_seleccionado.setAllergens(dishAllergens.getAllergens());
		dishAllergens_seleccionado.setDish(dishAllergens.getDish());

		dishAllergens_actualizado = dishAllergensServiceImpl.actualizarDishAllergens(dishAllergens_seleccionado);

		return dishAllergens_actualizado;
	}

	@DeleteMapping("/dishallergens/{id}")
	public void eliminarDishAllergens(@PathVariable(name = "id") int id) {
		dishAllergensServiceImpl.eliminarDishAllergens(id);
	}

}
