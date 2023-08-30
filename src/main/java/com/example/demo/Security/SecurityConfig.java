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

import static org.springframework.security.config.Customizer.withDefaults;


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
           .cors()
           .and()
           .csrf().disable() 
           .authorizeHttpRequests((authz) -> authz
                           .requestMatchers("/api/user/getUsers").hasAnyAuthority("USER")
                           .requestMatchers("api/user/**").hasAnyAuthority("USER")
                           .requestMatchers("/payment").hasAnyAuthority("USER","ADMIN")
                           .anyRequest()
                           .authenticated()
                           
           )

           .httpBasic(withDefaults());
    return http.build();

    
//  http
//  .cors()
//  .and()
//  .csrf().disable() 
//  .authorizeHttpRequests((authz) -> authz
//                  .requestMatchers("")
//                  .permitAll()
//                  .anyRequest()
//                  .authenticated()
//                  
//  )
//
//  .httpBasic(withDefaults());
//return http.build();

//------------------------------------------------------------- 
		   
	    }
	   
	   
	   
	   
	 
	   
	   
	   //Ignoring certain end points doesnt need basic auth
	   @Bean
	    public WebSecurityCustomizer webSecurityCustomizer() {
		   
	        return (web) -> web.ignoring().requestMatchers("/api/user/save","/api/admin/save");
	    
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
	
	


	
	
	

