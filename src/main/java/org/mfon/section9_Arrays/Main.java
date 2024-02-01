package org.mfon.section9_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        String b = "---";
        System.out.println(b.repeat(20));

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);
        System.out.println(b.repeat(20));

        //Using array initializer
        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength -1]);
        System.out.println(b.repeat(20));

        int[] newArray;
        //newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
            //System.out.println(newArray.length);
            //System.out.print(newArray[i] + " ");
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        //Using Enhanced For Loop
        System.out.println();
        for (int element : newArray){
            System.out.print(element + " ");
        }
        System.out.println();
        //System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));

        //Assigning array to an object variable
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }
        System.out.println(b.repeat(20));

        //Having an array of different types
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.println(objectArray[0]);
        System.out.println(objectArray[1]);
        System.out.println(objectArray[2]);
        System.out.print(b.repeat(20));
    }
}
