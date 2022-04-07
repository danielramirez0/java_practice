package com.learningjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre cinemark = new Theatre("Cinemark", 8, 12);
        if (cinemark.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }
        if (cinemark.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat is already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(cinemark.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        // Testing anonymous Comparator interface
        List<Theatre.Seat> priceSeats = new ArrayList<>(cinemark.getSeats());
        priceSeats.add(cinemark.new Seat("B00", 13.00));
        priceSeats.add(cinemark.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        for (int i = 0; i <= list.size(); i++) {
            if (i == list.size()) {
                System.out.println("=");
            } else {
                System.out.print("=========");
            }
        }
    }
}
