/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IRoleDAO;
import com.springmeal.backend.dto.Role;

/**
 * @author Joan
 *
 */
@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	IRoleDAO iRoleDAO;

	@Override
	public List<Role> listarRoles() {
		return iRoleDAO.findAll();
	}

	@Override
	public Role guardarRole(Role role) {
		return iRoleDAO.save(role);
	}

	@Override
	public Role roleById(int codigo) {
		return iRoleDAO.findById(codigo).get();
	}

	@Override
	public Role actualizarRole(Role role) {
		return iRoleDAO.save(role);
	}

	@Override
	public void eliminarRole(int codigo) {
		iRoleDAO.deleteById(codigo);

	}

}
