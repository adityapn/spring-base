package com.springboy.Springing.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	@RequestMapping("/user/{user_id}")
    public String index(@PathVariable("user_id") String userId) {
        return "user id is "+userId;
    }
}
