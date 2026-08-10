package com.org.flight_booking_assistant.controller;

import com.org.flight_booking_assistant.dto.ChatRequest;
import com.org.flight_booking_assistant.dto.ChatResponse;
import com.org.flight_booking_assistant.service.FlightAssistantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {

    private final FlightAssistantService flightAssistantService;

    @PostMapping
    public String chat(@RequestBody ChatRequest chatRequest) {
        return flightAssistantService.chat(chatRequest);
    }
}
