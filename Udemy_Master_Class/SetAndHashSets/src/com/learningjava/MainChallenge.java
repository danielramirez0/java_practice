package com.learningjava;

import java.util.*;

public class MainChallenge {

    private static Map<HeavenlyBodyChallenge.Key, HeavenlyBodyChallenge> solarSystem = new HashMap<>();
    private static Set<HeavenlyBodyChallenge> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBodyChallenge tempPlanet = new Planet("Mercury", 88);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Venus", 225);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Earth", 365);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);
        HeavenlyBodyChallenge tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempPlanet = new Planet("Mars", 687);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);
        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);
        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempPlanet = new Planet("Jupiter", 4332);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);
        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);
        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);
        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);
        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addSatellite(tempMoon);

        tempPlanet = new Planet("Saturn", 10759);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Uranus", 30660);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Neptune", 165);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Pluto", 248);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        for (HeavenlyBodyChallenge planet : planets) {
            System.out.println(planet);
        }

        HeavenlyBodyChallenge body = solarSystem.get(HeavenlyBodyChallenge.makeKey("Mars", HeavenlyBodyChallenge.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBodyChallenge jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getKey());
        }

        Set<HeavenlyBodyChallenge> moons = new HashSet<>();
        for (HeavenlyBodyChallenge planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBodyChallenge moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        HeavenlyBodyChallenge pluto = new Dwarf("Pluto", 842);
        planets.add(pluto);

        for (HeavenlyBodyChallenge planet : planets) {
            System.out.println(planet);
//            System.out.println(planet.getKey() + ": " + planet.getOrbitalPeriod());
        }

        HeavenlyBodyChallenge earth1 = new Planet("Earth", 365);
        HeavenlyBodyChallenge earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBodyChallenge.makeKey("Pluto", HeavenlyBodyChallenge.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBodyChallenge.makeKey("Pluto", HeavenlyBodyChallenge.BodyTypes.DWARF)));

        System.out.println();
        System.out.println("The solar system contains:");
        for (HeavenlyBodyChallenge heavenlyBody : solarSystem.values()) {
            System.out.println(heavenlyBody);
        }

    }

    public static void printSet(Set<HeavenlyBodyChallenge> set) {
        for (HeavenlyBodyChallenge body : set) {
            System.out.println("\t" + body.getKey());
        }
    }

    public static void printSet(Set<HeavenlyBodyChallenge> set, boolean showOrbital) {
        for (HeavenlyBodyChallenge body : set) {
            System.out.println("\t" + body.getKey() + ": " + body.getOrbitalPeriod());
        }
    }
}
