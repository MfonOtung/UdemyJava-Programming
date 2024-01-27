package org.mfon.section8Polymorphism.Polymorphism.PolymorphismChallengeExercise;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar("2022 Blue Ferrari 296 GTS");
        runRace(myCar);
        MyCar ferrari = new GasPoweredMyCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

    }
    public static void runRace(MyCar myCar){
        myCar.startEngine();
        myCar.drive();
    }
}

