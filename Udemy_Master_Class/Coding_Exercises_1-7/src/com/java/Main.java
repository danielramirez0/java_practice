package com.java;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.1757));
    }

    // Speed converter
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour / 1.609d);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid value");
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    // MegaBytes Converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    // Barking dog
    public static boolean shouldWakeUp(boolean isBarking, int hourOfTheDay) {
        if (hourOfTheDay < 0 || hourOfTheDay > 23) return false;
        return isBarking && (hourOfTheDay < 8 || hourOfTheDay > 22);
    }

    // Leap Year Calculator
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    // Decimal Calculator
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }

    // Equal Sum
    public static boolean hasEqualSum(int a, int b, int c) {
        return a + b == c;
    }

    // Teen Number Checker
    public static boolean hasTeen(int a, int b, int c) {
        if (isTeen(a) || isTeen(b) || isTeen(c)) return true;
        return false;
    }

    public static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
}
