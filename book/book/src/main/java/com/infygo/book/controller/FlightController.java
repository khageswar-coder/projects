package com.infygo.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.book.entity.Flight;
import com.infygo.book.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	public List<Flight> searchFlights(@RequestParam String origin, @RequestParam String destination){
		return flightService.searchFlights(origin, destination);
	  }
	}
