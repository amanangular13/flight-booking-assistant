package com.org.flight_booking_assistant.dto;

public record ChatRequest(
        String sessionId,
        String message) {
}
