package com.learningJava;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(2131));
        System.out.println(isPalindrome(-13131));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        printFactors(10);
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(100));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(100));
        numberToWords(100);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        if (number < 0) number *= -1;
        int originalNumber = number;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse == originalNumber;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int last = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number + last;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                number /= 10;
                continue;
            }
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            int number1LastDigit = number1 % 10;
            int number2LastDigit = number2 % 10;
            number1 /= 10;
            number2 /= 10;
            if (number1 == number2 || number1 == number2LastDigit) {
                return true;
            } else if (number1LastDigit == number2 || number1LastDigit == number2LastDigit) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) return false;
        int rightMostN1 = n1 % 10;
        int rightMostN2 = n2 % 10;
        int rightMostN3 = n3 % 10;
        return rightMostN1 == rightMostN2 || rightMostN2 == rightMostN3 || rightMostN1 == rightMostN3;
    }

    public static boolean isValid(int n) {
        return (n >= 10 && n <= 1000);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int counter = 1;
        int greatest = 0;
        while (counter <= first || counter <= second) {
            if (first % counter == 0 && second % counter == 0) {
                greatest = counter;
            }
            counter++;
        }
        return greatest;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int factorTest = 1;
            while (factorTest <= number) {
                if (number % factorTest == 0) System.out.println(factorTest);
                factorTest++;
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        int counter = 1;
        int sum = 0;
        while (number != counter) {
            if (number % counter == 0) sum += counter;
            counter++;
        }
        return sum == number;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int digitCount = getDigitCount(number);
        number = reverse(number);
        int lastDigit;
        do {
            lastDigit = number % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            digitCount--;
            number /= 10;
        } while (number >= 0 && digitCount != 0);
    }

    public static int reverse(int number) {
        boolean wasNegative = number < 0;
        if (number < 0) number *= -1;
        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return wasNegative ? reverse * -1 : reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digits = 0;
        do {
            digits++;
            number /= 10;
        }
        while (number > 0);
        return digits;
    }
}
