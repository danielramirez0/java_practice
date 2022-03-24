package com.learningJava;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            if (firstName.isEmpty()) {
                return lastName;
            } else {
                return firstName;
            }
        } else {
            return firstName + " " + lastName;
        }
    }
}
