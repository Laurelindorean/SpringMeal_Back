/**
 * 
 */
package com.springmeal.backend.dto.user;

/**
 * @author Palmira
 *
 */
//This class will be used to protect all the private data of the user
public class UserDTO {

	private String username;
	private String name;
	private String surname;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
