package com.example.put;

import dto.PutRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto){
        System.out.println(requestDto);
        return requestDto;
    }
}

/*
테스트 사용 JSON형식
(
    "name" : "steve",
    "age" : 20,
    "car_list" : [
        {
            "name" : "Tesla",
            "car_number" : "11가 2222"
         },
         {
            "name" : "BMW",
            "car_number" : "22나 3333"
         }
    ]
)

 */