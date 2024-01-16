package org.mfon.section7.OOPInheritance.Inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

        public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight){
            this(type, weight, "Perky", "curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
    }//Overriding the makeNoise method on Animal Class(super class); done when you want the child class to
    // show different behaviour for that method.


    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tails");
    }
}