package com.learningjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody tempPlanet = new HeavenlyBody("Mercury", 88);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Venus", 225);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Earth", 365);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new HeavenlyBody("Mars", 687);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);
        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);
        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Neptune", 165);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Pluto", 248);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        printSet(body.getSatellites());

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All Moons");
        printSet(moons);
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);
        System.out.println("After adding pluto with duplicate key");
        printSet(planets, true);
        System.out.println("This is because the two objects don't compare equal; they are using the basic Object.equals(x, y) method" +
                " which states that both objects are equal if they point to the same reference. These do not.");
        System.out.println("i.e.");
        Object o = new Object();
        o.equals(o);
        "pluto".equals("");


    }

    public static void printSet(Set<HeavenlyBody> set){
        for (HeavenlyBody body : set){
            System.out.println("\t"+body.getName());
        }
    }

    public static void printSet(Set<HeavenlyBody> set, boolean showOrbital){
        for (HeavenlyBody body : set){
            System.out.println("\t"+body.getName() + ": " + body.getOrbitalPeriod());
        }
    }
}
