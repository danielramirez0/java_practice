package com.learningJava;

import java.lang.reflect.Array;
import java.util.ArrayList;

// without Autoboxing, to add primitive type to an ArrayList, you would have to use a custom class (messy)
class IntClass {
    private int myValue;

    public IntClass(int integer) {
        this.myValue = integer;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        // ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        // You can use Java classes as wrappers for primitive types
        // DEPRECATED Integer integer = new Integer(54);
        Integer integer = 54; // use static value, java uses Integer.valueOf(54) in background
        // Java will also autobox and unbox when assigning an int
        int myPrimitive = integer; // myPrimitive.intValue(integer); The compiler inserts this code during compile.
        // DEPRECATED Double doubleValue = new Double(12.25);
        Double doubleValue = 12.25;

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // unnecessary boxing with latest java integerArrayList.add(Integer.valueOf(i));
            integerArrayList.add(i);
        }

        for (int i = 0; i < 10; i++) {
            // unnecessary unboxing with latest java System.out.println(i + " --> " + integerArrayList.get(i).intValue());
            System.out.println(i + " --> " + integerArrayList.get(i));
        }

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double i = 0.0; i < 10.0; i+=0.5){
            myDoubleValues.add(i);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }


}
