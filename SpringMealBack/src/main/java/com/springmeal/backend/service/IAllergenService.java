/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Allergen;

/**
 * @author Joan, Palmira
 *
 */
public interface IAllergenService {
	// Metodos del CRUD
	public List<Allergen> listAllergens(); 

	public Allergen saveAllergen(Allergen allergen); 
	
	public Allergen findByPartialName(String name);

	public Allergen findById(int id); 

	public Allergen updateAllergen(Allergen allergen);

	public void deleteAllergen(int id);
}
