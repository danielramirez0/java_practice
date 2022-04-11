package com.learningjava;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBodyChallenge {
   private final Key key;
   private final double orbitalPeriod;
   private final Set<HeavenlyBodyChallenge> satellites;

   // Another method
   private final int bodyTypeViaInt;
   public static final int STAR = 1;
   public static final int PLANET = 2;
   public static final int DWARF = 3;
   public static final int MOON = 4;
   public static final int COMET = 5;
   public static final int ASTEROID = 6;

   // Or use enum
   // enum are types and this will cause the parameter in the constructor to only accept these types
   public enum BodyTypes { // inner enum
      STAR,
      PLANET,
      DWARF,
      MOON,
      COMET,
      ASTEROID
   }

   public HeavenlyBodyChallenge(String name, double orbitalPeriod, BodyTypes bodyType) {
      this.key = new Key(name, bodyType);
      this.orbitalPeriod = orbitalPeriod;
      this.satellites = new HashSet<>();
      this.bodyTypeViaInt = 1;
   }

   public double getOrbitalPeriod() {
      return orbitalPeriod;
   }

   public Key getKey() {
      return key;
   }

   public static Key makeKey(String name, BodyTypes bodyType) {
      return new Key(name, bodyType);
   }

   public Set<HeavenlyBodyChallenge> getSatellites() {
      return new HashSet<>(this.satellites);
   }

   public boolean addSatellite(HeavenlyBodyChallenge moon){
      return this.satellites.add(moon);
   }

   @Override
   public final boolean equals(Object obj){
      if (this == obj){
         return true;
      }
     if (obj instanceof HeavenlyBodyChallenge){
        HeavenlyBodyChallenge theObject = (HeavenlyBodyChallenge) obj;
        return this.key.equals(theObject.getKey());
     }
     return false;
   }

   @Override
   public final int hashCode() {
      return this.key.hashCode();
   }

   @Override
   public String toString() {
      return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
   }

   public static final class Key {
      private final String name;
      private final BodyTypes bodyType;

      public Key(String name, BodyTypes bodyType) {
         this.name = name;
         this.bodyType = bodyType;
      }

      public String getName() {
         return name;
      }

      public BodyTypes getBodyType() {
         return bodyType;
      }

      @Override
      public boolean equals(Object obj) {
         Key key = (Key) obj;
         if (this.name.equals(key.getName())) return this.bodyType == key.getBodyType();
         return false;
      }

      @Override
      public int hashCode() {
         return this.name.hashCode() + 57 + this.bodyType.hashCode();
      }

      @Override
      public String toString() {
         return this.name + ": " + this.bodyType;
      }
   }

}
