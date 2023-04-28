/**
 * 
 */
package com.springmeal.backend.dto;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name="slot")
public class Slot {
	
	//Atributes
	
	@Id
	private int id;
	private Time start;
	private Time end;

	
}
