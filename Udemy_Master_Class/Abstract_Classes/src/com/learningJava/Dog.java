package com.learningJava;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " chomps on food.");
    }

    @Override
    public void breathe() {

        System.out.println(this.getName() + " pants with tongue out.");
    }
}
