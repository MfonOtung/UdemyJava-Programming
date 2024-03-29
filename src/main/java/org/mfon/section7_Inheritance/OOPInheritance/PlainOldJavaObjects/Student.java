package org.mfon.section7_Inheritance.OOPInheritance.PlainOldJavaObjects;

/**
 POPULATING DATA USING CONSTRUCTOR
 Create five students in a loop.
 Use the loop variable to create a unique id. At first, we'll hard code the name as Mary,
 as well as set dateOfBirth, and classList, to some literal values.
 */

public class Student {
    private String id;
    private  String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
    //To handle these repetitive codes, we introduce a kind of POJO called "Record". It is created just like a class.
}
