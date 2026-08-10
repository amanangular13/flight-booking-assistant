package com.org.flight_booking_assistant.controller;

import com.org.flight_booking_assistant.dto.ChatRequest;
import com.org.flight_booking_assistant.dto.ChatResponse;
import com.org.flight_booking_assistant.entity.Flight;
import com.org.flight_booking_assistant.service.flightAssistantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {

    private final flightAssistantService flightAssistantService;

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest chatRequest) {
        String response = flightAssistantService.chat(chatRequest);
        return new ChatResponse(response);
    }
}
