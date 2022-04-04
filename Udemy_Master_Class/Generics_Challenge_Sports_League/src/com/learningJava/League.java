package com.learningJava;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (teams.contains(team)) {
            return false;
        }
        teams.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        for (T t : teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
