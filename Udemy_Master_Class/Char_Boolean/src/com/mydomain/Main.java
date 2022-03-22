package com.mydomain;

public class Main {

    public static void main(String[] args) {
        // char occupies two bytes of memory (16 bits), this is because it allows storage of Unicode chars (up to 65535 chars)
        char myChar = 'D'; // use single quotes for chars, double quote for strings
        char myUniCode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUniCode);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
