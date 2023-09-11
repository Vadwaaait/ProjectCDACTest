package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.ImageEntity;
import com.example.demo.Entity.UserEntity;

public interface AdminService {

	String addAdmin(UserDTO userDto);
	
	
	UserEntity loginAdmin(UserDTO userDto);
	
	HotelEntity editHotelById(HotelDto hotelDto);
	
	
	String deleteHotelById(int hotid);
	
	List<BookingEntity> allbookingdetails();
	
	String getImage(int id);
}
