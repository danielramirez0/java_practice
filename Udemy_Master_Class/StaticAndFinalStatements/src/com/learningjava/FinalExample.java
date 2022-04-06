package com.learningjava;

public class FinalExample {
    private static int classCounter = 0;
    // constants are usually declared using static final and naming convention = ALL_CAPS, but with this example,
        // each class maintains its own value for this field
    public final int instanceNumber; // made public to show it cannot be changed, but normally this would be private

    private final String name;

    public FinalExample(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public static int getClassCounter() {
        return classCounter;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public String getName() {
        return name;
    }
}
