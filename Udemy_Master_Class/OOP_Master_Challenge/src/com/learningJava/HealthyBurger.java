package com.learningJava;

public class HealthyBurger extends  Hamburger{

    private String healthyAddonOne;
    private double healthyAddonOnePrice;

    private String healthyAddonTwo;
    private double healthyAddonTwoPrice;

    public HealthyBurger( String meat, double basePrice) {
        super("Healthy", meat, "Wheat", basePrice);
    }

    public void addHealthyAddonOne(String name, double price) {
        this.healthyAddonOne = name;
        this.healthyAddonOnePrice = price;
    }
    public void addHealthyAddonTwo(String name, double price) {
        this.healthyAddonTwo = name;
        this.healthyAddonTwoPrice = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyAddonOne != null){
            hamburgerPrice += healthyAddonOnePrice;
            System.out.println("Added " + healthyAddonOne + " for $" + healthyAddonOnePrice);
        }
        if (this.healthyAddonTwo != null){
            hamburgerPrice += healthyAddonTwoPrice;
            System.out.println("Added " + healthyAddonTwo + " for $" + healthyAddonTwoPrice);
        }
        return hamburgerPrice;
    }
}
