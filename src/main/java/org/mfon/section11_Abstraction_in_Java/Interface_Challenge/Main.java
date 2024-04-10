package org.mfon.section11_Abstraction_in_Java.Interface_Challenge;
/**
 Create a Mappable Interface:

 The interface should force classes to implement three methods.
 One method should return a label (how the item will be described on the map).
 One should return a geometry type (POINT or LINE) which is what the type will look like on the map.
 The last should return an icon type (sometimes called a map marker), this could be a black push
 pin for a point of interest, or a red solid line for a highway for example.
 In addition to the three methods described, the interface should also include:
 a constant String value called JSON_PROPERTY, which is equal to: "properties":{%s}.
 A hint here, using a text block will help maintain quotation marks in your output.
 Include a default method called toJSON() that prints out the type, label, and marker.

 I'll show examples shortly. This interface should also have a static method, that takes a Mappable
 instance as an argument. This method should print out the properties for each mappable type,
 including those mentioned above, but also any other fields on the business classes.
 You'll also want to create two classes that implement this interface, these
 can be anything you want, but the examples I'll use are a Building and UtilityLine.

 One class, in my case the Building,
 should have a geometry type of POINT, and One class should have a geometry type of Line.
 The UtilityLine class will be my example for a class that will be a LINE on a map.
 When these items are mapped, The Building will be shown on a city map,
 as a point with the icon and label specified, and the Utility Line will be a line on the map.
 We aren't actually going to map it, we'd need quite a bit more time for that, but we'll have
 some of the data elements that a mapping system would need, and in one format that it could use.
 Your final output should look something like I show on this slide.
 You should output the geometry type, the icon information, and the label.

 Here is an example for a building, including type, label, and marker, but also the building
 name and usage, which are fields on building.
 And here is an example for a fiber optic Utility line, so a LINE, a green dotted line, would get
 drawn for a fiber optic cable on College Street.
 You can see that the properties are a comma-delimited list, in curly braces,
 with the property or field name in quotes, then a colon,
 followed by the property value or field value, and that's also in double quotes.
 Ok, so go and see what you can do, and again, make sure you have some fun with this.
 Maybe you want to map towns and roads, or parks and rivers.
 Just make sure one class could be a point on your map, and one could be a line.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House",
                UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
