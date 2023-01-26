package com.company.design.observer;

public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }
    public void addListener(IButtonListener buttonListener){
        this.buttonListener = buttonListener;
    }
    public void click(String message){
        try {
            buttonListener.clickEvent(message);
        }
        catch(NullPointerException e){
            System.out.println("Please add Listener before click");
        }
    }

}
