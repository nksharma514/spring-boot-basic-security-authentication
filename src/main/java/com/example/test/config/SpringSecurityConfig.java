package com.example.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@SuppressWarnings("deprecation")		// not required
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("narendra").password("{noop}password").roles("ADMIN");
		//security based on ROLE
//		auth.inMemoryAuthentication().withUser("naren").password("{noop}pass").roles("USER");		

	}
	
	
	
	

//	Security for all API request(Authentication password required for all API request)

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();

	}
	
	
	
	
	

//	Security Based on URL, security for url start with /rest/ (Authentication password required for only API mapped with URL Based, here url start with /rest only password required)

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
//
//	}
	
	
	

	
//	Security Based on ROLE (Only ADMIN can Access with URL start form /rest, show error for USER with 403 forbidden error)
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and()
//				.httpBasic();
//
//	}
	
	


	
//	Not Required to write this code shows error
	
//	@Bean
//	public static NoOpPasswordEncoder passwordEncoder() {
//		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}

}
