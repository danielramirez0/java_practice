package com.java;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore( true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore( true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("P1", calculateHighScorePosition(1500));
        displayHighScorePosition("P2", calculateHighScorePosition(900));
        displayHighScorePosition("P3", calculateHighScorePosition(400));
        displayHighScorePosition("P4", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver){
            int finalScore = score + ( levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) return 1;
        if (score >= 500) return 2;
        if (score >= 100) return 3;
        return 4;
    }
}
