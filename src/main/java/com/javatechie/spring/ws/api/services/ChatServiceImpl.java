package com.javatechie.spring.ws.api.services;

import com.javatechie.spring.ws.api.model.ChatMessage;
import com.javatechie.spring.ws.api.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ChatServiceImpl implements ChatService{

    @Autowired
    private MessageRepo messageRepo;

    @Override
    public void saveMessage(ChatMessage message) {
        messageRepo.save(message);
    }

    @Override
    public Iterable<ChatMessage> loadMessage() {
        return  messageRepo.findAll();
    }

}
