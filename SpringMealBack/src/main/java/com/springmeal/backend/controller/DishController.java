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
	public Dish actualizarDish(@PathVariable(name = "id") int id, @RequestBody Dish dish) {

		Dish dish_seleccionado = new Dish();
		Dish dish_actualizado = new Dish();
		dish_seleccionado = dishServiceImpl.dishById(id);
		dish_seleccionado.setId(id);
		dish_seleccionado.setCategory(dish.getCategory());
		dish_seleccionado.setDescription(dish.getDescription());
		dish_seleccionado.setImage(dish.getImage());
		dish_seleccionado.setName(dish.getName());

		dish_actualizado = dishServiceImpl.actualizarDish(dish_seleccionado);

		return dish_actualizado;
	}

	@DeleteMapping("/dishes/{id}")
	public void eliminarDish(@PathVariable(name = "id") int id) {
		dishServiceImpl.eliminarDish(id);
	}

}
