package com.backendspring.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.backendspring.springbackend.model.Messages;
import com.backendspring.springbackend.service.MessagesService;


@RestController
@RequestMapping("/users")
public class controller {
    
    @Autowired
    private MessagesService messageService;

    @GetMapping("/")
    public List<Messages> getMessage() {        
        return messageService.findAll();
    }
    @GetMapping("/{email}")
    public Messages getMessageByEmail(@PathVariable String email) {
        return messageService.findByEmail(email);
    }

    @PostMapping("/create")
    public Messages createMessage(@RequestBody Messages message) {
        return messageService.addMessage(message);        
    }

    
}
