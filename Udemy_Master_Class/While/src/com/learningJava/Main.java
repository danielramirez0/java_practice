package com.learningJava;

public class Main {

    public static void main(String[] args) {
        int count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;
        do { // will run once, count gets updated and results in infinite loop, break statement stops the loop
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) break;
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int foundNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) continue;
            foundNumbers++;
            if (foundNumbers > 5) break;
            System.out.println("Even number " + number);
        }

        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int n) {
        if (n < 10) return -1;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
