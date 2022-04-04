package com.learningJava;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList noGenerics = new ArrayList();
        noGenerics.add(1);
        noGenerics.add(2);
        noGenerics.add(3);
        noGenerics.add(4);
//        oldWay.add("Danny"); // IntelliJ doesn't show errors but this will throw an exception because it cannot be cast to Integer
        noGenerics.add(5);
        noGenerics.add(6);
        noGenerics.add(7);

        printDoubledOld(noGenerics);

        ArrayList<Integer> usingGenericClass = new ArrayList<>(); // Java 1.7 introduces diamonds, do not need to specify type in <>
        usingGenericClass.add(1);
        usingGenericClass.add(2);
        usingGenericClass.add(3);
        usingGenericClass.add(4);

        printDoubledNew(usingGenericClass);

        // Custom Generics
        System.out.println("Custom without generic");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer bob = new BaseballPlayer("Bob");
        SoccerPlayer jeff = new SoccerPlayer("Jeff");

        Team allStars = new Team("All Stars");
        allStars.addPlayer(joe);
        allStars.addPlayer(bob);
        allStars.addPlayer(jeff);

        System.out.println(allStars.playerCount() + " players on " + allStars.getName());

        System.out.println("Custom with generic type");
        ParameterizedTeam<BaseballPlayer> baseBallOnly = new ParameterizedTeam<>("Only Baseball Players Allowed Team");
        baseBallOnly.addPlayer(bob);
//        baseBallOnly.addPlayer(joe); // errors, will not allow add
//        baseBallOnly.addPlayer(jeff); // errors, will not allow add

        ParameterizedTeam<FootballPlayer> footballOnly = new ParameterizedTeam<>("Only Football Players Allowed Team");
//        footballOnly.addPlayer(bob); // errors, will not allow add
        footballOnly.addPlayer(joe);
//        footballOnly.addPlayer(jeff); // errors, will not allow add

        ParameterizedTeam<SoccerPlayer> soccerOnly = new ParameterizedTeam<>("Only Soccer Players Allowed Team");
//        soccerOnly.addPlayer(bob); // errors, will not allow add
//        soccerOnly.addPlayer(joe); // errors, will not allow add
        soccerOnly.addPlayer(jeff);

        // Code shows no errors without upper bound, but will throw exception on addPlayer() method because cannot cast String to type Player
//        ParameterizedTeam <String> broken = new ParameterizedTeam<>("broken");
//        broken.addPlayer("no-one");

        // Use upperBound declaration in T to solve issue.
//        ParameterizedTeam<SoccerPlayer> brokenTeam = new ParameterizedTeam<>("This won't work");
//        brokenTeam.addPlayer("no-go");

        ParameterizedTeam<FootballPlayer> hawthorn = new ParameterizedTeam<>("Hawthorn");
        ParameterizedTeam<FootballPlayer> fremantle = new ParameterizedTeam<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(footballOnly, 3, 8);

        footballOnly.matchResult(fremantle, 2, 1);
//        footballOnly.matchResult(baseBallOnly, 1,1); // not allowed because only Football teams are allowed

        System.out.println("Rankings");
        System.out.println(footballOnly.getName() + " : " + footballOnly.ranking());
        System.out.println(baseBallOnly.getName() + " : " + baseBallOnly.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());

        System.out.println(footballOnly.compareTo(hawthorn));
        System.out.println(footballOnly.compareTo(fremantle));
//        System.out.println(footballOnly.compareTo(baseBallOnly)); // not allowed because Base Ball team not allowed as parameter type
    }

    private static void printDoubledOld(ArrayList arrayList) {
        System.out.println("Without generics");
        for (Object i : arrayList) {
            System.out.println((Integer) i * 2);
        }
    }

    private static void printDoubledNew(ArrayList<Integer> specifiedList) {
        System.out.println("With generics");
        for (int i : specifiedList) {
            System.out.println(i * 2);
        }
        // or
        for (Integer i : specifiedList) {
            System.out.println(i * 2);
        }
    }
}
