package org.mfon.section7Inheritance.OOPInheritance.Inheritance;

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

    @Override
    public void makeNoise() {
        if (type == "Wolf"){
            System.out.println("Ow Woooo! ");
        }
        bark();
        System.out.println();
    }
    //Overriding the makeNoise method on Animal Class(super class); done when you want the child class to
    // show different behaviour for that method.
    //Test by creating a method wolf on the AnimalMain



    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tails");
        if (speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }
//To get behaviours specific to Dog, we create specific Dog methods; then comment the sout of move override
    private void bark(){
        System.out.println("Woof");
    }
    private void run(){
        System.out.println("DOg Running");
    }
    private void walk(){
        System.out.println("Dog Walking");
    }
    private void wagTail(){
        System.out.println("Tail Wagging");
    }
}
