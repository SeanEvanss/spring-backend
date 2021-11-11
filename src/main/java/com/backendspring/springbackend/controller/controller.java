package com.backendspring.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.backendspring.springbackend.model.Messages;
import com.backendspring.springbackend.service.MessagesService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/users")
public class controller {
    
    @Autowired
    private MessagesService messageService;

    @GetMapping("/")
    public List<Messages> getMessage() {
        //messageService.findAll().forEach(item-> System.out.println(item));
        return messageService.findAll();
    }
    
}
