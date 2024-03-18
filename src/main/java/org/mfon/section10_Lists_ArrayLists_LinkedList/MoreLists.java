package org.mfon.section10_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        //RETRIEVING ELEMENTS FROM AN ARRAYLIST
        //To retrieve an element from an Arraylist, we use the get method with the index of the item that we want to retrieve instead of the [] which are used for an Array.
        System.out.println("Third item = " + groceries.get(2));

        //To search for an item in the list
        if (groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        //To print out the index of item
        groceries.add("yoghurt");
        System.out.println("first = " + groceries.indexOf("yoghurt"));
        System.out.println("last = " + groceries.lastIndexOf("yoghurt"));

        //To remove an element
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yoghurt");
        System.out.println(groceries);

        //To remove more than an element
        groceries.removeAll(List.of("apples", "egg"));
        System.out.println(groceries);

        //Another method to remove item(s)
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        //To remove all elements in a list
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("egg", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //Getting a list from an array, with a different method on ArrayList.
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));




    }
}
