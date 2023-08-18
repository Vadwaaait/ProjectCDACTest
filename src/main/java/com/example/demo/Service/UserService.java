package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;

public interface UserService {

	
	String addUser(UserDTO userDto);
	
	
	List<UserEntity> getAllUsers();

	
	String makeBook(UserDTO userDto, HotelDto hotelDto);
	
	
	
}
