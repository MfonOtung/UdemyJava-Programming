package org.mfon.section12_Generics.Generic_Class_Challenge;

/**
 In this challenge, You'll start with a Mappable Interface, that has one abstract method, render.
 You'll create two classes Point and Line, that implement this interface.
 You'll create two specific classes that extend each of these, for a mappable item of interest.
 I'll be mapping US National Parks, and a couple of major rivers in the US,
 so the parks will be points, and the rivers will be lines. The data I'll be using is shown here.
 I'll be creating a Park class that extends Point, and a River class that extends Line, to support this data.
 You should have constructors or methods, to support adding a couple of attributes, and
 some location data, to your two specific classes. You can pass the location data of a point type,
 as a String, or a set of double values, representing latitude and longitude.

 You can pass the multiple locations of a line, as a set of strings,
 or a two-dimensional array of doubles, that represents the multiple points on your line.
 In addition to these classes, you'll create a generic class called Layer. Layers in maps represent a set of data which
 can be layered on top of one another, to present many different sets of data on a single map. Your Layer class should
 have one type parameter, and should only allow Mappable elements as that type.
 This generic class should have a single private field, a list of elements to be mapped.
 This class should have a method or constructor, or both, to add elements.
 You should create a method, called renderLayer, that loops through all elements, and executes the method render,
 on each element.
 Your main method should create some instances of your specific classes, which include some location data.
 These should get added to a typed Layer, and the render Layer method called on that.
 */

public class Main {

    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495",
                        "35.1556, -90.0659"),
                new River("Missouri",
                        "45.9239, -111.4983", "38.8146, -90.1218")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);

        riverLayer.addElements(
                new River("Colorado",
                        "40.4708, -105.8286", "31.7811, -114.7724"),
                new River("Delaware",
                        "42.2026, -75.00836", "39.4955, -75.5592"));

        riverLayer.renderLayer();
    }
}
