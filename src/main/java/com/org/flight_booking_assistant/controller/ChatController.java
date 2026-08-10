package com.org.flight_booking_assistant.controller;

import com.org.flight_booking_assistant.dto.ChatRequest;
import com.org.flight_booking_assistant.dto.ChatResponse;
import com.org.flight_booking_assistant.service.FlightAssistanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {

    private final FlightAssistanceService flightAssistanceService;

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest chatRequest) {
        String response = flightAssistanceService.chat(chatRequest.message());
        return new ChatResponse(response);
    }
}
