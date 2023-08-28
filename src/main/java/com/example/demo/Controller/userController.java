package com.example.demo.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("api/user")
public class userController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public String SaveUser(@RequestBody UserDTO userDto) {
		
		try {
			
			String id=userService.addUser(userDto);
			return id;	
		}
		catch(Exception e)
		{
			return "Some error has occured";
		}
		
		
	}
	
	
	@GetMapping("/getUsers")
	public List<UserEntity> getUsers(){
		
		
		
		return userService.getAllUsers();
		
		
		
		
	}
	
	
	@PostMapping("/makeBooking")
	public String makeBook(@RequestBody UserDTO userDTO, HotelDto hotelDto)
	{
		userService.makeBook(userDTO,hotelDto);
		
		return  " : User Booking is Done as of now";
		
	}
	
	@GetMapping("/hotel/{hotelname}")
	public HotelEntity searchHotel(@PathVariable("hotelname") String hotelName)
	{
		
		
		
		return userService.searchHotel(hotelName);
		
	}
	
	@GetMapping("/hotel/id/{hotelid}")
	public HotelEntity getHotelById(@PathVariable("hotelid") int hotelid)
	{
		
		return userService.getHotelById(hotelid);
	}
	
	@GetMapping("/bookings/{userId}")
	public List<BookingEntity> getMyBookings(@PathVariable("userId") int userId)
	{
		
		
		
		return userService.getMyBookings(userId);
	}
	
	
	
	@PostMapping("/login")
	public UserEntity Login(@RequestBody UserDTO userDto)
	{
		
		
		
		return userService.login(userDto);
	}
	
	
	@GetMapping("/cityHotels/{hotelCity}")
	public List<HotelEntity> getHotelsByCity(@PathVariable String hotelCity)
	{
		
		
		
		return userService.getHotelsByCity(hotelCity);
	}
	

}
