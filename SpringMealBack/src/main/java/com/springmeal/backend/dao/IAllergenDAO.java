/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springmeal.backend.dto.Allergen;

/**
 * @author Joan, Palmira
 *
 */
public interface IAllergenDAO extends JpaRepository<Allergen, Integer> {
	
	@Query(value = "SELECT * FROM allergens WHERE name LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
	public Allergen findByPartialName(String name);

}
