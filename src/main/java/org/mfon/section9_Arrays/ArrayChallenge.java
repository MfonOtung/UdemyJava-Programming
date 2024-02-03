package org.mfon.section9_Arrays;

import java.util.*;

/**
 Create a program using arrays,  that sorts a list of integers,
 in descending order.  Descending order  means from highest value to lowest.
 In other words, if the array has the values  50, 25, 80, 5, and 15, your program should
 return an array, with the values in the  descending order: 80, 50, 25, 15,  and 5.

 First, create an array of  randomly generated integers.
 Print the array before you sort it. And print the array after you sort it.
 You can choose to create a new sorted  array, or just sort the current array.
 In addition, you should use the Arrays.toString method, to print out  your array before, and after sorting.
 If you want to, you can make a  copy of the array before sorting.
 */
public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[]{7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));;
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int j = 0; j < len; j++) {
            randomArray[j] = random.nextInt(1000);
        }
        return randomArray;
        }
        private static int[] sortIntegers(int[] array){
            System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
            //to have the reverse of the while loop
            boolean flag = true;
            int temp;
            while (flag){
                flag = false;
                for (int i = 0; i < sortedArray.length - 1; i++){
                    if (sortedArray[i] < sortedArray[i + 1]){
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i + 1];
                        sortedArray[i + 1] = temp;
                        flag = true;
                        System.out.println("----->" + Arrays.toString(sortedArray));
                    }
                }
                System.out.println("--->" + Arrays.toString(sortedArray));
            }
            return sortedArray;
        }





}
