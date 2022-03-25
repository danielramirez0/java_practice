package com.learningJava;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double basePrice;

    private String addonOneName;
    private double addonOnePrice;

    private String addonTwoName;
    private double addonTwoPrice;

    private String addonThreeName;
    private double addonThreePrice;

    private String addonFourName;
    private double addonFourPrice;

    public Hamburger(String name, String meat, String breadRollType, double basePrice) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.basePrice = basePrice;
    }

    public void addHamburgerAddonOne(String name, double price) {
        this.addonOneName = name;
        this.addonOnePrice = price;
    }

    public void addHamburgerAddonTwo(String name, double price) {
        this.addonTwoName = name;
        this.addonTwoPrice = price;
    }

    public void addHamburgerAddonThree(String name, double price) {
        this.addonThreeName = name;
        this.addonThreePrice = price;
    }

    public void addHamburgerAddonFour(String name, double price) {
        this.addonFourName = name;
        this.addonFourPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll, with " + meat + " is $" + this.basePrice);
        if (addonOneName != null) {
            hamburgerPrice += addonOnePrice;
            System.out.println("Added " + addonOneName + " for $" + addonOnePrice);
        }
        if (addonTwoName != null) {
            hamburgerPrice += addonTwoPrice;
            System.out.println("Added " + addonTwoName + " for $" + addonTwoPrice);
        }
        if (addonThreeName != null) {
            hamburgerPrice += addonThreePrice;
            System.out.println("Added " + addonThreeName + " for $" + addonThreePrice);
        }
        if (addonFourName != null) {
            hamburgerPrice += addonFourPrice;
            System.out.println("Added " + addonFourName + " for $" + addonFourPrice);
        }
        if (hamburgerPrice > this.basePrice) {
            System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + meat + " and addons price is $" + hamburgerPrice);
        }
        return hamburgerPrice;
    }
}
