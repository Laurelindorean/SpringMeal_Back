/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Ejemplo;

/**
 * @author aitor
 *
 */
public interface IEjemploService {
	// Metodos del CRUD
	public List<Ejemplo> listarEjemplos(); // Listar All

	public Ejemplo guardarEjemplo(Ejemplo ejemplo); // Guarda un departamento CREATE

	public Ejemplo ejemploById(int codigo); // Leer datos de un departamento READ

	public Ejemplo actualizarEjemplo(Ejemplo ejemplo); // Actualiza datos del departamento UPDATE

	public void eliminarEjemplo(int codigo);// Elimina el departamento DELETE
}
