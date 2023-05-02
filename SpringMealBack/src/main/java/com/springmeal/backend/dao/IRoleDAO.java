/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Role;

/**
 * @author Joan
 *
 */
public interface IRoleDAO extends JpaRepository<Role, Integer> {

}
