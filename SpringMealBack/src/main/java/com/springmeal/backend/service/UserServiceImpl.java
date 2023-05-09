/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IUserDAO;
import com.springmeal.backend.dto.User;

/**
 * @author joan
 *
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDAO iUserDAO;

	@Override
	public List<User> listarUsers() {
		return iUserDAO.findAll();
	}

	@Override
	public User guardarUser(User user) {
		return iUserDAO.save(user);
	}

	@Override
	public User findById(int codigo) {
		return iUserDAO.findById(codigo).get();
	}

	@Override
	public User actualizarUser(User user) {
		return iUserDAO.save(user);
	}

	@Override
	public void eliminarUser(int codigo) {
		iUserDAO.deleteById(codigo);

	}

}
