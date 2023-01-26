package com.company.design.observer;

public class observerMain {

    public void observerMain(){

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
