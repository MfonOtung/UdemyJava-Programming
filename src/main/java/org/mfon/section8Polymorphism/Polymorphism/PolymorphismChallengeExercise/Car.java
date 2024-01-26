package org.mfon.section8Polymorphism.Polymorphism.PolymorphismChallengeExercise;

/**
 This diagram shows a base class, Car, with one field, description, and three methods,
 startEngine(), drive() and runEngine().
 The first two methods should be declared as public.
 The method runEngine however, is protected, and it will only get called from the drive method in Car.

 And here, we've given you three types of subclasses, or three types of cars that you might find on the road.
 We have the GasPoweredCar, the ElectricCar, and the HybridCar.
 You can imagine that these three subclasses, might have different ways to start their engine,
 or drive, depending on their engine type.
 And each of these classes might have different variables or fields, that might be used in those methods.
 We show you a few of the fields here, but you should try to be creative in your own design.
 Maybe you might be interested in the top speed of the cars, or how fast they can accelerate,
 or some other way you want to compare these cars' performances.
 It's your job, to create this class structure in Java, and override some, or maybe all, of these methods appropriately.

 And you'll write code in a Main class and main method, that creates an instance of each
 of these classes, and that executes different behavior for each instance.
 At least one method should print the type of the runtime object.
 */
public class Car {
    private String description;
    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("Car -> startEngine");
    }
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }
    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;

    }
}
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
