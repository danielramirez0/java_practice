package com.mydomain;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10  = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5  = " + result);

        result = result % 3; // the remainder of (4 / 3 ) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3;
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30;
        System.out.println("3 + 10 = " + result);

        // result = result / 3;
        result /= 3; // 30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        result -= 2; // 10 - 2 = 8;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false; // assignment operator, used to assign values to variables, etc.
        if (isAlien == true) //equality operator checks both operands for equality
            System.out.println("It is not an alien!"); // only one line will be run without code block
        // System.out.println("And I am scared of aliens");
        if (isAlien == false) {
            System.out.println("It is not an alien!"); // only one line will be run without code block
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both conditions are true");
        }
        // | is the bitwise operator for OR, works on bit level, || works on true/false evaluations
        // & is the bitwise operator for AND, works on bit level, && works on true/false evaluations

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to run, but does because of the bug using assignment operator");
        }
        // ! NOT operator tests for opposite of a given boolean value, aka Logical Complement Operator
        if (!isCar)
            System.out.println("Opposite of isCar, doesn't run because isCar set to true on line 71");

        boolean wasCar = isCar ? true : false; // Ternary Operator, shortcut for if else statement, returns operand 2 if operand one is true, else returns operand three
        if (wasCar){
            System.out.println("wasCar is true");
        }

        //Challenge
        double challengeDouble = 20.00d;
        double challengeDoubleTwo = 80.00d;
        double sum = (challengeDouble + challengeDoubleTwo) * 100.00d;
        double remainder = sum % 40.00d;
        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);
        if (!isZero){
            System.out.println("Got some remainder");
        }

    }
}
