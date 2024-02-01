package org.mfon.section7_Inheritance;

public class AllAboutString {
    public static void main(String[] args) {
        //STRING INSPECTION METHODS:
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        //STRING COMPARISON METHODS:
        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")){
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }

        //STRING MANIPULATION METHODS:
        //1. Substring:
        String birthDate = "25/10/1982";
        int startingIndex = birthDate.indexOf("1982");
        int startingIndex1 = birthDate.indexOf("10");
        int startingIndex2 = birthDate.indexOf("8");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("startingIndex1 = " + startingIndex1);
        System.out.println("startingIndex2 = " + startingIndex2);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        //To extract the month from this date;
        System.out.println("Month = " + birthDate.substring(3, 5));

        //INTRODUCING DELIMITER:
        //2. join method
        String newDate = String.join("/", "25", "10", "1982");
        System.out.println("newDate = " + newDate);

        //3. Different ways of concatenation:
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        //A more efficient way of coding the above;
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        //Preferable method of concatenation - method chaining:
        newDate = "25".concat("/").concat("11").concat("/") .concat("1982");
        System.out.println("newDate = " + newDate);

        //4. Replace String Varieties:
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        //5. Repeat:
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        //6. Indent:
        //5. Repeat:
        System.out.println("ABC\n".repeat(3).indent(8)); //To add 8 spaces before ABC
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); //To remove spaces from each line
        System.out.println("-".repeat(20));

        //STRING BUILDER:
        String helloWorld1 = "Hello" + " World";
        helloWorld1.concat("and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation1(helloWorld1);
        printInformation1(helloWorldBuilder);

        //More String Builder instances:
        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation1(emptyStart);
        printInformation1(emptyStart32);

        //String Builder Methods:
        StringBuilder builderPlus= new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g'); //Deleting 'G' and inserting 'g' where 'G' was
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G"); //Replacing 'G' with 'g'
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7); //Reverse and Setlength:
        System.out.println(builderPlus);
    }
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

    //STRING BUILDER:
    public static void printInformation1(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }
    public static void printInformation1(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());

        //Adding another method named capacity:
        System.out.println("capacity = " + builder.capacity());
    }
}
