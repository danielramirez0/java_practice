package com.learningjava;

import java.util.Scanner;

public class X {
    private int x;

//    public X(int x) {
    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public int getX() {
        return x;
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(this.x + " x " + x + "=" + (this.x * x));
        }
    }
}
