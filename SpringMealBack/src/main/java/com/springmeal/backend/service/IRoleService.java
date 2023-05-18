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

	public Role findById(int id); 

	public Role updateRole(Role id); 

	public void deleteRole(int id);
	
	public Role findByRole(String role);

	public void setRoleAdminByIdUser(int idUser);
}
