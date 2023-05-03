/**
 * 
 */
package com.springmeal.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmeal.backend.dao.ISlotDAO;
import com.springmeal.backend.dto.Slot;

/**
 * @author Palmira
 *
 */
@Service
public class SlotServiceImpl implements ISlotService {

	@Autowired
	ISlotDAO iSlotDAO;

	@Override
	public List<Slot> listSlot() {
		return iSlotDAO.findAll();
	}

	@Override
	public Slot saveSlot(Slot slot) {
		return iSlotDAO.save(slot);
	}

	@Override
	public Slot slotByID(int id) {
		return iSlotDAO.findById(id).get();
	}

	@Override
	public Slot updateSlot(Slot slot) {
		return iSlotDAO.save(slot);
	}

	@Override
	public void deleteSlot(int id) {
		iSlotDAO.deleteById(id);
	}

}
