package com.learningjava;

public class Main {

    // TOP LEVEL
    // Only classes, interfaces and enums can exist at the top level, everything else must be included within on of these
    // public: the object is visible to all classes everywhere, whether they are in the same package or have imported the package containing the public class
    // Package-private: the object is only available within its own package (and is visible to every class within the same package). Package-private is specified by not specifying
        // i.e. it is the default if you do not specify public. There is not a "package-private" keyword

    // MEMBER LEVEL
    // public: public has the same meaning as top level
    // Package-private: public has the same meaning as top level
    // private: object is only visible within the class it is declared. It is not visible anywhere else (including in subclasses of its class)
    // protected: the object is visible anywhere in its own package (like package-private) but also in subclasses even if they are in another package

    public static void main(String[] args) {
        Account timAccount = new Account("Tim");
        timAccount.deposit(1000);
        timAccount.withdrawal(500);
        timAccount.withdrawal(-200);
        timAccount.deposit(-20);
        timAccount.calculateBalance();
        System.out.println("Balance on account " + timAccount.getBalance());
        timAccount.balance = 5000;
        timAccount.transactions.add(4500); // public access modifier allows for direct manipulation of values
        System.out.println("Balance on account " + timAccount.getBalance());


    }
}
