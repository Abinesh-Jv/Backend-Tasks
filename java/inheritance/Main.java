package inheritance;

public class Main {

    public static void main(String[] args) {
        Theater theater = new MovieTheater("Pheonix",500,"GOAT");
        theater.bookTicket();
        theater.getTheaterDetails();

        theater = new DramaTheater("SchoolStage",256,"RomeoJuliet");

        theater.bookTicket();
        theater.getTheaterDetails();

        theater = new Theater("Auditorium",43);
        theater.bookTicket();
        theater.getTheaterDetails();


    }

}