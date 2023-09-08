package com.example.demo.Controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.AdminService;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	AdminService adminServie;
	
	
	
	
	@PostMapping("/save")
	public String saveAdmin(@RequestBody UserDTO adminDto) {
		
		try {
			
			String id=adminServie.addAdmin(adminDto);
			return id;	
		}
		catch(Exception e)
		{
			return "Some error has occured";
		}
		
		
	}
	
	
	
	
	@PostMapping("/AdminLogin")
	public UserEntity loginAdmin(@RequestBody UserDTO userDto)
	{
		
		
		return adminServie.loginAdmin(userDto);
	}
	
	
	@PutMapping("/editHotel")
	public HotelEntity editHotelById(@RequestBody HotelDto hotelDto)
	{
		
		
		return adminServie.editHotelById(hotelDto);
	}
	
	
	@DeleteMapping("/deletehotel/{id}")
	public String deleteHotelById(@PathVariable("id") int hotid)
	{
		
		
		
		return adminServie.deleteHotelById(hotid);
		
	}
	
	@GetMapping("/allbookingdetails")
	public List<BookingEntity> getALlListOfBooking(){
		
		
		return adminServie.allbookingdetails();
	}
	

}
