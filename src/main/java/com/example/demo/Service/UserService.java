package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;

public interface UserService {

	
	UserEntity login(UserDTO userDto);
	
	String addUser(UserDTO userDto);
	
	
	List<UserEntity> getAllUsers();

	
	String makeBook(UserDTO userDto, HotelDto hotelDto);
	
	
	HotelEntity searchHotel(String name);
	
	HotelEntity getHotelById(int id);
	
	
	List<BookingEntity> getMyBookings(int userId);
	
	List<HotelEntity> getHotelsByCity(String hotelCity);
	
}
