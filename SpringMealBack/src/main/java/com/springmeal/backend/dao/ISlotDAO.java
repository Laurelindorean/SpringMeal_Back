/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.Slot;

/**
 * @author Palmira
 *
 */
public interface ISlotDAO extends JpaRepository<Slot, Integer>{
	


}
