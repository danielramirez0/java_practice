package com.learningJava;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorkie",2, 4, 1, 20,1,1, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.steer(15);
        outlander.accelerate(50);
        outlander.steer(-60);
        outlander.accelerate(-78);
        outlander.accelerate(-2);
    }
}
