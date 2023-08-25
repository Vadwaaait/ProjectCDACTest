package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PracticeSpring1Application implements CommandLineRunner{

	@Autowired
	PasswordEncoder passe;
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(passe.encode("pogo"));
	}

}
