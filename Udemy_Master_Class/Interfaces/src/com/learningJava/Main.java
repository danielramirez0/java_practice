package com.learningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone myPhone;
        myPhone = new DeskPhone(12345);
        myPhone.powerOn();
        myPhone.dial(123456);
        myPhone.isRinging();
        myPhone.callPhone(12345);
        myPhone.isRinging();
        myPhone.answer();
        myPhone.isRinging();


        myPhone = new MobilePhone(9876);

        myPhone.isRinging();
        myPhone.dial(123456);
        myPhone.callPhone(123456);
        myPhone.dial(9876);
        myPhone.callPhone(9876);
        myPhone.powerOn();
        myPhone.dial(9876);
        myPhone.callPhone(9876);
    }
}
