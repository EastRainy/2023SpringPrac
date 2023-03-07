package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }
    //http://localhost:8080/api/text?account=user100 <요청

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
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; //사용시 response 200 예상
    }

    //ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }








}
