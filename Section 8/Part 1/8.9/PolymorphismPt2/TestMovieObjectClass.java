package PolymorphismPt2;

import java.util.Scanner;

public class TestMovieObjectClass {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("ScienceFiction","Star Wars");
//        theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type (A for Adventure, C for Comedy, "
            + "S for Fiction, or Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains((type))) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}