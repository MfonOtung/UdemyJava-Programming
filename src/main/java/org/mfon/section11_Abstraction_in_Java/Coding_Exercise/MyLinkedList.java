package org.mfon.section11_Abstraction_in_Java.Coding_Exercise;
/**
 ABSTRACT CLASS
 Implement the following:

 3.  MyLinkedList (concrete class)
 -  It implements NodeList.
 -  It has one field of type ListItem called root.
 -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.

 -  And four methods:
 -  getRoot(), getter for root.
 -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise.
    If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
 -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
 -  traverse(), takes the root as an argument and does not return anything. If the root is null it prints out:
    The list is empty, otherwise print each value on a separate line.

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

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            // the list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater than currentItem, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less than currentItem, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
