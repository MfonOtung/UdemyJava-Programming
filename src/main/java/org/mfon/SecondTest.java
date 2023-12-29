package org.mfon;

public class SecondTest {
    public static void main(String[] args) {
        System.out.println("Hello, Mfon");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int var1 = 20;
        int var2 = 70;
        if (var1 < var2 && var1 > 10) {
            System.out.println("Whatever");
        }
        int newValue = 40;
        if (newValue == 40) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to be");
        }

        boolean isCart = false;
        if (!isCart) {
            System.out.println("This is a lie");
        }

        String makeOfCar = "Volkswagen";
        String isDomestic = makeOfCar == "Volkswagen"? "prohibited"  : "allowed";
        //if (isDomestic) {
            System.out.println("Make of Car is domestic to our country");
            System.out.println("Make of car is " + isDomestic);
        //}

        String carBrand = "Volkswagen";
        boolean isMadeBy = carBrand != "Volkswagen"? true  : false;
        //if (isMadeBy) {
            System.out.println(isMadeBy);
        //}

        String carName = "Volkswagen";
        boolean isProducedBy = carName == "Volkswagen"? true  : false;
        if (isProducedBy) {
        System.out.println(isProducedBy);
        }

        String comment = isProducedBy? "The Company name is Volkswagen": "The Company name is not Volkswagen";
        System.out.println(comment);

        //Challenge
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double result = (firstDouble +secondDouble) * 100;
        double remainder = (result % 40);
        boolean remainderValue = (remainder == 0.00)? true: false;
        System.out.println(remainderValue);
        if (remainderValue != true) {
            System.out.println("Got some remainder");
        }






    }
}
