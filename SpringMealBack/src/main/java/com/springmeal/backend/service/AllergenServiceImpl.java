/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IAllergenDAO;
import com.springmeal.backend.dto.Allergen;

/**
 * @author Joan
 *
 */
@Service
public class AllergenServiceImpl implements IAllergenService {

	@Autowired
	IAllergenDAO iAllergenDAO;

	@Override
	public List<Allergen> listAllergens() {
		return iAllergenDAO.findAll();
	}

	@Override
	public Allergen saveAllergen(Allergen allergen) {
		return iAllergenDAO.save(allergen);
	}

	@Override
	public Allergen findById(int codigo) {
		return iAllergenDAO.findById(codigo).get();
	}

	@Override
	public Allergen updateAllergen(Allergen allergen) {
		return iAllergenDAO.save(allergen);
	}

	@Override
	public void deleteAllergen(int codigo) {
		iAllergenDAO.deleteById(codigo);

	}

}
