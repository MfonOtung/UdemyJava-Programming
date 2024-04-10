package org.mfon.section11_Abstraction_in_Java.Interfaces;
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
      if (this !=GROUNDED){
          System.out.println("Monitoring " + this);
      }
    }
    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
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
    FlightStages stage = FlightStages.GROUNDED;
    public void achieveOrbit(){
//        System.out.println("Orbit achieved!");
        transition("Orbit achieved!");
    }
    @Override
    public void takeoff() {
        transition("Taking Off");
    }
    @Override
    public void land() {
        transition("Landing");
    }
    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting");
    }
    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
    //static void log(String description){
        //var today = new java.util.Date(); //Using a fully qualified name
        //System.out.println(today + ": " + description);
        /**this method can be made private and static, which means only methods on this interface can actually call it*/
    private static void log(String description){
    var today = new java.util.Date(); //Using a fully qualified name
    System.out.println(today + ": " + description);
    }
    private void logStage(FlightStages stage, String description){
        description = stage + ": " + description;
        log(description);
    }
    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
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
    //FlightStages transition(FlightStages stage);
    default FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}
interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();
}
