package com.backendspring.springbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/starting")
    public String index() {
        return "Initalisation message from spring boot";
    }
    
}
