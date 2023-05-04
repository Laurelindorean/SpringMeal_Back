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
	public List<User> listarUsers(); // Listar All

	public User guardarUser(User user); // Guarda un departamento CREATE

	public User userById(int codigo); // Leer datos de un departamento READ

	public User actualizarUser(User user); // Actualiza datos del departamento UPDATE

	public void eliminarUser(int codigo);// Elimina el departamento DELETE
}
