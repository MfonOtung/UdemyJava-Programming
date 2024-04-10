package org.mfon.section11_Abstraction_in_Java.Interfaces;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
    }
    private static void inFlight(FlightEnabled flier){
        flier.takeoff();
        flier.transition(FlightStages.LAUNCH); //for transition to be implemented, it has to be overriden in the jet class
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
