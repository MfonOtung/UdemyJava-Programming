package org.mfon.section5;

public class ControlStatementChallenges {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalSCore = score;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The high score is " + highScore);

       System.out.println("Next highScore is " + calculateScore(true, 10000, 8, 200));

    }

//    public static void calculateScore() {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int finalSCore = score;
//
//        if (gameOver == true) {
//            finalSCore += (levelCompleted * bonus);
//            finalSCore += 1000;
//            System.out.println("Your final score is " + finalSCore);
//        }
//    }
public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


    int finalSCore = score;

    if (gameOver == true) {
        finalSCore += (levelCompleted * bonus);
        finalSCore += 1000;
        System.out.println("Your final score is " + finalSCore);
    }
    return finalSCore;
}
}


