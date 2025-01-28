package com.infygo.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.book.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>  {
 
	
}
