package com.learningJava;

public interface ITelephone {
    // public void powerOn(); public is not necessary because these are just indicators of required methods in the class which implements this interface
    void powerOn(); // can omit public access modifier
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
