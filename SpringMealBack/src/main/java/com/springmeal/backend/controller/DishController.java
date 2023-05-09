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
import com.springmeal.backend.dto.Category;
import com.springmeal.backend.service.DishServiceImpl;

/**
 * @author aitor, joan
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
	public Dish findById(@PathVariable(name = "id") int id) {
		Dish dish = new Dish();
		dish = dishServiceImpl.findById(id);
		return dish;
	}

	/*@GetMapping("/dishes/name/{name}")
	public List<Dish> findByName(@PathVariable(name = "name") String name) {
		return dishServiceImpl.findByName(name);
	}*/
	
	@GetMapping("/dishes/partialName/{name}")
	public List<Dish> findByPartialName(@PathVariable(name = "name") String name) {
		return dishServiceImpl.findByPartialName(name);
	}
	
	@GetMapping("/dishes/category")
	public List<Dish> findByCategory(@RequestBody Category category) {
		return dishServiceImpl.findByCategory(category);
	}

	@PutMapping("/dishes/{id}")
	public Dish actualizarDish(@PathVariable(name = "id") int id, @RequestBody Dish dish) {

		Dish dish_seleccionado = new Dish();
		Dish dish_actualizado = new Dish();
		dish_seleccionado = dishServiceImpl.findById(id);
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
