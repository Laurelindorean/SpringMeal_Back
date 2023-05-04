/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Allergen;

/**
 * @author Joan
 *
 */
public interface IAllergenDAO extends JpaRepository<Allergen, Integer> {

}
