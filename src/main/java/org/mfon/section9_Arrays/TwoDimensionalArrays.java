package org.mfon.section9_Arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            //System.out.println(outer);
            System.out.println(Arrays.toString(outer));
        }

            //This can be printed out using a nested for loop.
//           for (int i = 0; i < array2.length; i++){
//                var innerArray = array2[i];
//                for (int j = 0; j < innerArray.length; j++){
//                    System.out.println(array2[i][j] + " ");
//                }
//                System.out.println();
//            }

//            for ( var outer : array2){
//                for (var element : outer){
//                    System.out.print(element + " ");
//                }
//                System.out.println();
//            }

            //To print on a single line:
        //System.out.println(Arrays.deepToString(array2));

        //Assigning values to the two-dimensional array:
        for (int i = 0; i < array2.length; i++){
                var innerArray = array2[i];
                for (int j = 0; j < innerArray.length; j++){
                    array2[i][j] = (i * 10) + (j + 1);
                }
            }
        System.out.println(Arrays.deepToString(array2));
        //To assign any array of integer to one of the outer array's elements
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1", "2",},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        //To print anyArray[2] using a forLoop
        for (Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
        }
    }

