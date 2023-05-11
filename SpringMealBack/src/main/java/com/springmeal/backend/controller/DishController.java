/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
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
 * @author aitor, joan, palmira
 *
 */
@RestController
@RequestMapping("/api")
public class DishController {

	@Autowired
	DishServiceImpl dishServiceImpl;

	@GetMapping("/dishes")
	public List<Dish> listDish() {
		return dishServiceImpl.listDish();
	}

	@PostMapping("/dishes")
	@PreAuthorize("hasRole('admin')")
	public Dish saveDish(@RequestBody Dish dish) {
		return dishServiceImpl.saveDish(dish);
	}

	@GetMapping("/dishes/{id}")
	public Dish findById(@PathVariable(name = "id") int id) {
		Dish dish = new Dish();
		dish = dishServiceImpl.findById(id);
		return dish;
	}
	//To sort all the dishes by name
	@GetMapping("/dishes/sortByName")
	public Page<Dish> listDishSorted(){
		Pageable pageable = PageRequest.of(0, 100, Direction.ASC, "name");
		return this.dishServiceImpl.listDishOrdered(pageable);
	}
	//To sort all the dishes by price
	@GetMapping("/dishes/sortByPrice")
	public Page<Dish> listDishSortedByPrice(){
		Pageable pageable = PageRequest.of(0, 100, Direction.ASC, "price");
		return this.dishServiceImpl.listDishOrdered(pageable);
	}

	/*
	 * @GetMapping("/dishes/name/{name}") public List<Dish>
	 * findByName(@PathVariable(name = "name") String name) { return
	 * dishServiceImpl.findByName(name); }
	 */

	@GetMapping("/dishes/partialName/{name}")
	public List<Dish> findByPartialName(@PathVariable(name = "name") String name) {
		return dishServiceImpl.findByPartialName(name);
	}

	@GetMapping("/dishes/category/{category}")
	public Page<Dish> findByCategory(@PathVariable String category) {
		//this allows us to sort the dishes by name ascendent with ASC or descendent with DESC
		Pageable pageable = PageRequest.of(0, 100, Direction.ASC, "name");
		return dishServiceImpl.findByCategory(category, pageable);
	}

	@PutMapping("/dishes/{id}")
	@PreAuthorize("hasRole('admin')")
	public Dish updateDish(@PathVariable(name = "id") int id, @RequestBody Dish dish) {
		Dish dishSelected = new Dish();
		Dish dishUpdated = new Dish();
		dishSelected = dishServiceImpl.findById(id);
		dishSelected.setId(id);
		dishSelected.setCategory(dish.getCategory());
		dishSelected.setDescription(dish.getDescription());
		dishSelected.setImage(dish.getImage());
		dishSelected.setPrice(dish.getPrice());
		dishSelected.setName(dish.getName());

		dishUpdated = dishServiceImpl.updateDish(dishSelected);

		return dishUpdated;
	}

	@DeleteMapping("/dishes/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteDish(@PathVariable(name = "id") int id) {
		dishServiceImpl.deleteDish(id);
	}

}
