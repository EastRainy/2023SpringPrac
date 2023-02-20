package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData) {

        System.out.println(requestData.toString());

    }

}

/*
테스트 JSON데이터 형식
{
    "account" : "user01",
    "email" : "test@gmail.com",
    "address" : "Seoul",
    "password" : "1q2w3e4r!",
    "phone_number" : "111-222-3333",
    "OTP" : "12345"
}




 */