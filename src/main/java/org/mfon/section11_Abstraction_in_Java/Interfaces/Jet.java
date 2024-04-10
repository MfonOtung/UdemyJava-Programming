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
    @Override
    public FlightStages transition(FlightStages stage){
        //return FlightEnabled.super.transition(stage);
        System.out.println(getClass().getSimpleName() + " transitioning");
        //return FlightStages.CRUISE;
        return FlightEnabled.super.transition(stage); //Whenever you call a default method from an overridden method,you need to qualify super with the interface type.//
    }
}
