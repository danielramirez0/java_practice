package com.learningJava;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    // No longer needed because interface is on bird class
//    @Override
//    public void fly() {
//        System.out.println(this.getName() + " spreads its wings and flies high.");
//    }
}
