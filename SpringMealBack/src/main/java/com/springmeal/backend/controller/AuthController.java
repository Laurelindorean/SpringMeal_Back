/**
 * 
 */
package com.springmeal.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springmeal.backend.dao.IUserDAO;
import com.springmeal.backend.dto.auth.JwtResponse;
import com.springmeal.backend.dto.auth.LoginRequest;
import com.springmeal.backend.security.jwt.JwtTokenProvider;
import com.springmeal.backend.security.service.UserDetailsImpl;

/**
 * @author Palmira
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthenticationManager authenticationManager;
	private IUserDAO userDAO;
	private PasswordEncoder encoder;
	private JwtTokenProvider jwtUtils;

	public AuthController(AuthenticationManager authenticationManager, IUserDAO userDAO, PasswordEncoder encoder,
			JwtTokenProvider jwtUtils) {
		super();
		this.authenticationManager = authenticationManager;
		this.userDAO = userDAO;
		this.encoder = encoder;
		this.jwtUtils = jwtUtils;
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername()));
	}
}
