package com.learningJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1] = 1;
        myIntArray[2] = 1;
        myIntArray[3] = 1;
        int[] myIntArrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // shortcut method to add elements during init of array
        System.out.println(myIntArray[0]);
        System.out.println(myIntArrayTwo[9]);
        for (int i = 0; i < 10; i++) {
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myIntArray[i]);
        }

        for (int i = 1; i < myIntArray.length; i++) {
            System.out.println("Run " + i);
        }

        int[] typedIntegers = getIntegers(5);
        for (int i = 0; i < typedIntegers.length; i++) {
            System.out.println("Element " + (i + 1) + ", typed " + typedIntegers[i]);
        }

        System.out.println("Average is " + getAverage(typedIntegers));

    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        // Manual method copying original array
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array,array.length);



        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static Scanner scanner = new Scanner(System.in);

}
