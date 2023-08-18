package com.example.demo.Entity;

import java.util.List;

import org.apache.catalina.User;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@ManyToOne
	private UserEntity userE;
	
	@ManyToOne
	private HotelEntity hotelE;


	


	public BookingEntity(UserEntity userE, HotelEntity hotelE) {
		super();
		this.userE = userE;
		this.hotelE = hotelE;
	}


	public BookingEntity() {
		super();
	}


	public int getBookingId() {
		return bookingId;
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


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", userE=" + userE + ", hotelE=" + hotelE + "]";
	}


	

	
	

	
	
	
	
	
	
}
