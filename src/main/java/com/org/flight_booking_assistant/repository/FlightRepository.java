package com.org.flight_booking_assistant.repository;

import com.org.flight_booking_assistant.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findBySourceIgnoreCaseAndDestinationIgnoreCase(String source, String destination);

    Flight findByFlightNumber(String flightNumber);
}
