package org.mfon.section7.OOPInheritance.PlainOldJavaObjects;

/**
 Complex Operations:
 A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is a
 solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number.
 For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two
 complex numbers, just add or subtract the corresponding real and imaginary parts. For instance,
 the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.

 Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary
 of type double. It represents the Complex Number.
 The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs
 to initialize the fields.

 Write the following methods (instance methods):
 Method named getReal without any parameters, it needs to return the value of real field.
 Method named getImaginary without any parameters, it needs to return the value of imaginary field.
 Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
 In other words, it needs to do a complex number add operation as described above.
 Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the
 corresponding instance variables.
 Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters
 from fields, in other words, it needs to do a complex number subtract operation as described above.
 Method named subtract with one parameter of type ComplexNumber. It needs to subtract the other parameter from
 this complex number.

 TEST EXAMPLE
 → TEST CODE:
 ComplexNumber one = new ComplexNumber(1.0, 1.0);
 ComplexNumber number = new ComplexNumber(2.5, -1.5);
 one.add(1,1);
 System.out.println("one.real= " + one.getReal());
 System.out.println("one.imaginary= " + one.getImaginary());
 one.subtract(number);
 System.out.println("one.real= " + one.getReal());
 System.out.println("one.imaginary= " + one.getImaginary());
 number.subtract(one);
 System.out.println("number.real= " + number.getReal());
 System.out.println("number.imaginary= " + number.getImaginary());
 → OUTPUT

 one.real= 2.0
 one.imaginary= 2.0
 one.real= -0.5
 one.imaginary= 3.5
 number.real= 3.0
 number.imaginary= -5.0


 NOTE: Try to avoid duplicated code.
 NOTE: All ​methods should be defined as public NOT public static.
 NOTE: In total, you have to write 6 methods.
 NOTE: Do not add a main method to the solution code.


 */
public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary ;
    }

    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }


//    private double real;
//    private double imaginary;
//
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//    //Method named getReal without any parameters, it needs to return the value of real field.
//    public double getReal() {
//        return real;
//    }
//    // Method named getImaginary without any parameters, it needs to return the value of imaginary field.
//    public double getImaginary() {
//        return imaginary;
//    }
//    // Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
//    // In other words, it needs to do a complex number add operation as described above.
//    public double add(double real, double imaginary) {
//        ComplexNumber equation1 = new ComplexNumber(real,imaginary);
//        ComplexNumber equation2 = new ComplexNumber(real, imaginary);
//        return (equation1.real + equation2.real) + (equation1.imaginary + equation2.imaginary);
//    }
//    // Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the
//    // corresponding instance variables.
//    public double add(ComplexNumber a) {
//        ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
//        return (complexNumber.real + getReal()) + (complexNumber.imaginary + getImaginary());
//    }
//    // Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters
//    // from fields, in other words, it needs to do a complex number subtract operation as described above.
//    public double subtract(double real, double imaginary) {
//        ComplexNumber equation1 = new ComplexNumber(real,imaginary);
//        ComplexNumber equation2 = new ComplexNumber(real, imaginary);
//        return (equation2.real + equation1.real) + (equation2.imaginary + equation1.imaginary);
//    }
//    // Method named subtract with one parameter of type ComplexNumber. It needs to subtract the other parameter from
//    // this complex number.
//    public double subtract(ComplexNumber b) {
//        ComplexNumber add = b;
//        ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
//        return (getReal() - complexNumber.real) + (getImaginary() - complexNumber.imaginary);
//    }
}
