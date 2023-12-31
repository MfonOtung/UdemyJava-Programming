package org.mfon.section5;

public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.1757));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        if((number1 < 0 && number2 < 0) || (number1 >=0 && number2 >= 0)){
            if (Math.floor(Math.abs(number1) * 1000) == Math.floor(Math.abs(number2) * 1000))
                return true;
        }
        return false;

    }
}
