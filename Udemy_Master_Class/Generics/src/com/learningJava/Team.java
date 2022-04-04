package com.learningJava;

import java.util.ArrayList;

public class Team {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player) {
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

    public void matchResult(ParameterizedTeam opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
        } else if (ourScore == theirScore) {
            this.tied++;
        } else {
            this.lost++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore );
        }
    }
    public int ranking(){
        return (this.won)    * 2 + this.tied;
    }
}
