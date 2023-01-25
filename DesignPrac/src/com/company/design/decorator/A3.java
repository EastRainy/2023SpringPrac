package com.company.design.decorator;

public class A3 extends AudiDecorator{
    public A3(ICar audi, String moduleName) {
        super(audi, moduleName, 1000);
    }
}
