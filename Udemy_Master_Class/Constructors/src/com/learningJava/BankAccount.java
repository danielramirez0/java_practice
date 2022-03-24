package com.learningJava;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructor


    public BankAccount() {
        // Can be used to set default values (call another constructor) OPTIONAL
        this(1111, 0, "Default Name", "Default Email", "000-000-0000");
        System.out.println("Empty constructor used");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Can even use constructor with less values supplied and use default values for rest

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(2222, 0, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double amount) {
        System.out.println("Original balance: " + balance);
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    public void withdrawalFunds(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("New balance: " + balance);
        }
    }

}

