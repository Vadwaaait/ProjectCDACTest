package com.example.demo.Entity;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@OneToOne
	private UserEntity userE;


	public BookingEntity(UserEntity userE) {
		super();
		this.userE = userE;
	}


	public BookingEntity() {
		super();
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


	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", userE=" + userE + "]";
	}
	
	
	
	
	
}
