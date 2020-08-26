package com.javatechie.spring.ws.api.repos;

import com.javatechie.spring.ws.api.model.ChatMessage;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<ChatMessage, Long>{
}
