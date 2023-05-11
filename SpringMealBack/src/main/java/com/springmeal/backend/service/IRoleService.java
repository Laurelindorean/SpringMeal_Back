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
	public List<Role> listRoles(); 

	public Role saveRole(Role role); 

	public Role findById(int codigo); 

	public Role updateRole(Role role); 

	public void deleteRole(int codigo);
	
	public Role findByRole(String role);

	public void setRoleAdminByIdUser(int idUser);
}
