package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Service.HotelService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/api")
public class HotelController {

	
	@Autowired
	private HotelService hotelService;
	
	
	
	@PostMapping("/admin/addHotel")
	String addHotel(@RequestBody HotelDto hotelDTO) {
		
		String message = hotelService.addHotels(hotelDTO);
		
		
		return "Added Hotel : " +message;
		
	}
	
	
	@GetMapping("/getAllHotels")
	List<HotelEntity> getAllHotels(){
		
		return hotelService.getAllHotels();
		
	}
	
}
