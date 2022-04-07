package com.learningjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre cinemark = new Theatre("Cinemark", 8, 12);
//        cinemark.getSeats();
//        if (cinemark.reserveSeat("H11")){
//            // Without binary search method from collections reserving involves searching every single
//            // item in the array until the proper item is found to update (inefficient)
//            System.out.println("Pay for seat");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if (cinemark.reserveSeat("D12")){
//            System.out.println("Pay for seat");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if (cinemark.reserveSeat("K12")){
//            System.out.println("Pay for seat");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
        // shallow copy (modification to one will affect the other list)
        List<Theatre.Seat> seatCopy = new ArrayList<>(cinemark.seats);
        printList(seatCopy);

        seatCopy.get(1).toggleReservation();
        // Example showing shallow copy is in effect
        if (cinemark.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat is already reserved");
        }

        Collections.reverse(seatCopy);

        // While they are separate array lists, they still refer to the same objects
        System.out.println("Seat copy seats");
        printList(seatCopy);
        System.out.println("Cinemark seats");
        printList(cinemark.seats);

        System.out.println("Pseudo random shuffle on each run");
        Collections.shuffle(seatCopy);
        printList(seatCopy);

        System.out.println("Min/Max methods return the min/max element according to natural sort order");
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min is " + minSeat.getSeatNumber() + " Max is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Sorted using custom sort");
        printList(seatCopy);

        // This throws an exception because even though the size is specified with the integer parameter of
        // cinemark.seats.size() passed to ArrayList instantiation, that only specifies the potential capacity
        // of the List, not its initial size. It is still initial size zero
        // So, the Collections.copy will fail because the size of the array is not at least the size of
        // cinemark.seats when called
        List<Theatre.Seat> newList = new ArrayList<>(cinemark.seats.size());
        Collections.copy(newList, cinemark.seats);
        printList(newList);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        for (int i = 0; i <= list.size(); i++) {
            if (i == list.size()) {
                System.out.println("=");
            } else {
                System.out.print("====");
            }
        }
        System.out.println();
    }

    // Custom sort using Collections.swap method
    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }

        }
    }
}
