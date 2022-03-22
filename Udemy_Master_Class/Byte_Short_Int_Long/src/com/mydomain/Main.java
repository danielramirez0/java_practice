package com.mydomain;

public class Main {

    public static void main(String[] args) {

        // Int is 32 bits
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Overflow bug
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Also bugs when trying to get lower than min value

        int myMaxIntTest = 2_147_483_647; //can use _ for legibility

        // Byte is 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // Short is 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // Long is 64 bits
        long myLongValue = 100L; // Use L or l to denote a long number
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2 );

        // casting, to treat or convert a number from one type to another
        byte myNewByteValue = (byte) (myMinByteValue /2 ); // use casting when using an expression to set the value, otherwise java uses default whole number type of int and will error

        short myNewShortValue = (short) (myMaxShortValue / 2);

        // Challenge
        byte startingByteNumber = 10;
        short startingShortNumber = 20;
        int startingIntNumber = 50;
        long myLongNumber = 50000L + 10L * (startingIntNumber + startingShortNumber + startingByteNumber);
        System.out.println(myLongNumber);
    }
}
