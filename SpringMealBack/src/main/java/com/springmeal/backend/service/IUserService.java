/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.User;

/**
 * @author joan
 *
 */
public interface IUserService {
	// Metodos del CRUD
	public List<User> listUsers(); 

	public User saveUser(User user); 

	public User findById(int id); 

	public User updateUser(User user); 

	public void deleteUser(int id);
}
