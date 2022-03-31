package com.learningJava;

public class DeskPhone implements ITelephone{ //implements keyword to indicate implements an interface, will also notify(error) when all methods are not implemented
    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Answering");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.phoneNumber) {
            isRinging = true;
            System.out.println("Ring Ring...");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
