package com.infygo.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import com.infygo.book.entity.Booking;
import com.infygo.book.service.BookingService;

public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	public Booking bookFlight(@RequestParam String passengerName,
							   @RequestParam String passsengerEmail,
							   @RequestParam Long flightId) {
		return bookingService.bookFlight(passengerName, passsengerEmail, flightId);
	}
}
