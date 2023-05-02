/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Ejemplo;

/**
 * @author aitor
 *
 */
public interface IEjemploDAO extends JpaRepository<Ejemplo, Integer> {

}
