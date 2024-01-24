package org.mfon.section8Polymorphism.Encapsulation.EncapsulationChallengeExercise;

/**
 Create a class named Printer.
 It's going to simulate a real computer printer, a laser printer.
 The fields on this class are going to be:
 - tonerLevel, which is the percentage of how much toner level is left.
 - pagesPrinted, which is the count of total pages printed by the Printer.
 - duplex, which is a boolean indicator. If true, it can print on 2 sides of a single sheet of paper.

 You'll want to initialize your printer, by specifying a starting toner amount,
 and whether the printer is duplex or not.
 On the Printer class, you want to create two methods, which the calling code should be able to access.
 These methods are:

 - addToner() which takes a tonerAmount argument. tonerAmount is added to the tonerLevel field.
 The tonerLevel should never exceed 100 percent, or ever get below 0 percent.
 If the amount being added makes the level fall outside that range, return a -1 from the method,
 otherwise return the actual toner level.

 - printPages() which should take pages to be printed as the argument.
 It should determine how many sheets of paper, will be printed based on the duplex value,
 and return this sheet number from the method. The sheet number should also be added to the pagesPrinted variable.
 If it's a duplex printer, print a message that it's a duplex printer.
 */
public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;


    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100)? tonerLevel : -1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if ( tempAmount > 100 || tempAmount < 0 ){
            return -1;
        }
        tonerLevel += tonerAmount ;
        return tonerLevel;
    }
    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
            return jobPages;
    }
    //To retrieve the number of pages printed, we generate a getter so we could determine is the value is valid
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
