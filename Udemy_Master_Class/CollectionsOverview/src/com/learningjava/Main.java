package com.learningjava;

public class Main {

    public static void main(String[] args) {
        Theatre cinemark = new Theatre("Cinemark", 8, 12);
        cinemark.getSeats();
        if (cinemark.reserveSeat("H11")){
            // Without binary search method from collections reserving involves searching every single
            // item in the array until the proper item is found to update (inefficient)
            System.out.println("Pay for seat");
        }else {
            System.out.println("Sorry, seat is taken");
        }
        if (cinemark.reserveSeat("D12")){
            System.out.println("Pay for seat");
        }else {
            System.out.println("Sorry, seat is taken");
        }
        if (cinemark.reserveSeat("K12")){
            System.out.println("Pay for seat");
        }else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
