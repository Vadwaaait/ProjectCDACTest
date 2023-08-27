package com.example.demo.ServiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.BookingRepo;
import com.example.demo.Repo.HotelRepo;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	
	
	@Autowired
	private HotelRepo hotelRepo;
	
	
	
	@Autowired
	private BookingRepo bookingRepo;
	

	

	@Override
	public String addUser(UserDTO userDto) {
		
		
		UserEntity userEntity = new UserEntity(
			
				userDto.getUserName(),
				userDto.getUserEmail(),
				userDto.getUserPassword()
				
				);
		
		userRepo.save(userEntity);
		return "User Added :  "+ userEntity.getUserName() ;
		
		
		
		
		
	}





	@Override
	public List<UserEntity> getAllUsers() {
		
	
		
		return userRepo.findAll();
		
		
	}





	@Override
	public String makeBook(UserDTO userDto, HotelDto hotelDto) {
		UserEntity uInfo;
		Date fromDate=(Date) userDto.getFromDate();
		Date toDate=(Date)userDto.getToDate();
		int noOfDays=userDto.getNoOfDays();
		double amountPaid=userDto.getAmountPaid();
		HotelEntity hInfo=null;
		List<UserEntity> ue= userRepo.findAll();
		List<HotelEntity> he = hotelRepo.findAll();
		
		for(HotelEntity e : he)
		{
			if(e.getHotelId()==userDto.getHotelid())
			{
				hInfo=e;
			
			}
		}
		
		
		for(UserEntity e  : ue)
		{
			
			if(e.getUserId()==userDto.getUserId())
			{
				BookingEntity be = new BookingEntity(e,hInfo,fromDate,toDate,noOfDays,amountPaid);
				bookingRepo.save(be);
				return "Booked";
			}
		}
		
		
		
		
		
		
		
		return "Not Booked";
		
	}





	@Override
	public HotelEntity searchHotel(String name) {
		
	 List<HotelEntity> lhe=	hotelRepo.findAll();
		
	 	for(HotelEntity he : lhe)
	 	{
	 		if(he.getHotelName().equals(name))
	 			return he;
	 	}
	 
		return null;
	}





	@Override
	public HotelEntity getHotelById(int id) {
		
		List<HotelEntity> lhe= hotelRepo.findAll();
		
		for(HotelEntity he:lhe)
		{
			if(he.getHotelId()==id)
				return he;
		}
		
		return null;
	}





	@Override
	public List<BookingEntity> getMyBookings(int userId) {
		
		List<BookingEntity> lbe=bookingRepo.findAll();
		
		
		List<BookingEntity> bookingList=new ArrayList<>();
		
		
		for(BookingEntity be : lbe)
		{
			if(be.getUserE().getUserId()==userId)
			{
				bookingList.add(be);
			}
		}
		
		return bookingList;
	}





	@Override
	public UserEntity login(UserDTO userDto) {
		
		
		List<UserEntity> lue = userRepo.findAll();
		
		for(UserEntity ue  : lue)
		{
			if(userDto.getUserEmail().equals(ue.getUserEmail()) && userDto.getUserPassword().equals(ue.getUserPassword()))
			{
				return ue;
			}
		}
		
		return null;
	}





	@Override
	public List<HotelEntity> getHotelsByCity(String hotelCity) {
		
			List<HotelEntity> lhe=hotelRepo.findAll();
			
			List<HotelEntity> myCityHotels = new ArrayList<>(); 
		
			for(HotelEntity he : lhe)
			{
				
				if(he.getHotelCity().equals(hotelCity))
				{
					myCityHotels.add(he);
				}
				
			}
			
			
			
			
		return myCityHotels;
	}









	
	
	
	
}