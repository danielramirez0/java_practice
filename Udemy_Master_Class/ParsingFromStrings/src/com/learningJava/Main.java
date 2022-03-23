package com.learningJava;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1; // will concatenate
        number += 1; // will add

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String numberAsStringDouble = "2018.125";
        double doubleNumber = Double.parseDouble(numberAsStringDouble);
        System.out.println("doubleNumber = " + doubleNumber);
        doubleNumber += 1;
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
