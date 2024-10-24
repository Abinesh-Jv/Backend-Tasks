package com.abinesh.backend.inheritance;

public class DramaTheater extends Theater{
    private String dramaName;
    DramaTheater(String name, int totalSeat,String movieName) {
        super(name, totalSeat);
        this.dramaName = name;
    }

    public void getTheaterDetails(){
        System.out.println("Movie Name : "+this.dramaName);
        System.out.println("Available Seats : "+(this.totalSeat-this.bookedSeats));
        System.out.println("Movie Rating :  ***** ");
    }
}
