package com.learningjava;

import java.util.*;

public class Theatre {
    private final String name;
    private List<Seat> seats = new ArrayList<>();
    private List<Seat> seatsLinkedList = new LinkedList<>(); //changed to LinkList
    private Collection<Seat> seatsCollectionLinkedList = new LinkedList<>(); //changed type to more generic Collection
    // advantage of using Collection is that is lets you use any of the collection classes to store a seat
    // docs.oracle.javase/tutorial/collections/interfaces/index.html
    private Collection<Seat> seatsHashSet = new HashSet<>(); // changes to HashSet
    private Collection<Seat> seatsLinkedHashSet = new LinkedHashSet<>(); // changes to LinkedHashSet for order
    // private Collection<Seat> seatsLinkedHashSet = new TreeSet<>(); // can't use TreeSet because it is not in the collection hierarchy

    public Theatre(String name, int rows, int seatsPerRow) {
        this.name = name;
        int lastRow = 'A' + (rows - 1); // Uses ASCII values for calculations
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = new Seat(row + String.format("%02d", seatNumber));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {
//        Seat requestedSeat = null;
        // Because of the way Binary Searching works, this will take substantially less effort to find a match
        // e.g.
        // 1024 elements is 2^10, so no more than 10 checks in an array of 1024 items
        // 1,048,576 elements is 2^20, so no more than 20 checks in an array of over a million items
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).toggleReservation();
        }else {
            return false;
        }
//        for (Seat seat : seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.toggleReservation();
    }

    // for testing
    public void getSeats() {
        for (Seat seat :
                seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean toggleReservation() {
            this.reserved = !this.reserved;
            System.out.println("Seat " + seatNumber + (this.reserved ? " reserved" : " canceled"));
            return this.reserved;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            // This method fulfills the interface requirements
            // gives ability to use a different type of set for searching
            // much more efficient
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber()); // simply using the compareTo method built into the String class
        }
    }

}
