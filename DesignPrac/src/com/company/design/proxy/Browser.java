package com.company.design.proxy;

public class Browser implements iBrowser{

    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show(){
        System.out.println("Borwser loading html from "+url);
        return new Html(url);
    }


}
