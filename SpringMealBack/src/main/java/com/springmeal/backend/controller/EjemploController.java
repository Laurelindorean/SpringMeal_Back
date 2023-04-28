/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Ejemplo;
import com.springmeal.backend.service.EjemploServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class EjemploController {

	@Autowired
	EjemploServiceImpl ejemploServiceImpl;

	@GetMapping("/ejemplos")
	public List<Ejemplo> listarEjemplos() {
		return ejemploServiceImpl.listarEjemplos();
	}

	@PostMapping("/ejemplos")
	public Ejemplo guardarEjemplo(@RequestBody Ejemplo ejemplo) {
		return ejemploServiceImpl.guardarEjemplo(ejemplo);
	}

	@GetMapping("/ejemplos/{codigo}")
	public Ejemplo ejemploById(@PathVariable(name = "codigo") int codigo) {
		Ejemplo ejemplo = new Ejemplo();
		ejemplo = ejemploServiceImpl.ejemploById(codigo);
		return ejemplo;
	}

	@PutMapping("/ejemplos/{codigo}")
	public Ejemplo actualizarEjemplo(@PathVariable(name = "codigo") int codigo, @RequestBody Ejemplo ejemplo) {

		Ejemplo ejemplo_seleccionado = new Ejemplo();
		Ejemplo ejemplo_actualizado = new Ejemplo();
		ejemplo_seleccionado = ejemploServiceImpl.ejemploById(codigo);
		ejemplo_seleccionado.setNombre(ejemplo.getNombre());

		ejemplo_actualizado = ejemploServiceImpl.actualizarEjemplo(ejemplo_seleccionado);

		return ejemplo_actualizado;
	}

	@DeleteMapping("/ejemplos/{codigo}")
	public void eliminarEjemplo(@PathVariable(name = "codigo") int codigo) {
		ejemploServiceImpl.eliminarEjemplo(codigo);
	}

}
