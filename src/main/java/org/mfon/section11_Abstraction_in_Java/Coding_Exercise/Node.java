package org.mfon.section11_Abstraction_in_Java.Coding_Exercise;
/**
 ABSTRACT CLASS
 Implement the following:

 2.  Node (concrete class)
 -  It extends ListItem.
 -  It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.

 -  And five methods which are package-private:
 -  next(), takes no parameters and returns the ListItem to its right.
 -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.
 -  previous(), takes no parameters and returns the ListItem to its left.
 -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
 -  compareTo(), takes a ListItem and compares it to the ListItem that called this method.
 Use value from ListItem for comparison. If this value is greater than the value that was passed in,
 then it should return a number greater than zero. If vice versa, then it should return a number less than zero,
 and zero if equal.

 TIP:  The rules for adding an item to the linked tree are:
 If the head of the tree is null, make the head refer to the item to be added.
 If the item to be added is less than the current item in the tree, add the item before the current item
 (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
 If the item to be added is greater than the current item, move onto the next item and compare again
 (if there is no next item, then that is where the new item belongs).

 TIP:  When adding items to a Binary Search Tree, if the item to be added is less than the current item,
 then move to the left. If it is greater than the current item, then move to the right.
 The new item is added when an attempt to move in the required direction would involve following a null reference.
 Once again, duplicates are not allowed.

 TIP:  Inorder = print the previous node, then the parent node, and then the next node (left -> node -> right).

 TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
 TIP:  Be extremely careful about spaces and spelling in the printed output from the traverse() method.

 NOTE:  All fields are private (unless stated otherwise).
 NOTE:  All constructors are public.
 NOTE:  All methods are public (unless stated otherwise).
 NOTE:  Do not add a main method to the solution code.
 */

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }
    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {

        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
