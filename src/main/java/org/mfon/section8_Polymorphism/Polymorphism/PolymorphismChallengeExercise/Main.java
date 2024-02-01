package org.mfon.section8_Polymorphism.Polymorphism.PolymorphismChallengeExercise;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar("2022 Blue Ferrari 296 GTS");
        runRace(myCar);
        MyCar ferrari = new GasPoweredMyCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        MyCar tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);
        MyCar ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }
    public static void runRace(MyCar myCar){
        myCar.startEngine();
        myCar.drive();
    }
}

