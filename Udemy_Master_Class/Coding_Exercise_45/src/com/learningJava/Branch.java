package com.learningJava;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.customers = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

}
