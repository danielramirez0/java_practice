package com.learningjava;

public class Static {
    private static int numInstances = 0;
    private String name;

    public Static(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

    public static void printNumInstances(){
        System.out.println("There are " + numInstances + " instances");
    }
}
