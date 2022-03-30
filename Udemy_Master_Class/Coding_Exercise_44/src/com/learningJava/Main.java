package com.learningJava;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("111-222-3333");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = s.nextInt();
            s.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        } else {
            if (mobilePhone.removeContact(existingContact)) {
                System.out.println("Successfully deleted.");
            } else {
                System.out.println("Error deleting record.");
            }
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Enter new contact name: ");
            String newName = s.nextLine();
            System.out.print("Enter new contact phone number: ");
            String newNumber = s.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            if (mobilePhone.updateContact(existingContact, newContact)) {
                System.out.println("Successfully updated record");
            } else {
                System.out.println("Error updating record.");
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = s.nextLine();
        System.out.println("Enter phone number for new contact: ");
        String phoneNumber = s.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add " + name + " already on file");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n1 - to print contacts\n2 - to add a new contact\n3 - to update an existing contact\n4 - to remove an existing contact\n5 - query if a contact exists\n6 - to print a list of available actions");
        System.out.println("Choose your action: ");

    }

}
