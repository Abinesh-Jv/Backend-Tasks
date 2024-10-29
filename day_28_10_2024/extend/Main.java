package extend;

public class Main {
    public static void main(String[] args) {
        MovieTheater myMovieTheater = new MovieTheater("Grand Cinema", "Downtown", 5);
        myMovieTheater.showEvent();

        Auditorium<MovieTheater> movieAuditorium = new Auditorium<>(myMovieTheater);
        movieAuditorium.hostEvent();

        System.out.println("The theater in the auditorium is: " + movieAuditorium.getTheater().getName());
        System.out.println("Location: " + movieAuditorium.getTheater().getLocation());
        System.out.println("Number of screens: " + movieAuditorium.getTheater().getNumberOfScreens());
    }
}