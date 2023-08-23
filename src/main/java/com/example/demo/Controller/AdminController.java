package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	AdminService adminServie;
	
	
	@PostMapping("/save")
	public String saveAdmin(@RequestBody AdminDTO adminDto) {
		
		try {
			
			String id=adminServie.addAdmin(adminDto);
			return id;	
		}
		catch(Exception e)
		{
			return "Some error has occured";
		}
		
		
	}
	
	

}
