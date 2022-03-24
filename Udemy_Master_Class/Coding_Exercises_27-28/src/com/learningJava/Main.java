package com.learningJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5 ));
        System.out.println(getBucketCount(3.4, 1.5 ));
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int counter = 1;
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                sum += scanner.nextInt();
                avg = (int) Math.round((double) sum / (double) counter);
                counter++;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double area = width * height;
        double extraBucketCoverage = areaPerBucket * extraBuckets;
        double remainingArea = area - extraBucketCoverage;
        return (int) Math.ceil(remainingArea /areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil(area /areaPerBucket);
    }
}
