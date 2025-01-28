package com.infygo.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.book.entity.Flight;
import com.infygo.book.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> searchFlights(String origin, String destination){
		return flightRepository.findByOriginAndDestination(origin, destination);
	}
}
