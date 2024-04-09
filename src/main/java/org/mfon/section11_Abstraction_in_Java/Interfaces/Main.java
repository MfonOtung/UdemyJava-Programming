package org.mfon.section11_Abstraction_in_Java.Interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();
//        flier.takeoff();
//        flier.fly();
//        tracked.track();
//        flier.land();
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();
        //inFlight(flier);
        inFlight(new Butterfly());

        double kmstraveled = 100;
        double milesTraveled = kmstraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmstraveled, milesTraveled);

//        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        //List<FlightEnabled> butterFliers = new ArrayList<>();
        List<FlightEnabled> butterFliers = new LinkedList<>(); //This can be refactored to LinkedList and it will still compile
        butterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(butterFliers);
        flyFliers(butterFliers);
        landFliers(butterFliers);
        //This doesn't compile so we change the arraylist to linkedList
    }
    private static void inFlight(FlightEnabled flier){
        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
//    private static void triggerFliers(ArrayList<FlightEnabled> fliers){
    private static void triggerFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.takeoff();
        }
    }
//    private static void flyFliers(ArrayList<FlightEnabled> fliers){
    private static void flyFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.fly();
        }
    }
//    private static void landFliers(ArrayList<FlightEnabled> fliers){
private static void landFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.land();
        }
    }
}
