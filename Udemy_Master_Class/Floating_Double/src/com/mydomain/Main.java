package com.mydomain;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f; // By default, java assumes a double point value is a double, will error if no f
        float myFloatTest = (float) 5.25; // Can also use casting, but not recommended
        double myDoubleValue = 5.25d; // Double is recommended data type for modern dev

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        int divIntValue = 5 / 2;
        float divFloatValue = 5f / 2f;
        double divDoubleValue = 5d / 2d;

        System.out.println("DivIntValue= " + divIntValue);
        System.out.println("DivFloatValue= " + divFloatValue);
        System.out.println("DivDoubleValue= " + divDoubleValue);

        int byThreeIntValue = 5 / 3;
        float byThreeFloatValue = 5f / 3f;
        double byThreeDoubleValue = 5d / 3d;

        System.out.println("DivIntValue= " + byThreeIntValue);
        System.out.println("DivFloatValue= " + byThreeFloatValue);
        System.out.println("DivDoubleValue= " + byThreeDoubleValue);

        // Challenge
        int pounds = 13;
        double kilos = (double) pounds * 0.45359237d;
        System.out.println(kilos);
    }
}
