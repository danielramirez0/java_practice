package com.learningJava;

public class EnhancedPlayer { // Uses encapsulation
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.hitPoints = health > 0 && health <= 100 ? health : this.hitPoints;
        this.weapon = weapon;
    }

    public void loseHealth(int dmg){
        hitPoints -= dmg;
        if (this.hitPoints <= 0) {
            System.out.println("Dead...");
        }
    }

    public int healthRemaining(){
        return hitPoints;
    }

    public int getHealth() {
        return hitPoints;
    }
}
