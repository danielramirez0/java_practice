package com.learningJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth:");

//        boolean hasNextInt = scanner.hasNextInt();

//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2022 - yearOfBirth;
//
//            if (age > 0 && age < 100) {
//                System.out.println("Your name is " + name + ", and your are " + age + " years old.");
//            } else {
//                System.out.println("Invalid year of birth.");
//            }
//        }else{
//            System.out.println("Use numbers only for year of birth.");
//        }
//
//        scanner.close();

        // Challenge SUM of ten input numbers
//        int count = 1;
//        int sum = 0;
//        while (count <= 10) {
//            System.out.println("Enter number #" + count + ":");
//
//            boolean isInt = scanner.hasNextInt();
//
//            if (isInt) {
//                count++;
//                sum += scanner.nextInt();
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine(); // handle end of line (enter key)
//        }
//        System.out.println(sum);
//        scanner.close();

        // Challenge Min Max

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter a number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int input = scanner.nextInt();
                min = Math.min(min, input);
                max = Math.max(max, input);
            } else {
                scanner.nextLine();
                break;
            }
        }
        System.out.println("Min input: " + min);
        System.out.println("Max input: " + max);
        scanner.close();
    }
}
