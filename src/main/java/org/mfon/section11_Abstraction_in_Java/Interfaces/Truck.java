package org.mfon.section11_Abstraction_in_Java.Interfaces;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
