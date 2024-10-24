package inheritance;

public class DramaTheater extends Theater{
    private String dramaName;
    DramaTheater(String name, int totalSeat,String dramaName) {
        super(name, totalSeat);
        this.dramaName = dramaName;
    }

    public void getTheaterDetails(){
        System.out.println("Drama Name : "+this.dramaName);
        System.out.println("Available Seats : "+(this.totalSeat-this.bookedSeats));
        System.out.println("Show Rating :  ***** ");
    }
}
