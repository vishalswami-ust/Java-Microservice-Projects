package com.iiht.ima.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class ConfigSec {
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf->csrf.disable()).
		authorizeHttpRequests((authorize)-> authorize.anyRequest().authenticated()).
		httpBasic(Customizer.withDefaults());
		
	return http.build();}
	
	@Bean
	InMemoryUserDetailsManager uds() {
		UserDetails ud = User.builder().username("vishal").password("{noop}swami").roles("ADMIN").build();
		UserDetails ad = User.builder().username("adarsh").password("{noop}ajila").roles("USER").build();	
		return new InMemoryUserDetailsManager(ud, ad);
	}
}
