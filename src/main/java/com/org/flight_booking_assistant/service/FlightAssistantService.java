package com.org.flight_booking_assistant.service;

import com.org.flight_booking_assistant.dto.ChatRequest;
import com.org.flight_booking_assistant.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlightAssistantService {

    private final ChatClient chatClient;
    private final FlightRepository flightRepository;

    public String chat(ChatRequest chatRequest) {
        return chatClient
                .prompt()
                .user(chatRequest.message())
                .advisors(advisorSpec -> advisorSpec
                        .param("chat_memory_conversation_id", chatRequest.sessionId()))
                .call()
                .content();
    }
}
