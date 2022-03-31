package com.learningJava;

public class MobilePhone implements ITelephone {
    private int phoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.isOn = false;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile phone now on");
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
        if (isOn) {
            if (phoneNumber == this.phoneNumber) {
                isRinging = true;
                System.out.println("Melodic cell Ring...");
            } else {
                isRinging = false;
            }
        } else {
            System.out.println("Mobile not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
