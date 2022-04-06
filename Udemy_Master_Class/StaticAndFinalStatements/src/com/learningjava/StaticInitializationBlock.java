package com.learningjava;

public class StaticInitializationBlock {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("StaticInitializationBlock static initialization block called");
    }

    public StaticInitializationBlock() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
