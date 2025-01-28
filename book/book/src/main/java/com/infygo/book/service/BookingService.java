package com.infygo.book.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.infygo.book.entity.Booking;
import com.infygo.book.entity.Flight;
import com.infygo.book.repository.BookingRepository;
import com.infygo.book.repository.FlightRepository;

public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private FlightRepository flightRepository;
	
	public Booking bookFlight(String passenegerName, String passengerEmail, Long flightId) {
		Optional<Flight> flightOptional = flightRepository.findById(flightId);
		if(flightOptional.isEmpty() || flightOptional.get().getAvailableSeats() <= 0) {
			throw new RuntimeException("Flight not available or fully booked.");
		}
		Flight flight = flightOptional.get();
		flight.setAvailableSeats(flight.getAvailableSeats() - 1);
		flightRepository.save(flight);
		
		Booking booking = new Booking();
		booking.setPassengerName(passenegerName);
		booking.setPassengerEmail(passengerEmail);
		booking.setFlightId(flightId);
		return bookingRepository.save(booking);
	}
}
