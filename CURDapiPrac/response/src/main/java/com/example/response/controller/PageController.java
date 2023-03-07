package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PageController {


    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntity => 사용자의 HttpRequest에 대한 응답을 포함하는 클래스
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("Steve");
        user.setAddress("Seoul");
        return user;
    }


}
