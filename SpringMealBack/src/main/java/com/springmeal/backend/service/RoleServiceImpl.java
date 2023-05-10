/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IRoleDAO;
import com.springmeal.backend.dto.Role;
import com.springmeal.backend.dto.User;

/**
 * @author Joan
 *
 */
@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	IRoleDAO iRoleDAO;
	@Autowired
	IUserService userService;

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

	@Override
	public Role findByRole(String role) {
		return iRoleDAO.findByName(role).get();
	}

	@Override
	public void setRoleAdminByIdUser(int idUser) {
		// TODO Auto-generated method stub
		User userEntity = this.userService.userById(idUser);
		userEntity.setRole(this.iRoleDAO.findByName("ROLE_admin").get());
		this.userService.actualizarUser(userEntity);
	}

}
