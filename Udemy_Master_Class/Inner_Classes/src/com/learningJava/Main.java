package com.learningJava;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // write your code here
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        // Notice the syntax to instantiate a new Gear, it requires an existing instantiation of the outer class
        // These will not work
        /*
        Gearbox.Gear second = new Gearbox.Gear(2, 15.4); // not an enclosing class
        Gearbox.Gear third = new mcLaren.Gear(3, 17.8); // cannot resolve symbol
        */

        // System.out.println(first.driveSpeed(1000));

//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked using inner class");
            }
        }


        System.out.println("Attaching using ClickListener inner class");
        btnPrint.setOnClickListener(new ClickListener());
        listen();

        System.out.println("Attaching using anonymous inner class");
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked using anonymous inner class");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
