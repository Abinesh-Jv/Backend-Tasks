package filehandling;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TicketBooking theater = new TicketBooking("log");
        theater.bookTicket("Abinesh",87,"Card");
        theater.readFile();
        theater.deleteFile();

    }
}
