//package PolymorphismPt4;

public class NextTestMovieObjectClass {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
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

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();

            // The instanceof operator, lets you test the type of object or instance.
            // The reference variable you are testing, is the left operand.
            // The type you are testing for, is the right operand.

            // unknownObject instanceof Adventure

            // It's important that Adventure is not in quotes, meaning we're not testing the type name,
            // but the actual type.
            // This operator returns true, if unknownObject is an instance of Adventure.

        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();

            // If the JVM can identify that the object matches the type,
            // it can extract data from the object, without casting.

            // For this operator, the object can be assigned to a binding variable,
            // which here is called syfy.

            // From our example:
            // unknownObject instanceof ScienceFiction syfy

            // The variable syfy (if the instance method returns true)
            // is already typed as ScienceFiction variable.
        }
    }
}
