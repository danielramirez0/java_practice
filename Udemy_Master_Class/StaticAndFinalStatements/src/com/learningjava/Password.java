package com.learningjava;

public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptedDecrypt(password);
    }

    private int encryptedDecrypt(int password){
        // Basic XOR encryption which checks the bits in the two values and returns 1
        // in any position where there is a 1 in only 1 of the values
        return password ^ key;
    }
    public void storePassword(){ // adding final modifier would protect this from being overridden
        System.out.println("Savaing password as " + this.encryptedPassword);
    }

    public void letMeIn(int password){
        if (encryptedDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
        } else {
            System.out.println("Nope, you cannot come in");
        }
    }
}
