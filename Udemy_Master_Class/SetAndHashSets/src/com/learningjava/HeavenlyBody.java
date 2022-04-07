package com.learningjava;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
   private final String name;
   private final double orbitalPeriod;
   private final Set<HeavenlyBody> satellites;

   public HeavenlyBody(String name, double orbitalPeriod) {
      this.name = name;
      this.orbitalPeriod = orbitalPeriod;
      this.satellites = new HashSet<>();
   }

   public String getName() {
      return name;
   }

   public double getOrbitalPeriod() {
      return orbitalPeriod;
   }

   public Set<HeavenlyBody> getSatellites() {
      return new HashSet<>(this.satellites);
   }

   public boolean addMoon(HeavenlyBody moon){
      return this.satellites.add(moon);
   }

   @Override
   public boolean equals(Object obj){
      if (this == obj){
         return true;
      }
      System.out.println("obj.getClass() is " + obj.getClass());
      System.out.println("this.getClass() is " + this.getClass());
      if (obj == null || obj.getClass() != this.getClass()){ // this is unnecessary because the class is final and can't be extended
         return false;
      }
      String objName = ((HeavenlyBody) obj).getName();
      return this.name.equals(objName);
   }

   @Override
   public int hashCode() {
      // There are many ways to generate a hash code (google), some even suggest returning 0, but that nullifies
      // efficiency benefits of using HashMap or HashSets (Only need to iterate through the bucket items with the
      // same hash code to see if there are duplicates). With 0, all items would go in the same bucket.
      System.out.println("hashCode called");
      return this.name.hashCode() + 57;// using 57 because it is a small enough number to not cause issues
   }
}
