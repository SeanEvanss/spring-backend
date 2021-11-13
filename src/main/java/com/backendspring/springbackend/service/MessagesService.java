package com.backendspring.springbackend.service;
import java.util.List;
import java.util.Optional;

import com.backendspring.springbackend.model.Messages;

public interface MessagesService{
    Messages addMessage(Messages newMessage);

    Messages findByName(String name);

    Messages findByEmail(String email);    
    
    List<Messages> findAll();

    

}
