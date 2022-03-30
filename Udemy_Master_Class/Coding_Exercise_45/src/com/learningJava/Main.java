package com.learningJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("National Bank");

        bank.addNewBranch("One");

        bank.addCustomer("One", "Danny", 50.05);
        bank.addCustomer("One", "Mike", 175.34);
        bank.addCustomer("One", "Percy", 5.34);

        bank.addNewBranch("Two");
        bank.addCustomer("Two", "Bob", 1.00);

        bank.addCustomerTransaction("One", "Danny", 44.22);
        bank.addCustomerTransaction("One", "Danny", 12.22);
        bank.addCustomerTransaction("One", "Mike", 1.65);

        bank.listCustomers("One", true);
        bank.listCustomers("Two", true);

        if (!bank.addCustomer("Melbourne", "Brian", 4.43)){
            System.out.println("Error, Melbourne branch does not exist.");
        }

        if (!bank.addNewBranch("Two")){
            System.out.println("Error, Two branch already exists.");
        }

        if (!bank.addCustomerTransaction("Two", "Fergus", 52.22)){
            System.out.println("Error, Customer does not exist.");
        }

        if (!bank.addCustomer("Two", "Bob", 12.21)){
            System.out.println("Error, Customer Bob already exists.");
        }

    }
}
