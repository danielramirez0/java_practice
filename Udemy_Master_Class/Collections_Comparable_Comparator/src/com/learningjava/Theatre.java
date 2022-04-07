package com.learningjava;

import java.util.*;

public class Theatre {
    private final String name;
    private List<Seat> seats = new ArrayList<>(); //changed to public for testing
    // Anonymous inner class which implements the comparator interface, provides a single
    // implementation of the compare method; returns the sames results as the compareTo method
    static final Comparator<Seat> PRICE_ORDER;
    // IntelliJ recommends splitting into declaration first (above) and then initialization (below)
    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    // this is not consistent with compare equals (meaning it can return 0 if something is not truly equal)
// it would be wise to do an additional comparison here to verify the seat numbers are equal
                    return 0;
                }
            }
        };
    }

    public Theatre(String name, int rows, int seatsPerRow) {
        this.name = name;
        int lastRow = 'A' + (rows - 1); // Uses ASCII values for calculations
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                double price = 12.00;
                if (row > 'D' && seatNumber >= 4 && seatNumber <= 9) {
                    price = 14.00;
                } else if (row > 'F' || seatNumber < 4 || seatNumber > 9) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNumber), price);
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (this.reserved) {
                System.out.println("Seat is taken");
                return false;
            } else {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }
    }

}
