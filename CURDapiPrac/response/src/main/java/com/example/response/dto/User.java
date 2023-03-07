package com.example.response.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
/*
    PropertyNamingStrategy => 종류가 여러가지인데, LowerCamelCaseStrategy => 'lowerCamelCase'
                                                LowerCaseStrategy => 'lowercase'
                                                SnakeCaseStrategy => 'snake_case_strategy'
                                                UpperCamelCaseStrategy => 'UpperCamelCase'
                                                KebabCaseStrategy => 'kebab-case-strategy', 참조
*/
//@JsonInclude(JsonInclude.Include.NON_NULL) =>NULL인 항목의 값을 보이지 않게 생략
public class User {

    private String name;
    private Integer age;
    private String phoneNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
