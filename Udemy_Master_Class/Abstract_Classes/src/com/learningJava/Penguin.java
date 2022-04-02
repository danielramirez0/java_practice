package com.learningJava;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

//   Leave this override because penguins can't fly
    @Override
    public void fly() {
        System.out.println(this.getName() + " cannot fly, it swims instead.");
    }
}
