/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dao.IUserDAO;
import com.springmeal.backend.dto.User;
import com.springmeal.backend.dto.user.UserDTO;
import com.springmeal.backend.security.service.UserDetailsImpl;
import com.springmeal.backend.service.UserServiceImpl;
import com.springmeal.backend.util.SpringMealUtils;

import jakarta.servlet.http.HttpServletRequest;

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
	public List<User> listarUsers() {
		return userServiceImpl.listarUsers();
	}

	@PostMapping("/users")
	@PreAuthorize("hasRole('admin')")
	public User guardarUser(@RequestBody User user) {
		return userServiceImpl.guardarUser(user);
	}

	@GetMapping("/users/{codigo}")
	public User userById(@PathVariable(name = "codigo") int codigo) {	
	
		if(SpringMealUtils.getUserDetails().getId() != codigo) {
			throw new RuntimeException("No tienes permisos para ver este id");
		}
			
		return userServiceImpl.userById(codigo);
	}

	@PutMapping("/users/{codigo}")
	public User actualizarUser(@PathVariable(name = "codigo") int codigo, @RequestBody User user) {

		User user_seleccionado = new User();
		User user_actualizado = new User();
		user_seleccionado = userServiceImpl.userById(codigo);
		user_seleccionado.setDni(user.getDni());
		user_seleccionado.setEmail(user.getEmail());
		user_seleccionado.setName(user.getName());
		user_seleccionado.setPassword(user.getPassword());
		user_seleccionado.setSurname(user.getSurname());

		user_actualizado = userServiceImpl.actualizarUser(user_seleccionado);

		return user_actualizado;
	}

	@DeleteMapping("/users/{codigo}")
	@PreAuthorize("hasRole('admin')")
	public void eliminarUser(@PathVariable(name = "codigo") int codigo) {
		userServiceImpl.eliminarUser(codigo);
	}

}
