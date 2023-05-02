/**
 * 
 */
package com.springmeal.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmeal.backend.dto.User;

/**
 * @author aitor
 *
 */
public interface IUserDAO extends JpaRepository<User, Integer> {

}
