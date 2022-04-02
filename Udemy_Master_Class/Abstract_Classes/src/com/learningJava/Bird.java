package com.learningJava;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " pecks its food.");
    }

    @Override
    public void breathe() {
        System.out.println(this.getName() + " lets out a little tweet.");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flapping wings");
    }
}
