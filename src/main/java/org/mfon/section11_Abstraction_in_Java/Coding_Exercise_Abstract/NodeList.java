package org.mfon.section11_Abstraction_in_Java.Coding_Exercise_Abstract;
/**
 ABSTRACT CLASS
 Implement the following:

 4.  NodeList (interface)
 -  It has four methods:
 -  getRoot(), addItem(), removeItem() and traverse() which are package-private and abstract (see child class for declaration).


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

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
