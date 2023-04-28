/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.IEjemploDAO;
import com.springmeal.backend.dto.Ejemplo;

/**
 * @author aitor
 *
 */
@Service
public class EjemploServiceImpl implements IEjemploService {

	@Autowired
	IEjemploDAO iEjemploDAO;

	@Override
	public List<Ejemplo> listarEjemplos() {
		return iEjemploDAO.findAll();
	}

	@Override
	public Ejemplo guardarEjemplo(Ejemplo ejemplo) {
		return iEjemploDAO.save(ejemplo);
	}

	@Override
	public Ejemplo ejemploById(int codigo) {
		return iEjemploDAO.findById(codigo).get();
	}

	@Override
	public Ejemplo actualizarEjemplo(Ejemplo ejemplo) {
		return iEjemploDAO.save(ejemplo);
	}

	@Override
	public void eliminarEjemplo(int codigo) {
		iEjemploDAO.deleteById(codigo);

	}

}
