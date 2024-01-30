package org.mfon.ObjectOrientedProgrammingMasterChallenge;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }
    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return (size + " " + name);
        }
            return name;
    }

    public double getBasePrice(){
        return price;
    }
    public double getAdjustedPrice(){
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }
    public void setSize(String size) {
        this.size = size;
    }
    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }
    //But next we'll create an instance method, with the same name, but no arguments on the Item class and
    // this will just call the static method.

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    //nd we're going to pass the results of the getName method, and the getAdjustedPrice method,
    //as the arguments to be printed. These are the methods that will
    //get overridden for any subclasses. And we can test this in the main method:
}

