package org.mfon.section6_Control_Flow.LoopingStatements;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        //System.out.println(isEven(43));

        int evenCount = 0;
        int oddCount = 0;
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEven(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >=5){
                break;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
