package com.learningJava;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; // takes control away from Player class
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Health = " + enhancedPlayer.getHealth());
        Printer tes = new Printer(100, true);
        Printer not = new Printer(100, false);
        System.out.println(tes.printPages(10));
        System.out.println(tes.printPages(11));
        System.out.println(not.printPages(10));
        System.out.println(not.printPages(11));

        System.out.println(tes.getPagesPrinted());
        System.out.println(not.getPagesPrinted());

    }
}
