package org.mfon.section11_Abstraction_in_Java.Coding_Exercice_Interface;

import java.util.ArrayList;
import java.util.List;

/**
 Interface:
 Create a simple interface that allows an object to be saved to some sort of storage medium.
 Implement the following:

 1.  ISaveable (interface)
 -  It has two methods:
 -  write(), takes no arguments and returns a List containing objects of type String.
 -  read(), takes a List of type String and doesn't return anything.

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

public interface ISaveable {
    List<String> write();

    void read(List<String> tmp);
}
