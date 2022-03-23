package com.learningJava;

public class Main {

    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int sum = (bigCount * 5) + smallCount;
        return (sum >= goal && (goal % 5) <= smallCount);
    }

    public static int getLargestPrime(int number) {
        if (number < 0) return -1;
        int factor = 2;
        while (factor < number) {
            if (number % factor != 0) {
                factor++;
            } else {
                number /= factor;
                factor = 2;
            }
        }
        return number;
    }

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
        }else{
           int row = 1;
           while(row <= number){
               for(int column = 1; column <= number; column++){
                   if (row == 1 || row == number || column == 1 || column == number){
                       System.out.print("*");
                   }else if(row == column) {
                       System.out.print("*");
                   }else if(column == number - row + 1){
                       System.out.print("*");
                   }else{
                       System.out.print(" ");
                   }
               }
               row++;
               System.out.println();
           }
        }
    }
}
