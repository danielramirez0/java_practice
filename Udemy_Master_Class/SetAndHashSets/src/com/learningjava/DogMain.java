package com.learningjava;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        // returns true because a Lab is an instance of Dog
        System.out.println(rover2.equals(rover));
        // returns false because a dog is NOT an instance of Lab
        System.out.println(rover.equals(rover2));
    }
}
