package org.mfon.section11_Abstraction_in_Java.Coding_Exercice_Interface;

/**
 Interface:
 Create a simple interface that allows an object to be saved to some sort of storage medium.
 Implement the following:

 3.  Monster (class)
 -  It has three fields. One String called name and Two ints called hitPoints and strength.
 -  A constructor that accepts a String (name) and two ints (hitPoints and strength).
 It initialises name, hitPoints and strength with the newly passed in values.
 -  And six methods:
 -  Only getters for the three fields.
 -  write(), same as interface. Return a List of the fields in the order they appear in toString().
 -  read(), same as interface. Store the values in the List, in the order they appear in toString().
 Make sure the List is not null and the size() is greater than 0 before storing the values.
 -  toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:
 Monster{name='Werewolf', hitPoints=20, strength=40}


 TIP:  Player and Monster need to implement ISaveable.
 TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
 TIP:  Be extremely careful about spaces and spelling in the returned String from the toString() method.



 NOTE:  All fields are private.
 NOTE:  Both constructors are public.
 NOTE:  All methods are public.
 NOTE:  There are no static members.
 NOTE:  Do not add a main method to the solution code.
 NOTE: Classes that are not in the java.lang package should be manually imported.
 NOTE:  If you get an error from the Evaluate class, it's most likely the constructor.
 Check if you've added a constructor or if the constructor has the right arguments.
 */

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {

        ArrayList<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        return values;
    }

    public void read(List<String> savedValues) {

        if (savedValues == null)
            return;
        if (savedValues.size() <= 0)
            return;
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
    }

    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

