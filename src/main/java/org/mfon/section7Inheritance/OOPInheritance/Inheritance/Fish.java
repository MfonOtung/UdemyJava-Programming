package org.mfon.section7Inheritance.OOPInheritance.Inheritance;

public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.println("muscles moving");
    }
    private void moveBackFins(){
        System.out.println("back fin moving");
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast"){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
