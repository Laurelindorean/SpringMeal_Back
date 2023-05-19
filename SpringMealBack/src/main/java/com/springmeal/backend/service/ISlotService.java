/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import com.springmeal.backend.dto.Slot;

/**
 * @author Palmira
 *
 */
public interface ISlotService {

	// CRUD Methods
	public List<Slot> listSlot();

	public Slot saveSlot(Slot slot);

	public Slot findByID(int id);

	public Slot updateSlot(Slot slot);

	public void deleteSlot(int id);

}
