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
	public Allergen guardarAllergen(@RequestBody Allergen allergen) {
		return allergenServiceImpl.saveAllergen(allergen);
	}

	@GetMapping("/allergens/{codigo}")
	public Allergen findById(@PathVariable(name = "codigo") int codigo) {
		Allergen allergen = new Allergen();
		allergen = allergenServiceImpl.findById(codigo);
		return allergen;
	}

	@PutMapping("/allergens/{codigo}")
	@PreAuthorize("hasRole('admin')")
	public Allergen actualizarAllergen(@PathVariable(name = "codigo") int codigo, @RequestBody Allergen allergen) {

		Allergen allergen_seleccionado = new Allergen();
		Allergen allergen_actualizado = new Allergen();
		allergen_seleccionado = allergenServiceImpl.findById(codigo);
		allergen_seleccionado.setName(allergen.getName());

		allergen_actualizado = allergenServiceImpl.updateAllergen(allergen_seleccionado);

		return allergen_actualizado;
	}

	@DeleteMapping("/allergens/{codigo}")
	@PreAuthorize("hasRole('admin')")
	public void eliminarAllergen(@PathVariable(name = "codigo") int codigo) {
		allergenServiceImpl.deleteAllergen(codigo);
	}

}
