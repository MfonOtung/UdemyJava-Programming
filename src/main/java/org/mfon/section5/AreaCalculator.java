package org.mfon.section5;

/**
 Area Calculator
 Write a method named area with one double parameter named radius.

 The method needs to return a double value that represents the area of a circle.

 If the parameter radius is negative then return -1.0 to represent an invalid value.

 Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

 The method needs to return an area of a rectangle.

 If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

 For formulas and PI value please check the tips below.

 Examples of input/output:

 area(5.0); should return 78.53981633974483 or 78.53981

 area(-1);  should return -1 since the parameter is negative

 area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

 area(-1.0, 4.0);  should return -1 since first the parameter is negative



 NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
 NOTE: Do not add a  main method to solution code.
 */

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-5));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(-1.0, -4.0));
    }

    public static double area (double radius) {
        double areaOfaCircle = Math.pow(radius, 2) * 3.14159265;
        if (radius < 0){
            return -1; //Invalid value
        }
        return areaOfaCircle;
    }

    public static double area (double x, double y) {
        double areaOfaRectangle = x * y;
        if (x < 0 || y < 0 ){
            return -1;
        }
        return areaOfaRectangle;
    }
}
