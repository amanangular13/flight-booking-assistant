package com.org.flight_booking_assistant.config;

import com.org.flight_booking_assistant.tool.FlightTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Configuration
public class AIConfig {

    @Bean
    public ChatClient chatClient(
            ChatClient.Builder builder,
            FlightTools flightTools,
            MessageChatMemoryAdvisor messageChatMemoryAdvisor,
            VectorStore vectorStore,
            @Value("classpath:prompts/system.txt") Resource systemPrompt
    ) throws IOException {

        String systemPromptText =
                systemPrompt.getContentAsString(StandardCharsets.UTF_8);

        QuestionAnswerAdvisor questionAnswerAdviser = QuestionAnswerAdvisor.builder(vectorStore).build();

        return builder
                .defaultSystem(systemPromptText)
                .defaultAdvisors(new SimpleLoggerAdvisor(), messageChatMemoryAdvisor, questionAnswerAdviser)
                .defaultTools(flightTools)
                .build();
    }

    @Bean
    public ChatMemory chatMemory() {
        return MessageWindowChatMemory.builder()
                .maxMessages(20)
                .build();
    }

    @Bean
    public MessageChatMemoryAdvisor chatMemoryAdvisor(ChatMemory chatMemory) {
        return MessageChatMemoryAdvisor.builder(chatMemory).build();
    }

    @Bean
    public VectorStore vectorStore(EmbeddingModel embeddingModel) {
        return SimpleVectorStore.builder(embeddingModel)
                .build();
    }
}