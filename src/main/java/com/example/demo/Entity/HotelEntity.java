package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="HotelDetails")
public class HotelEntity {
	
	@Id
	@Column(name="hotelId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	
	
	@Column(name="hotelName")
	private String hotelName;
	
	
	@Column(name="hotelCity")
	private String hotelCity;
	
	
	@Column(name="hotelAddress")
	private String hotelAddress;
	
	
	@Column(name="hotelPrice")
	private double hotelPrice;
	
	
	@Column(name="noOfRooms")
	private int noOfRooms;
	
	@OneToMany(mappedBy = "hotelE")
	private List<BookingEntity> bookingE;
	
	
	
	
	
	

	


	public HotelEntity(String hotelName, String hotelCity, String hotelAddress, double hotelPrice,
			int noOfRooms) {
		
		
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelAddress = hotelAddress;
		this.hotelPrice = hotelPrice;
		this.noOfRooms = noOfRooms;
	}


	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	
	

	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public String getHotelCity() {
		return hotelCity;
	}


	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}


	public String getHotelAddress() {
		return hotelAddress;
	}


	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


	public double getHotelPrice() {
		return hotelPrice;
	}


	public void setHotelPrice(double hotelPrice) {
		this.hotelPrice = hotelPrice;
	}


	public HotelEntity() {
		super();
	}


	@Override
	public String toString() {
		return "HotelEntity [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", hotelAddress=" + hotelAddress + ", hotelPrice=" + hotelPrice + "]";
	}
	
	
	
	
	
	
	

}
