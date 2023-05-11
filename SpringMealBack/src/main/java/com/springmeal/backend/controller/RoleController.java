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

import com.springmeal.backend.dto.Role;
import com.springmeal.backend.service.IRoleService;

/**
 * @author Joan
 *
 */
@RestController
@RequestMapping("/api")
@PreAuthorize("hasRole('admin')")
public class RoleController {

	@Autowired
	IRoleService roleServiceImpl;

	@GetMapping("/roles")
	public List<Role> listarRoles() {
		return roleServiceImpl.listarRoles();
	}

	@PostMapping("/roles")
	public Role guardarRole(@RequestBody Role role) {
		return roleServiceImpl.guardarRole(role);
	}

	@GetMapping("/roles/{codigo}")
	public Role findById(@PathVariable(name = "codigo") int codigo) {
		Role role = new Role();
		role = roleServiceImpl.findById(codigo);
		return role;
	}

	@PutMapping("/roles/{codigo}")
	public Role actualizarRole(@PathVariable(name = "codigo") int codigo, @RequestBody Role role) {

		Role role_seleccionado = new Role();
		Role role_actualizado = new Role();
		role_seleccionado = roleServiceImpl.findById(codigo);
		role_seleccionado.setName(role.getName());

		role_actualizado = roleServiceImpl.actualizarRole(role_seleccionado);

		return role_actualizado;
	}

	@DeleteMapping("/roles/{codigo}")
	public void eliminarRole(@PathVariable(name = "codigo") int codigo) {
		roleServiceImpl.eliminarRole(codigo);
	}
	
	//EndPoint to change the role of a user
	@PutMapping("/roles/user/{idUser}")
	public void setAdminByIdUser(@PathVariable int idUser) {
		this.roleServiceImpl.setRoleAdminByIdUser(idUser);
	}

}
