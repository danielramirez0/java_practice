package com.learningjava;

public class Main {

    public static void main(String[] args) {
        Theatre cinemark = new Theatre("Cinemark", 8, 12);
        cinemark.getSeats();
        if (cinemark.reserveSeat("H11")){
            System.out.println("Pay for seat");
        }else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
