package com.learningjava;

interface Accessible { // Visibility = package-private (all classes in com.learningjava)
    int SOME_CONSTANT = 100;  // Visibility = public static final (all interface variables are set this way)

    public void methodA(); // Visibility = public

    void methodB(); // Visibility = public (all interface methods are public)

    boolean methodC(); // Visibility = public (all interface methods are public)

    // The whole point of declaring an interface is to provide methods that have to be implemented
    // thus, they need to be public.

    // However, making the interface itself package private (as done here) makes the methods package-private
}