package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.BookingDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;

import java.util.List;
import java.sql.Date;



@EnableJpaRepositories
@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Integer>{

		@Query("SELECT B from BookingEntity B where hotelE=?2 and fromDate=?1")
		List<BookingEntity> findbooked(Date fromdate, HotelEntity hotellid);
		
		
	
	
}
