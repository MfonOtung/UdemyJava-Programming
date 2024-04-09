package org.mfon.section11_Abstraction_in_Java.Interfaces;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }
    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
