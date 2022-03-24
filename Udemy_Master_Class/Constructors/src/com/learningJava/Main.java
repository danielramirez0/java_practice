package com.learningJava;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1234);
        bankAccount.setCustomerName("Joe Boe");
        bankAccount.setBalance(100);
        bankAccount.setEmail("joe@blo.com");
        bankAccount.setPhoneNumber("661-123-1234");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());

        bankAccount.depositFunds(100.00);
        bankAccount.withdrawalFunds(100.00);
        bankAccount.withdrawalFunds(101.50);

        BankAccount secondAccount = new BankAccount(4321, 200, "Bot Joe", "b@j.com", "115-111-2222");
        System.out.println(secondAccount.getAccountNumber());
        System.out.println(secondAccount.getCustomerName());
        System.out.println(secondAccount.getBalance());
        System.out.println(secondAccount.getEmail());
        System.out.println(secondAccount.getPhoneNumber());

        BankAccount thirdAccount = new BankAccount("Third", "third@third.com", "222-333-4444");
        System.out.println(thirdAccount.getAccountNumber());
        System.out.println(thirdAccount.getCustomerName());
        System.out.println(thirdAccount.getBalance());
        System.out.println(thirdAccount.getEmail());
        System.out.println(thirdAccount.getPhoneNumber());
    }
}
