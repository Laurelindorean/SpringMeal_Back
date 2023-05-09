/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Role;

/**
 * @author Joan
 *
 */
public interface IRoleService {
	// Metodos del CRUD
	public List<Role> listarRoles(); // Listar All

	public Role guardarRole(Role role); // Guarda un departamento CREATE

	public Role findById(int codigo); // Leer datos de un departamento READ

	public Role actualizarRole(Role role); // Actualiza datos del departamento UPDATE

	public void eliminarRole(int codigo);// Elimina el departamento DELETE
}
