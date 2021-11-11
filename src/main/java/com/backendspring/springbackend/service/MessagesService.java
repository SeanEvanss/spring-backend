package com.backendspring.springbackend.service;
import java.util.List;
import com.backendspring.springbackend.model.Messages;

public interface MessagesService{
    Messages addMessage(Messages newMessage);

    Messages findByName(String name);

    Messages findByEmail(String email);    
    
    List<Messages> findAll();

}
