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
	public List<Allergen> listarAllergens(); // Listar All

	public Allergen guardarAllergen(Allergen allergen); // Guarda un departamento CREATE

	public Allergen allergenById(int codigo); // Leer datos de un departamento READ

	public Allergen actualizarAllergen(Allergen allergen); // Actualiza datos del departamento UPDATE

	public void eliminarAllergen(int codigo);// Elimina el departamento DELETE
}
