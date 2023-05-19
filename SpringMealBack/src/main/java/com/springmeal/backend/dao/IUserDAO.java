/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.User;

/**
 * @author joan
 *
 */
public interface IUserDAO extends JpaRepository<User, Integer> {
	//Creo este endpoint para el jwt
	public User findByUsername(String username);

}
