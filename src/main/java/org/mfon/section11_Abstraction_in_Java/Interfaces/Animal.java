package org.mfon.section11_Abstraction_in_Java.Interfaces;
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA, COLLECTION;

    @Override
    public void track() {
      if (this !=GROUNDED){
          System.out.println("Monitoring " + this);
      }
    }
}
record DragonFly(String name, String type) implements FlightEnabled{
    @Override
    public void takeoff() {

    }
    @Override
    public void land() {

    }
    @Override
    public void fly() {

    }
}
class Satelite implements OrbitEarth{
    public void achieveOrbit(){
        System.out.println("Orbit achieved!");
    }
    @Override
    public void takeoff() {

    }
    @Override
    public void land() {

    }
    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
}
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
