package com.learningJava;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("It was a " + value);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        // More code

        // Challenge
        char c = 'C';
        switch (c){
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        // JDK > 7 added Strings to switch statement
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(-1);
    }

    // Day of Week challenge
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        if (day == 0) System.out.println("Sunday");
        if (day == 1) System.out.println("Monday");
        if (day == 2) System.out.println("Tuesday");
        if (day == 3) System.out.println("Wednesday");
        if (day == 4) System.out.println("Thursday");
        if (day == 5) System.out.println("Friday");
        if (day == 6) System.out.println("Saturday"); else System.out.println("Invalid day");
    }
}
