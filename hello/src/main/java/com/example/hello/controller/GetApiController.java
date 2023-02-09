package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")       //http://localhost:9090/api/get/hello
    public String hello(){
        return "get hello";
    }
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    @RequestMapping("/PathVariable/{name}") //URL PATH로 받은 값을 변수로 사용
    public String pathVariable(@PathVariable(name = "name") String pathName){

        System.out.println("PathVarialble : "+ pathName);

        return pathName;

    }

    //==>http://localhost:9090/api/get/query-param?name=Eastrainy&email=test@gamil.com&age=30
    //값을 여러개 받을때
    
    //맵형태로 이용
    @RequestMapping(path="query-param")
    public String queryParam(Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() +"\n");
        });

        return sb.toString();
    }
    //각각 변수명으로 이용
    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age){

        System.out.println("name");
        System.out.println("email");
        System.out.println("age");

        return name + "  " + email + " " + age;

    }

    //dto생성 이용
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println((userRequest.getEmail()));
        System.out.println(userRequest.getAge());


        return userRequest.toString();
    }
}
