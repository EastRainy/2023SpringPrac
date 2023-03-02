package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }
    //JSON
    /*
    {
        "name" : "Steve",
        "age" : 10,
        "phoneNumber" : "010-1111-2222",
        "address" : "Seoul"
    }
     */
    // req -> objectMapper -> object -> method -> object -> object -> json -> response
    @GetMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }




}
