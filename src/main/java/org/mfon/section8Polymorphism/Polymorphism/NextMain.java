package org.mfon.section8Polymorphism.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie( "A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();
        //Like casting with primitives, we can cast instances.
        // The result of the Movie.getMovie, is cast to an Adventure type.
        // And also add the call to watchMovie here - jaws.watchMovie();

        //Object comedy = Movie.getMovie("C", "Airplane");
        //comedy.watchMovie();
        //*This cannot compile because comedy is of the type Object, and there is no such method as watchMovie on Object.
        //*In other words, to run watchMovie on comedy (which has the type Object),  we'd have to cast it to a Movie.

        //Object comedy = Movie.getMovie("C", "Airplane");
        //Movie comedyMovie = (Movie) comedy;
        //comedyMovie.watchComedy();
        //*This doesn't compile either. For the same reason we couldn't execute watchMovie on an Object reference,
        //* we  can't run watchComedy on just a Movie reference. It needs to be cast to a more specific type, Comedy.

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        //How to test what the runtime type of an object really is.
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();

        //Another way, testing if the  object coming back might be an Adventure type.
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
