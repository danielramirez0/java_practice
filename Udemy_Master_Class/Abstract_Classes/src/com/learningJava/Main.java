package com.learningJava;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian Parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("King Penguin");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
