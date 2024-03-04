package org.mfon.section10_Lists_ArrayLists_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Diary", 1);
    }

    //To print out record
    @Override
    public  String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class ArrayLists {
    public static void main(String[] args) {
//        Object[] groceryArray = new Object[3];
//        groceryArray[0] = new GroceryItem("milk");
//        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
//        groceryArray[2] = "5 oranges";
//        System.out.println(Arrays.toString(groceryArray));


        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectlist = new ArrayList();
        objectlist.add(new GroceryItem("Butter"));
        objectlist.add("Yoghurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        //To make apple appear first on the list
        //groceryList.add(0,
                //new GroceryItem("apples", "PRODUCE", 6));

        //To replace an item, we use .set
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));

        //To remove an item, we use .remove
        groceryList.remove(1);
        //groceryList.add("Yoghurt");
        //In ArrayList, size is not specified because it is resizable
        System.out.println(groceryList);
    }
}
