package com.learningJava;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initial) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initial);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }
}
