package com.learningJava;

import java.util.ArrayList;

public class Team<T extends Player> implements  Comparable<Team<T>>{
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already on team " + this.name);
            return false;
        } else {
            this.members.add(player);
            System.out.println(player.getName() + " added to " + this.name);
            return true;
        }
    }

    public int playerCount() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            this.won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            this.tied++;
            message = " tied with ";
        } else {
            this.lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (this.won) * 2 + this.tied;
    }

    @Override
    public int compareTo(Team<T> team){
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }else{
            return 0;
        }
    }
}
