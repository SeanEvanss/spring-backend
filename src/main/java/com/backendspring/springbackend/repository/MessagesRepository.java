package com.backendspring.springbackend.repository;

import com.backendspring.springbackend.model.Messages;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessagesRepository extends MongoRepository<Messages,String>{
    Messages findByName(String name);

    Messages findByEmail(String email);       
    
}
