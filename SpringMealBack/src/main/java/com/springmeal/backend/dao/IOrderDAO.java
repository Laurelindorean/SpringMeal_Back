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

	final String DATE_SUBQUERY = "IF(:cmp = '=', date = :date, date >= :date)";
	
	@Query(value = "SELECT * FROM orders WHERE "+DATE_SUBQUERY, nativeQuery = true)
    List<Order> findByDate(@Param("date") Date date, @Param("cmp") String cmp);
	
	@Query(value = "SELECT * FROM orders WHERE id_user = :user AND "+DATE_SUBQUERY, nativeQuery = true)
    List<Order> findByUserDate(@Param("user") int user, @Param("date") Date date, @Param("cmp") String cmp);
	
	@Query(value = "SELECT * FROM orders WHERE id_slot = :slot AND date = :date", nativeQuery = true)
	List<Order> findBySlotDate(@Param("slot") int slot, @Param("date") Date date);
	
}
