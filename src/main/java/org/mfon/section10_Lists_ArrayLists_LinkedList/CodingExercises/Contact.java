package org.mfon.section10_Lists_ArrayLists_LinkedList.CodingExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {

    }
    public static Contact createContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}
