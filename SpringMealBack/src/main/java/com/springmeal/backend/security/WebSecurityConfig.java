/**
 * 
 */
package com.springmeal.backend.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.util.pattern.PathPatternParser;

import com.springmeal.backend.security.jwt.AuthEntryPointJwt;
import com.springmeal.backend.security.jwt.JwtAuthenticationFilter;
import com.springmeal.backend.security.service.UserDetailsServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author Palmira
 *
 */
@Configuration
@EnableMethodSecurity
public class WebSecurityConfig {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	@Autowired
	private AuthEntryPointJwt unauthorizedHandler;

	@Bean
	JwtAuthenticationFilter authenticationJwtTokenFilter() {
		return new JwtAuthenticationFilter();
	}

	@Bean
	DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.cors().configurationSource(new CorsConfig())
			.and().csrf().disable().exceptionHandling().authenticationEntryPoint(unauthorizedHandler)
			.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and().authorizeHttpRequests()
				.requestMatchers("/api/auth/**").permitAll()
				.anyRequest().authenticated();

		http.authenticationProvider(this.authenticationProvider());

		http.addFilterBefore(this.authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);

		return http.build();

	}
	
	private class CorsConfig implements CorsConfigurationSource {
		
		public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
			CorsConfiguration corsConfiguration = new CorsConfiguration();
			corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));  // Permitir todos los orígenes, cambiar según tus necesidades
			corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE"));  // Permitir los métodos HTTP que desees
			corsConfiguration.setAllowedHeaders(List.of("*"));  // Permitir todos los headers, cambiar según tus necesidades
			corsConfiguration.setAllowCredentials(true);  // Permitir envío de cookies de autenticación, si aplica
			//corsConfiguration.setPathMatcher(new PathPatternParser().getPathMatcher());  // Configuración del path matcher
			
			return corsConfiguration; 
		}		
	}
}
