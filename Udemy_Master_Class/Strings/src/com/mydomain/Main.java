package com.mydomain;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is = " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95"; // Will concatenate strings, not sum
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // same thing, it will append because lastString is string
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
        // Strings are actually immutable and a new string is created and the old one is discarded
        // Better to use something like StringBuffer (in a later module) for strings that need to be mutated
    }
}
