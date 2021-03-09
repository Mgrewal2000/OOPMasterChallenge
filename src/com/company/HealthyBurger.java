package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public double itemizeHamburger(){
        double healthyBurger = super.itemizehamburger();
        if(healthyExtra1Name!= null){
            healthyBurger += healthyExtra1Price;
            System.out.println("Add on :" + this.healthyExtra1Name + " for price:" + this.healthyExtra1Price);
        }

        if(healthyExtra2Name!= null){
            healthyBurger += healthyExtra2Price;
            System.out.println("Add on :" + this.healthyExtra2Name + " for price:" + this.healthyExtra2Price);
        }
        return healthyBurger;
    }
}
