package com.company;

/**
 *
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void adHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name =addition1Name;
        this.addition1Price = addition1Price;
    }

    public void adHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void adHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name =addition3Name;
        this.addition3Price = addition3Price;
    }

    public void adHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name =addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizehamburger(){
        double hamPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll" + " price is" + this.price);
        if(this.addition1Name != null){
            hamPrice += this.price;
            System.out.println("Added " + this.addition1Name + " for a price of" + this.addition1Price);
        }
        if(this.addition2Name != null){
            hamPrice += this.price;
            System.out.println("Added " + this.addition2Name + " for a price of" + this.addition2Price);
        }
        if(this.addition3Name != null){
            hamPrice += this.price;
            System.out.println("Added " + this.addition3Name + " for a price of" + this.addition3Price);
        }
        if(this.addition4Name != null){
            hamPrice += this.price;
            System.out.println("Added " + this.addition4Name + " for a price of" + this.addition4Price);
        }
        return hamPrice;
    }

}
