package com.example.demo.Dto;

import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;

public class BookingDTO {

	private int bookingId;
	
	private UserEntity userE;
	
	private HotelEntity hotelE;

	public BookingDTO( UserEntity userE, HotelEntity hotelE) {
		super();
	
		this.userE = userE;
		this.hotelE = hotelE;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public UserEntity getUserE() {
		return userE;
	}

	public void setUserE(UserEntity userE) {
		this.userE = userE;
	}

	public HotelEntity getHotelE() {
		return hotelE;
	}

	public void setHotelE(HotelEntity hotelE) {
		this.hotelE = hotelE;
	}

	@Override
	public String toString() {
		return "BookingDTO [bookingId=" + bookingId + ", userE=" + userE + ", hotelE=" + hotelE + "]";
	}
	
	
	
	
	
	
	
	
}
