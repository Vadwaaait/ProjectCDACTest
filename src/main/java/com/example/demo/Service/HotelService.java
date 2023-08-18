package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Entity.HotelEntity;

public interface HotelService {

	String addHotels(HotelDto hotelDto);
	
	List<HotelEntity> getAllHotels();
	
}
