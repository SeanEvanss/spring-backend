package com.backendspring.springbackend.service;
import java.util.List;

import com.backendspring.springbackend.model.Messages;
import com.backendspring.springbackend.repository.MessagesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesServiceImpl implements MessagesService {

    @Autowired
    private MessagesRepository messagesRepository;

    @Override
    public Messages addMessage(Messages newMessage) {
        return messagesRepository.save(newMessage);
    }

    @Override
    public Messages findByName(String name) {        
        return messagesRepository.findByName(name);
    }

    @Override
    public Messages findByEmail(String email) {
        return messagesRepository.findByEmail(email);
    }

    @Override
    public List<Messages> findAll() {        
        return messagesRepository.findAll();
    }
}

