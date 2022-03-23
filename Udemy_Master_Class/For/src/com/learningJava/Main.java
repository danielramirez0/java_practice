package com.learningJava;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("Interest for $10,000 at " + i + "% is " + String.format("%.2f", calculateInterest(10000, i)));
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println("Interest for $10,000 at " + i + "% is " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int counter = 0;
        for (int i = 11; i <= 43; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                counter++;
                if (counter == 3) {
                    break;
                }
            }
        }
        // Sum 3 and 5 challenge
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println(i + " divisible by 3 and 5");
            }
            if (count == 5) break;
        }
        System.out.println("Sum = " + sum);
        System.out.println(sumOdd(1, 11));
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
//        for (int i = 2; i <= n / 2; i++) {
        for (int i = 2; i <= (long) Math.sqrt(n); i++) { // more efficient
            System.out.println("Loop for " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Sum Odd
    public static boolean isOdd(int number) {
        if (number <= 0) return false;
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
