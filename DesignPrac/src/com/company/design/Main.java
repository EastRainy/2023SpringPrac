package com.company.design;

import com.company.design.decorator.*;

public class Main {

    public static void main(String[] args){

        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar A3 = new A3(audi, "A3");
        A3.showPrice();;

        ICar A4 = new A4(audi, "A4");
        A4.showPrice();

        ICar A5 = new A5(audi, "A5");
        A5.showPrice();



    }
}
