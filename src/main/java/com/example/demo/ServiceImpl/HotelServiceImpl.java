package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Repo.HotelRepo;
import com.example.demo.Service.HotelService;


@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepo hotelRepo;
	
	
	@Override
	public String addHotels(HotelDto hotelDto) {
		
		HotelEntity hotelE = new HotelEntity(hotelDto.getHotelName(), hotelDto.getHotelCity(), hotelDto.getHotelAddress(), hotelDto.getHotelPrice(), hotelDto.getNoOfRooms());
		
		hotelRepo.save(hotelE);
		
		
		return "Added : " +hotelE.getHotelName() ;
	}


	@Override
	public List<HotelEntity> getAllHotels() {
		
		List<HotelEntity> hotelsAll = hotelRepo.findAll();
		
		return hotelsAll;
	}
	
	

}
