package com.learningJava;

import java.util.ArrayList;

// Uses generic type for instantiation
//public class ParameterizedTeam<T> { // without upper bound
public class ParameterizedTeam<T extends Player> implements  Comparable<ParameterizedTeam<T>>{ // with upper bound definition, upper bound can be class and/or interface
    // Interfaces can also specify type parameters (i.e. create instance of a class that implements an interface, ensure that interface methods implemented
    // act on a specific type of object(s)). Seen in the usage of List interface that takes a generic type parameter
    // This is an example of single bound, but java does support multiple bound (e.g. Coach, Manager, etc. class allowed to be added to team)
    // To do this with multiple classes, you need to use interfaces (i.e. class specified first, then interfaces)
    // Syntax is:
    //      public class ParameterizedTeam<T extends Player(Class) & Coach(Interface) & Manager(Interface)> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public ParameterizedTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            // Need to cast Player as a temp fix, because using a generic T type, java doesn't know that method is available
//            System.out.println(((Player) player).getName() + " already on team " + this.name); // without upper bound
            System.out.println(player.getName() + " already on team " + this.name); // with upper bound, cast is redundant
            return false;
        } else {
            this.members.add(player);
//            System.out.println(((Player) player).getName() + " added to " + this.name); // without upper bound
            System.out.println(player.getName() + " added to " + this.name); // with upper bound, cast is redundant
            return true;
        }
    }

    public int playerCount() {
        return this.members.size();
    }

    public void matchResult(ParameterizedTeam<T> opponent, int ourScore, int theirScore) {
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
    public int compareTo(ParameterizedTeam<T> team){
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }else{
            return 0;
        }
    }

}
