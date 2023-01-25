package com.company.design.decorator;

import com.company.design.decorator.ICar;

public class AudiDecorator implements ICar{

    protected ICar audi;
    protected String moduleName;
    protected int modulePrice;

    public AudiDecorator(ICar audi, String moduleName, int modulePrice){
        this.audi = audi;
        this.moduleName = moduleName;
        this.modulePrice = modulePrice;
    }


    @Override
    public int getPrice() {
        return modulePrice + audi.getPrice();
    }

    @Override
    public void showPrice() {
        System.out.println(moduleName+"의 가격은 "+getPrice()+" 원 입니다.");
    }
}
