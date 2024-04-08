package org.mfon.section11_Abstraction_in_Java;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override
    public void move(String speed) {
//        if (speed.equals("slow")){
//            System.out.println(type + " lazily swimming");
//        }else {
//            System.out.println(type + " darting frantically");
//        }
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " lazily swimming");
        }else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }
    @Override
    public void makeNoise() {
        if (type == "Goldfish"){
            System.out.print("swish ");
        }else {
            System.out.print("splash ");
        }
    }
}
