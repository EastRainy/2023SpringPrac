package com.company.design;


import com.company.design.proxy.*;

import java.util.concurrent.atomic.AtomicLong;
import com.company.design.app.AppBrowser;



public class Main {

    public static void main(String[] args){

        /*
        Browser browser = new Browser("www.naver.com");

        browser.show();
        browser.show();
        browser.show();

        System.out.println("-Proxy chase-");

        iBrowser proxy = new browserProxy("www.naver.com");
        proxy.show();
        proxy.show();
        proxy.show();
        proxy.show();
        */

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        AppBrowser app = new AppBrowser("www.naver.com",
                ()->{
                    System.out.println(" - BEFORE -");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        app.show();
        System.out.println("loading time : " + end.get());
        app.show();
        System.out.println("loading time : " + end.get());


    }
}
