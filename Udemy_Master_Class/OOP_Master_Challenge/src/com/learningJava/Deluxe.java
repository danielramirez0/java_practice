package com.learningJava;

public class Deluxe extends Hamburger {
    public Deluxe() {
        super("Deluxe", "Sausage and Bacon", "White", 15.41);
        super.addHamburgerAddonOne("Chips", 2.75);
        super.addHamburgerAddonTwo("Drink", 4.75);
    }

    @Override
    public void addHamburgerAddonOne(String name, double price) {
        System.out.println("Not allowed to add items");
    }

    @Override
    public void addHamburgerAddonTwo(String name, double price) {
        System.out.println("Not allowed to add items");
    }

    @Override
    public void addHamburgerAddonThree(String name, double price) {
        System.out.println("Not allowed to add items");
    }

    @Override
    public void addHamburgerAddonFour(String name, double price) {
        System.out.println("Not allowed to add items");
    }
}
