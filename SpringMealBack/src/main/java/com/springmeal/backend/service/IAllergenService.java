/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Allergen;

/**
 * @author Joan
 *
 */
public interface IAllergenService {
	// Metodos del CRUD
	public List<Allergen> listAllergens(); // Listar All

	public Allergen saveAllergen(Allergen allergen); // Guarda un departamento CREATE

	public Allergen findById(int codigo); // Leer datos de un departamento READ

	public Allergen updateAllergen(Allergen allergen); // Actualiza datos del departamento UPDATE

	public void deleteAllergen(int codigo);// Elimina el departamento DELETE
}
