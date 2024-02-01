package org.mfon.section5_Expressions_Statements_and_More;

public class ControlStatement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("You made it");
        }

        if (score < 5000) {
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("You made it");
        }

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("You made it here");
        }

        int finalScore = score;
        if (gameOver == true)//gameOver == true is the same as gameOver
        {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    //METHOD:
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

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalSCore = score;

        if (gameOver == true) {
            finalSCore += (levelCompleted * bonus);
            finalSCore += 1000;
            System.out.println("Your final score is " + finalSCore);
        }
    }
}

