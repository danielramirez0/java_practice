package com.java;

public class Main {

    // Keywords are reserved words in Java for specific uses. There are 53 and are colored same as above public static void
    public static void main(String[] args) {
        // Expressions
        int score = 100; // expression is score = 100, statement = int score = 100;
        if(score > 99) { // score > 99 is expression, whole line is statement
            System.out.println("You got the hight score!"); // "You got ..." is the expression
        }

        int myVariable=50; // whole thing is a statement
        myVariable++; //statement
        myVariable--; //statement
        System.out.println("This is an expression in the statement");

        System.out.println("This is" +  " another" + " expression in a statement.");

        int anotherVariable = 50; myVariable--;System.out.println("Still valid code, but bad format"); // multiple statements in-line
    }

}
