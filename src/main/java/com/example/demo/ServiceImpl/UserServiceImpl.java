package com.example.demo.ServiceImpl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.io.Console;
import java.sql.Date;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.BookingDTO;
import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.Role;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.BookingRepo;
import com.example.demo.Repo.HotelRepo;
import com.example.demo.Repo.RoleRepo;
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
	

	@Autowired
	private RoleRepo roleRepo;
	

	@Override
	public String addUser(UserDTO userDto) {
		
		
		
		UserEntity userEntity = new UserEntity(
				
				userDto.getUserName(),
				userDto.getUserEmail(),
				userDto.getUserPassword()
			
				);
		
//		userEntity.getRoles().add(role);
		
		
		
		
		
		
//		Role role=roleRepo.findById(1).orElse(null);
//		System.out.println(role);
//	
//		userEntity.getRoles().add(role);
//		System.out.println(userEntity);
		
				Role role=roleRepo.findById(1).orElse(null);
				
				userEntity.getRoles().add(role);
		
		
		userRepo.save(userEntity);
		
		return "User Added :  "+ userEntity.getUserId() ;
		
		
		
		
		
	}





	@Override
	public String toString() {
		return "UserServiceImpl [userRepo=" + userRepo + ", hotelRepo=" + hotelRepo + ", bookingRepo=" + bookingRepo
				+ ", roleRepo=" + roleRepo + ", getAllUsers()=" + getAllUsers() + "]";
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
		int noroomsbooked= userDto.getNoroomsbooked();
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
				BookingEntity be = new BookingEntity(e,hInfo,fromDate,toDate,noOfDays,amountPaid,noroomsbooked);
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
		
		
		//order by bookingID descending
		List<BookingEntity> dlbe=bookingRepo.findAll(Sort.by("bookingId").descending());
		
		List<BookingEntity> bookingList=new ArrayList<>();
		
		
		for(BookingEntity be : dlbe)
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





	@Override
	public List<Date> bookingsOnDate(UserDTO userDto) {
		
		int hotellId=userDto.getHotelid();
		Date bookeddate=userDto.getFromDate();
		
		HotelEntity he=hotelRepo.findById(hotellId).orElse(null);
	
		List<BookingEntity> lbe=bookingRepo.findbooked(bookeddate, he);
		List<Date> ld=new ArrayList<>();
		
		for(BookingEntity b : lbe)
		{
			ld.add(b.getFromDate());
		}
		
		System.out.println(lbe);
	
		
		return ld;
	}





	@Override
	public int getBookingCountOfUser(UserDTO udto) {
			
//		int count=bookingRepo.getBookingCountOfUser(bdto.getUserE());
		
		
		List<BookingEntity> lbe = bookingRepo.findAll();
		
		int count =0;
		
		for(BookingEntity be:lbe)
		{
			
			if(be.getUserE().getUserId() == udto.getUserId())
				count++;
		}
		
		System.out.println("Count is : "+count);
		
		return count;
	}





	



	
	
	
	
}