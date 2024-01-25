package org.mfon.section8Polymorphism.Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Movie theMovie = new Movie ("Star Wars");
        //theMovie.watchMovie();

        //Movie theMovie = new Adventure ("Star Wars");
        //theMovie.watchMovie();
        //Movie can be changed to Adventure without changing the variable name because Adventure is a type of Movie.

        //Movie theMovie = Movie.getMovie ("Adventure", "Star Wars");
        //theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type (A for Adventure, C for Comedy," + "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
                //contains is used to test what the user entered. This means, if the user enters a single character,
                // either an uppercase or lowercase Q, then the code will break out of the loop.
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
