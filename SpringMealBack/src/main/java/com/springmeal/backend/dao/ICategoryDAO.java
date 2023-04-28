/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Category;

/**
 * @author aitor
 *
 */
public interface ICategoryDAO extends JpaRepository<Category, Integer> {

}
