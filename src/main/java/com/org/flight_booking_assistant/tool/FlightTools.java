package com.org.flight_booking_assistant.tool;

import com.org.flight_booking_assistant.entity.Flight;
import com.org.flight_booking_assistant.repository.FlightRepository;
import com.org.flight_booking_assistant.service.FlightAssistantService;
import com.org.flight_booking_assistant.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FlightTools {

    private final FlightService flightService;
    private final FlightRepository flightRepository;

    @Tool(description = "Search for available flights between two cities")
    public List<Flight> searchFlights(String source, String destination) {
        return flightRepository.findBySourceIgnoreCaseAndDestinationIgnoreCase(source, destination);
    }

    @Tool(description = "Book one seat on a flight")
    public String bookFlight(String flightNumber) {
        return flightService.bookFlight(flightNumber);
    }
}