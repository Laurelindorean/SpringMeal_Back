/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmeal.backend.dto.User;
import com.springmeal.backend.service.UserServiceImpl;
import com.springmeal.backend.util.SpringMealUtils;


/**
 * @author joan
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/users")
	@PreAuthorize("hasRole('admin')")
	public List<User> listUser() {
		return userServiceImpl.listUsers();
	}

	@PostMapping("/users")
	@PreAuthorize("hasRole('admin')")
	public User saveUser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}

	@GetMapping("/users/{id}")
	public User findById(@PathVariable(name = "id") int id) {
		//this endpoint won't work unless the idUser = codigo
		if (SpringMealUtils.getUserDetails().getId() != id) {
			throw new RuntimeException("You're not allowed to see this User");
		}

		return userServiceImpl.findById(id);
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(name = "id") int id, @RequestBody User user) {
		
		if (SpringMealUtils.getUserDetails().getId() != id) {
			throw new RuntimeException("You're not allowed to update this User");
		}
		User user_selected = new User();
		User user_updated = new User();
		user_selected = userServiceImpl.findById(id);
		user_selected.setDni(user.getDni());
		user_selected.setEmail(user.getEmail());
		user_selected.setName(user.getName());
		user_selected.setPassword(user.getPassword());
		user_selected.setSurname(user.getSurname());

		user_updated = userServiceImpl.updateUser(user_selected);
		return user_updated;
	}

	@DeleteMapping("/users/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteUser(@PathVariable(name = "id") int id) {
		userServiceImpl.deleteUser(id);
	}

}
