package com.learningJava;

public class Main {

    public static void main(String[] args) {

    }

    // Area calculator
    public static double area(double radius){
        if (radius < 0 ) return -1;
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0) return -1;
        return x * y;
    }

    // Minutes to years and days
    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days /365;
        long remainingDays = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }

    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a ==b && b == c){
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && a != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            return temperature <=45 && temperature >=25;
        }
        return temperature <=35 && temperature >=25;
    }
}
