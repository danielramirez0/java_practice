package com.learningJava;

public class Player { //Does not use encapsulation
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int dmg){
        health -= dmg;
        if (this.health <= 0) {
            System.out.println("Dead...");
        }
    }

    public int healthRemaining(){
        return health;
    }

}
