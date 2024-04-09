package org.mfon.section11_Abstraction_in_Java.Interfaces;
interface FlightEnabled{
//    public abstract void takeoff();
//    abstract void land();
//    void fly();
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeoff();
    void land();
    void fly();
}
interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();
}
