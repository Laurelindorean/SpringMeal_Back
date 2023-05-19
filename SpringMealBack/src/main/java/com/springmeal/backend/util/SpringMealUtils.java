package com.springmeal.backend.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.springmeal.backend.security.service.UserDetailsImpl;

/**
 * 
 * @author Palmira
 *
 */
public class SpringMealUtils {
	
	public static UserDetailsImpl  getUserDetails() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return (UserDetailsImpl) authentication.getPrincipal();
	}
}
