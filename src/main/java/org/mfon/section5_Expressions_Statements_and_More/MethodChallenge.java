package org.mfon.section5_Expressions_Statements_and_More;

public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Aromaa", highScorePosition);
    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(playersName + " managed to get into position " +   highScorePosition  + " in the high score list ");
    }
    public static int calculateHighScorePosition(int playerScore) {
        //Method 1
//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }

        //Method 2
//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;

        //Method 3
        int position = 0;
        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }else {
            position = 4;
        }
        return position;
    }
}
