package org.mfon.section10_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);
        //The created ArrayList cannot be resized

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        //Whatever method used on the list will have an effect on the array that was the source of the list.

        //To sort and print out the original array
        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        //To create a fixed-size list from a list of elements
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        //ArrayList to Array
        ArrayList<String> stringArrayLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringArrayLists.toArray(new String[3]);
        System.out.println(Arrays.toString(stringArray));
    }
}
