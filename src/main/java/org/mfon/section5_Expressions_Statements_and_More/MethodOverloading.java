package org.mfon.section5_Expressions_Statements_and_More;

public class MethodOverloading {
    public static void main(String[] args) {
    calculateScores("Berty", 80);
    calculateScores(98);
    int newScore = calculateScores("Sam", 78);
        System.out.println("New sore is " + newScore);
        System.out.println(calculateScores("Rocky"));
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static int calculateScores(String name, int score) {
        System.out.println(name + " scored " + score);
        return score * 100;

    }

    public static void calculateScores( int score) {
        System.out.println( "The score is " + score);
    }

    public static int calculateScores(String name) {
        return calculateScores("Rocky", 65);
    }

    public static double convertToCentimeters(int heightInches) {
        double centimeters = heightInches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {
        int convertedHeightInches = heightFeet * 12;
        int finalValue = convertedHeightInches + heightInches;
        return convertToCentimeters(finalValue);
    }

}
