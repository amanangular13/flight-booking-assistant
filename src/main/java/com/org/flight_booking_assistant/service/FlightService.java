package com.org.flight_booking_assistant.service;

import com.org.flight_booking_assistant.entity.Flight;
import com.org.flight_booking_assistant.repository.FlightRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    @Transactional
    public String bookFlight(String flightNumber) {
        Flight flight = flightRepository.findByFlightNumber(flightNumber);

        if (flight.getAvailableSeats() <= 0) {
            return "Flight is sold out.";
        }

        flight.setAvailableSeats(flight.getAvailableSeats() - 1);
        flightRepository.save(flight);
        return "Flight " + flightNumber + " booked successfully.";
    }
}
