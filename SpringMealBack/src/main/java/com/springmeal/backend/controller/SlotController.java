/**
 * 
 */
package com.springmeal.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmeal.backend.dto.Slot;
import com.springmeal.backend.service.SlotServiceImpl;

/**
 * @author Palmira
 *
 */

@RestController
@RequestMapping("/api")
public class SlotController {

	@Autowired
	SlotServiceImpl slotServiceImpl;

	@GetMapping("/slot")
	public List<Slot> listSlot() {
		return slotServiceImpl.listSlot();
	}

	@PostMapping("/slot")
	@PreAuthorize("hasRole('admin')")
	public Slot saveSlot(@RequestBody Slot slot) {
		return slotServiceImpl.saveSlot(slot);
	}

	@GetMapping("/slot/{id}")
	@PreAuthorize("hasRole('admin')")
	public Slot findById(@PathVariable(name = "id") int id) {
		Slot slot_id = new Slot();
		slot_id = slotServiceImpl.findByID(id);
		return slot_id;
	}

	@PutMapping("/slot/{id}")
	@PreAuthorize("hasRole('admin')")
	public Slot updateSlot(@PathVariable(name = "id") int id, @RequestBody Slot slot) {
		Slot slot_sel = new Slot();
		slot_sel = slotServiceImpl.findByID(id);
		slot_sel.setStart(slot.getStart());
		slot_sel.setEnd(slot.getEnd());
		return slotServiceImpl.updateSlot(slot_sel);
	}

	@DeleteMapping("/slot/{id}")
	@PreAuthorize("hasRole('admin')")
	public void deleteSlot(@PathVariable(name = "id") int id) {
		slotServiceImpl.deleteSlot(id);
	}
}
