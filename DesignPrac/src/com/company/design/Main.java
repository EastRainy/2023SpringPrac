package com.company.design;

import com.company.design.decorator.*;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;

public class Main {

    public static void main(String[] args){

        Button b = new Button("버튼");

        b.click("버튼 테스트 1");

        b.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        b.click("버튼 테스트 2");
        b.click("버튼 테스트 3");
        b.click("버튼 테스트 4");


    }
}
