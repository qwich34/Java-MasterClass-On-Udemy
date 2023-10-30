package PolymorphismPt3;

public class NextTestMovieObjectClass {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        //Casting
        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane");

        //Casting Objects
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        // What is var keyword?
        // var is a special contextual keyword in Java,
        // that lets our code take advantage of Local Variable Type Interface.

        // By using var as the type, we're telling Java to figure out the compile-time type for us.

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // Local Variable Type Interface was introduced in Java 10 (LVTI)
        // One of the benefits is to help the readability of the code,
        // and to reduce boilerplate code.

        // It's called Local Variable Type Interface for a reason, because:
            // it can't be used in field declaration on a class
            // it can't be used in method signatures, either as parameter type or a return type.
            // it can't be used without an assignment, because the type can't be inferred in that case
            // it can't be assigned a null literal, again because a type can't be inferred in that case
    }

}
