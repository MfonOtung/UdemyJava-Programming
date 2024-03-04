package org.mfon.section10_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "egg"};
        //Transform an Array to a List, we use the method below:
        List<String> list = List.of(items);
        System.out.println(list);

//        System.out.println(list.getClass().getName());
//        list.add("Yoghurt");
//        Running this gives an exception

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yoghurt");
        System.out.println(groceries);

        //To create a list with specified elements all in one statement, we use the method below:
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        //To add all list together, we use addAll
        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
