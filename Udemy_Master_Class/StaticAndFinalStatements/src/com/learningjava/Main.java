package com.learningjava;

public class Main {
    // when Java runs, it needs an entry point (method executed when program runs)
    // Until the program runs, there are no class instances to call methods on, this is why main is static
    // When intelliJ runs, it invokes a java executable and passes the name of the class that contains the public static void main
    // e.g. java com.company._static.Main
    // main method doesn't have to be Class called main, it can exist in any of the classes, however convention is to use class named Main
    // this is helpful when working in project with many classes, so you don't have to go looking to long or hard for the main method

    // Static example with not static fields and the correction
    // this will not work because the context is static, and the multiply method is not static (no instantiation of Main class)
//    public int multiplier = 7;
//    public  int multiply(int number){
//        return number & multiplier;
//    }
    // solution is to make them static
    public static int multiplier = 7;

    public static int multiply(int number) {
        return number & multiplier;
    }
    public static void main(String[] args) {
        Static firstInstance = new Static("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        Static secondInstance = new Static("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        Static thirdInstance = new Static("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        System.out.println("Because numInstance is static in the class, all instances of the Static class share that value in memory");
        // This is bad practice
        // Can also do something like this
        Static.printNumInstances();

        // If static is not declared  on methods (see comment starting at line 11)
        // this will not work because the context is static, and the multiply method is not static (no instantiation of Main class)
        // this error is specific to static methods accessing not static fields within the same class
        int answer = multiply(6);
        System.out.println("The answer is " + answer);

        // FINAL
        FinalExample one = new FinalExample("one");
        FinalExample two = new FinalExample("two");
        FinalExample three = new FinalExample("three");

        // each instance is maintaining its own value for instance number because it is final
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4; // error, cannot assign value to final instance variable

        // Final with Math example
//        Math m = new Math(); // will not work because the constructor for Math is private and specifically blocks instantiation of this class (all methods are static and available)
          // the class name is also marked final, meaning you can not extend it

        // Password example
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
        password.letMeIn(pw);

        // hacked by extending password
        Password passwordHacked = new ExtendedPassword(pw);
        passwordHacked.storePassword();

        // Static Initialization Block Tests

        StaticInitializationBlock test = new StaticInitializationBlock();
        test.someMethod();
        System.out.println("Owner is " + StaticInitializationBlock.owner);
    }

}
