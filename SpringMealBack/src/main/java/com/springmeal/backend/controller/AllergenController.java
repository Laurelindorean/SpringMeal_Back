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

import com.springmeal.backend.dto.Allergen;
import com.springmeal.backend.service.AllergenServiceImpl;

/**
 * @author Joan
 *
 */
@RestController
@RequestMapping("/api")
public class AllergenController {

	@Autowired
	AllergenServiceImpl allergenServiceImpl;

	@GetMapping("/allergens")
	public List<Allergen> listarAllergens() {
		return allergenServiceImpl.listAllergens();
	}

	@PostMapping("/allergens")
	@PreAuthorize("hasRole('admin')")
	public ResponseEntity<Allergen> guardarAllergen(@RequestBody Allergen allergen) {
		return ResponseEntity.ok(allergenServiceImpl.saveAllergen(allergen));
	}

	@GetMapping("/allergens/{id}")
	public Allergen findById(@PathVariable(name = "id") int id) {
		Allergen allergen = new Allergen();
		allergen = allergenServiceImpl.findById(id);
		return allergen;
	}

	@GetMapping("/allergens/name/{name}")
	public Allergen findByName(@PathVariable(name = "name") String name) {
		return allergenServiceImpl.findByPartialName(name);
	}

	@PutMapping("/allergens/{id}")
	@PreAuthorize("hasRole('admin')")
	public Allergen actualizarAllergen(@PathVariable(name = "id") int id, @RequestBody Allergen allergen) {

		Allergen allergen_seleccionado = new Allergen();
		Allergen allergen_actualizado = new Allergen();
		allergen_seleccionado = allergenServiceImpl.findById(id);
		allergen_seleccionado.setName(allergen.getName());

		allergen_actualizado = allergenServiceImpl.updateAllergen(allergen_seleccionado);

		return allergen_actualizado;
	}

	@DeleteMapping("/allergens/{id}")
	@PreAuthorize("hasRole('admin')")
	public ResponseEntity<String> eliminarAllergen(@PathVariable(name = "id") int id) {
		allergenServiceImpl.deleteAllergen(id);
		return ResponseEntity.ok("Deleted");
	}

}
