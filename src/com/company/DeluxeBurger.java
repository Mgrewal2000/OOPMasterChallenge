package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", "Sausag & bacon", 14.54, "White");
        super.adHamburgerAddition1("Chips", 2.75);
        super.adHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void adHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Can not add anything more!!");
    }

    @Override
    public void adHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Can not add anything more!!");
    }

    @Override
    public void adHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Can not add anything more!!");
    }

    @Override
    public void adHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Can not add anything more!!");
    }
}
