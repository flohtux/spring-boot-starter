package com.example.demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    	
    @GetMapping("/user")
    public Map<String, Object> user() {
        return Collections.singletonMap("name", "Florian");
    }

}
