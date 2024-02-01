package org.mfon.section6_Control_Flow.LoopingStatements.WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        /**int j = 1;
        while (j <= 5){
            System.out.println(j);
            j++;*/

        // Another way of coding it
        int j = 1;
        while (true){
            if (j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }

        //Do While Loop:
        j = 1;
        boolean isReady = false;
        do {
            if (j > 5){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);

        //Continue Statement:
        int number = 0;
        while (number < 50){
            number += 5;
            if (number % 25 == 0){
                continue;
            }
            System.out.println(number + "_");
        }


    }
}
