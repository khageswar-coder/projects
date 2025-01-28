package com.infygo.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.book.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

	List<Flight>findByOriginAndDestination(String origin, String dstination);
}




