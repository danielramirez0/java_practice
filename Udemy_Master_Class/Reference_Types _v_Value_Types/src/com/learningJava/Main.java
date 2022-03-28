package com.learningJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int valueTypeInt = 5;
//        int valueTypeCopy = valueTypeInt;
//
//        System.out.println("Original value type int = " + valueTypeInt);
//        System.out.println("Copy of original value type int = " + valueTypeCopy);
//
//        valueTypeCopy = 10; // will not change original
//
//        System.out.println("Original value type int = " + valueTypeInt);
//        System.out.println("Copy of original value type int = " + valueTypeCopy);
//
//        int[] myIntArray = new int[5];
//        int[] anotherArray = myIntArray;
//
//        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
//
//        anotherArray[0] = 1; // will change original because it is a reference
//
//        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
//
//
//        modifyArray(myIntArray); // same thing happens because the parameter is also just a reference to the array in memory
//
//        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
//
//        modifyArray(myIntArray, true);
//
//        anotherArray = new int[]{4, 5, 6, 7, 8};
//
//        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
//
//        System.out.println("Enter count: ");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//
//        int[] ints = readIntegers(count);
//        System.out.println(findMin(ints));

        int[] testArr = new int[]{1, 2, 3, 4, 5};
        reverse(testArr);
        System.out.println(Arrays.toString(testArr));


//        scanner.close();
    }

    private static void modifyArray(int[] arr) {
        arr[0] = 2;

        arr = new int[]{1, 2, 3, 4, 5};
    }

    private static void modifyArray(int[] arr, boolean dereference) {
        arr[0] = 2;
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
    }


    public static int[] readIntegers(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number: ");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean findMin = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static void reverse(int[] arr) {
//        System.out.println(Arrays.toString(arr));
//        int[] temp = new int[arr.length];
//        int index = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            temp[i] = arr[index];
//            index++;
//        }
//        arr = temp;
//        System.out.println(Arrays.toString(temp));
//        System.out.println(Arrays.toString(arr));
        int maxIndex = arr.length - 1;
        int halfLength = arr.length /2;
        for (int i = 0; i < halfLength; i++) {
           int temp = arr[i];
           arr[i] = arr[maxIndex - i];
           arr[maxIndex - i] = temp;
        }
    }

}
