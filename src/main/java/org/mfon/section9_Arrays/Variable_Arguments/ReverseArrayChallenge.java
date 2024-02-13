package org.mfon.section9_Arrays.Variable_Arguments;
import java.util.Arrays;

/**
 Reversed Array Challenge:

 The challenge is to write a method called reverse, that takes an int array as a parameter.
 The method is going to allow the array being passed to be method to be modified. As a result,
 this method shouldn't return any value. In the main method, call the reverse method,
 and print the array both before and after the reverse method is called.
 To reverse the array, you have to swap the elements, so that the first element
 is swapped with the last element, and so on. So for example, if the array contains
 the numbers 1,2,3,4,5, then the reversed array should be, 5,4,3,2,1.
 */

public class ReverseArrayChallenge extends MinimumElementChallenge {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        reverse(returnedArray);
        System.out.println("Final: " + Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse " + Arrays.toString(returnedArray));
        System.out.println("reversedCopy " + Arrays.toString(reversedCopy));
    }
    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--> " + Arrays.toString(array));
        }
    }

    //Without mutation method:
    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array){
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}




