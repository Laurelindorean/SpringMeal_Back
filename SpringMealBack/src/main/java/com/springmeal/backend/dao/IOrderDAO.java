/**
 * 
 */
package com.springmeal.backend.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springmeal.backend.dto.Order;
import com.springmeal.backend.dto.User;
import com.springmeal.backend.dto.Slot;

/**
 * @author Palmira, Joan
 *
 */
public interface IOrderDAO extends JpaRepository<Order, Integer>{
	
	List<Order> findByUser(User user);
	
	@Query(value = "SELECT * FROM orders WHERE date :cmp :date", nativeQuery = true)
    List<Order> findByDate(@Param("date") Date date, @Param("cmp") String cmp);
	
	@Query(value = "SELECT * FROM orders WHERE id_user = :user.id AND date :cmp :date", nativeQuery = true)
    List<Order> findByUserDate(@Param("user") User user, @Param("date") Date date, @Param("cmp") String cmp);
	
	@Query(value = "SELECT * FROM orders WHERE id_slot = :user.id AND date :cmp :date", nativeQuery = true)
	List<Order> findByDate(@Param("slot") Slot slot, @Param("date") Date date);
	
}
