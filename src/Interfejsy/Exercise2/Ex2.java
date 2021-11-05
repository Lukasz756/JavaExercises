package Interfejsy.Exercise2;

public class Ex2 {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Star Wars")
                .setDirector("J. J. Abrams")
                .setYear(2015)
                .setCategory("Action")
                .setPublisher("Disney")
                .createMovie();

        System.out.println(movie.toString());


    }
}
