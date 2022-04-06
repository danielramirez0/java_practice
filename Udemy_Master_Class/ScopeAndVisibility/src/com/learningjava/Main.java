package com.learningjava;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String privateVariable = "this is private from main";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeCheck privateVariable = " + scopeCheck.getPrivateVariable());
        System.out.println(privateVariable);

        scopeCheck.timesTwo();

        System.out.println("*****************");

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();

        scopeCheck.innerClassCheck();

        System.out.println("Otherwise, variables will not be accessible");
        System.out.println("Does not work here, innerClass.containerPrivate");
//        System.out.println(innerClass.innerPrivateVar); //does not work either


        // Challenge
//        System.out.println("Please enter a number: ");
//        Scanner s = new Scanner(System.in);
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
