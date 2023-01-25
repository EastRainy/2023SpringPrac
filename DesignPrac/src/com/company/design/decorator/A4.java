package com.company.design.decorator;

public class A4 extends AudiDecorator{
    public A4(ICar audi, String moduleName) {
        super(audi, moduleName, 2000);
    }
}
