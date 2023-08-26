package com.example.demo.Security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	 CustomUserDetailService cuds;
	 
	
		@Bean
		public PasswordEncoder passwordEncoder()
		{
			return NoOpPasswordEncoder.getInstance();
		}
	
	
	
	   @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		   
		

		   
	        http
	        .csrf().disable()
	            .authorizeHttpRequests((authz) -> authz
	                .anyRequest()
	                .authenticated()
	               
	            )
	            .httpBasic();
	        return http.build();
	    }
	   
	   
	   
	   @Bean
	   public AuthenticationManager authenticationManager(HttpSecurity http, NoOpPasswordEncoder bcrypt, CustomUserDetailService cuds) 
	     throws Exception {
	       return http.getSharedObject(AuthenticationManagerBuilder.class)
	         .userDetailsService(cuds)
	         .passwordEncoder(bcrypt)
	         .and()
	         .build();
	   }
	  
	   
	   
	
}
	


	
	
	

