package com.learningJava;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            Car randomCar = randomCar();
            System.out.println("#" + i + " " + randomCar.getName() + " selected");
            randomCar.startEngine();
            randomCar.accelerate();
            randomCar.brake();
        }
        // Inline (usually used on Android for click listeners
        Car myInline = new Car("Inline", 12) {
            @Override
            public void startEngine() {
                System.out.println("Inline engine start");
            }
        };
        myInline.startEngine();
    }

    public static Car randomCar() {
        int random = (int) (Math.random() * 3) + 1;
        switch (random) {
            case 1:
                return new Mustang();
            case 2:
                return new Civic();
            case 3:
                return new Lambo();
            default:
                return null;
        }
    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Engine started...");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }

}

class Mustang extends Car {
    public Mustang() {
        super("Mustang", 8);
    }


    @Override
    public String getName() {
        return super.getName() + " with " + getCylinders() + " cylinders";
    }

    @Override
    public void startEngine() {
        System.out.println("What a thunderous roar!");
    }

    @Override
    public void accelerate() {
        System.out.println("So fast!");
    }

    @Override
    public void brake() {
        System.out.println("Not braking to well!");
    }
}

class Civic extends Car {
    public Civic() {
        super("Civic", 4);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName() + " beep beep";
    }

    @Override
    public void startEngine() {
        System.out.println("So quiet...");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel efficient!");
    }

    @Override
    public void brake() {
        System.out.println("Stops on a dime!");
    }
}

class Lambo extends Car {
    public Lambo() {
        super("Lambo", 10);
    }

    @Override
    public void startEngine() {
        System.out.println("So ... smooth!");
    }

    @Override
    public void accelerate() {
        System.out.println("Whoa!!!!!");
    }

    @Override
    public void brake() {
        System.out.println("Brakes are even great!");
    }
}
