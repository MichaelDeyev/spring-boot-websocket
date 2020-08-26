package com.javatechie.spring.ws.api.services;

import com.javatechie.spring.ws.api.model.ChatMessage;

import java.util.List;

public interface ChatService {
    void saveMessage(ChatMessage message);

    Iterable<ChatMessage> loadMessage();
}
