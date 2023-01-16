package com.company.design.adaptor;

public class Airconditioner implements Electronic220V{

   @Override
    public void connect(){
        System.out.println("Air-conditioner On");
    }


}
