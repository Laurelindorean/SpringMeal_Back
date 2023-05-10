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

import com.springmeal.backend.dto.Dish;
import com.springmeal.backend.service.DishServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class DishController {

	@Autowired
	DishServiceImpl dishServiceImpl;

	@GetMapping("/dishes")
	public List<Dish> listarDish() {
		return dishServiceImpl.listarDish();
	}

	@PostMapping("/dishes")
	@PreAuthorize("hasRole('admin')")
	public Dish guardarDish(@RequestBody Dish dish) {
		return dishServiceImpl.guardarDish(dish);
	}

	@GetMapping("/dishes/{id}")
	public Dish dishById(@PathVariable(name = "id") int id) {
		Dish dish = new Dish();
		dish = dishServiceImpl.dishById(id);
		return dish;
	}

	@PutMapping("/dishes/{id}")
	@PreAuthorize("hasRole('admin')")
	public Dish actualizarDish(@PathVariable(name = "id") int id, @RequestBody Dish dish) {

		Dish dishSelected = new Dish();
		Dish dishUpdated = new Dish();
		dishSelected = dishServiceImpl.dishById(id);
		dishSelected.setId(id);
		dishSelected.setCategory(dish.getCategory());
		dishSelected.setDescription(dish.getDescription());
		dishSelected.setImage(dish.getImage());
		dishSelected.setPrice(dish.getPrice());
		dishSelected.setName(dish.getName());

		dishUpdated = dishServiceImpl.actualizarDish(dishSelected);

		return dishUpdated;
	}

	@DeleteMapping("/dishes/{id}")
	@PreAuthorize("hasRole('admin')")
	public void eliminarDish(@PathVariable(name = "id") int id) {
		dishServiceImpl.eliminarDish(id);
	}

}
