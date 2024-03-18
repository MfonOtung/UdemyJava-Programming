package org.mfon.section10_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 The challenge is to create an interactive console program. And give the user a menu of options as shown here:
 Using the Scanner class, solicit a menu item, 0, 1 or 2, and process the item accordingly. This means if the user
 enters 0, you should quit the program. If the user enters 1, you want to prompt them for a comma delimited list of
 items to add. And similarly, if the user enters 2, prompt them for a list, again comma delimited,
 to remove from the grocery list. Your grocery list should be an ArrayList. You should use methods on the ArrayList,
 to add items, remove items, check if an item is already in the list, and print a sorted list. You should print the
 list, sorted alphabetically, after each operation. You shouldn't allow duplicate items in the list.
 */
public class ArrayListChallenge1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }
    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(S) [Separate items by coma]:");
        String[] items = scanner.nextLine().split(",");

        //To ensure duplicate items are not added:
        //groceries.addAll(List.of(items));
        for (String i: items){
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(S) [Separate items by coma]:");
        String[] items = scanner.nextLine().split(",");

        //To ensure duplicate items are not added:
        //groceries.addAll(List.of(items));
        for (String i: items){
            String trimmed = i.trim();
                groceries.remove(trimmed);
                //add a call to this method in the switch statement
        }
    }
    private static void printActions(){
        //So a text block, is just a special way to format a multi-line string, in a what you see is what you get manner.
        //Here the textBlock is assigned to a String variable. And we start a text block with three double quotes.
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (coma delimited list)
                2 - to remove any items (coma delimited list)
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}
