package com.org.flight_booking_assistant.service;

import com.org.flight_booking_assistant.entity.Flight;
import com.org.flight_booking_assistant.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class flightAssistantService {

    private final ChatClient chatClient;
    private final FlightRepository flightRepository;

    public String chat(String message) {
        return chatClient
                .prompt()
                .user(message)
                .call()
                .content();
    }
}
