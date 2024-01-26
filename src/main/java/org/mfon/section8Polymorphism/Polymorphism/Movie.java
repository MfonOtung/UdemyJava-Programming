package org.mfon.section8Polymorphism.Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    //The method getClass() is on Java linked object, and returns class type information about the runtime instance
    // on which this method is executing. And from that we can get the name of the class using the getSimpleName method.

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
        //The switch expression takes whatever was passed to us, making it uppercase, then just getting the first letter.
        //In this case, each of the subclasses has a unique letter for its class name, so we can use that, to figure out
        // the right kind of movie to create.

        //2. On the Main the "type" can be changed to any of the subclasses or the char, or even a class that has not
        // been created yet; and the details about the movie will be obtained. This is called Factory method.
        //On the Main class and main method, we'll use polymorphism, to watch a variety of movies.
        //This time, we'll make the code interactive, using the Scanner class.
        //We'll let the user enter the type of movie, and then the title of the movie they want to watch.
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
        //The format specifier, %s is used to replace any String
    }
    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}
class Comedy extends Movie{
    public Comedy (String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny Happens",
                "Something even funnier Happens",
                "Happy Ending");
        //The format specifier, %s is used to replace any String
    }
    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}
class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
        //The format specifier, %s is used to replace any String
    }
    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");
    }
}
