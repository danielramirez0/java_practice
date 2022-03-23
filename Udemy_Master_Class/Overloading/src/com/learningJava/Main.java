package com.learningJava;

public class Main {

    // final keyword identifies a constant, in order to use variables declared outside of scope, static is needed, constants are usually ALL CAPS to ID them as constants
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        int newScore = calculateScore("Joe", 100);
        System.out.println("New score is " + newScore);
        System.out.println(calculateScore(109));
        System.out.println(calculateScore());
        calcFeetAndInchesToCentimeters(1,5);
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(72);
        calcFeetAndInchesToCentimeters(68);
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(256, 59));
        System.out.println(getDurationString(3600, 59));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }

    // Feet and Inches to Centimeters Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >=0 && inches <= 12)){
            double centimeters = (int)(feet * 12) * 2.54d;
            centimeters += (inches * 2.54d);
            System.out.println(feet + " feet, " + inches + " inches, is " + centimeters + " centimeters.");
            return  centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }

    // Seconds and Minutes Challenge
    public static String getDurationString (int minutes, int seconds) {
        String result = "";
        if(minutes >= 0 && (seconds >=0 && seconds <= 59)){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            result += hours < 10 ? "0"+hours+"h " : hours+"h ";
            result += remainingMinutes < 10 ? "0"+remainingMinutes+"m " : remainingMinutes+"m ";
            result += seconds < 10 ? "0"+seconds+"s " : seconds+"s ";
            return result;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString (int seconds) {
       if (seconds >=0 ){
          int minutes = seconds / 60;
          int remainingSeconds = seconds % 60;
          return getDurationString(minutes, remainingSeconds);
       }
       return INVALID_VALUE_MESSAGE;
    }
}
