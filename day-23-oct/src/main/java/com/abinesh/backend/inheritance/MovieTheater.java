package com.abinesh.backend.inheritance;

public class MovieTheater extends Theater{
    private String movieName;
    MovieTheater(String name, int totalSeat,String movieName) {
        super(name, totalSeat);
        this.movieName = name;
    }

    public void getTheaterDetails(){
        System.out.println("Movie Name : "+this.movieName);
        System.out.println("Available Seats : "+(this.totalSeat-this.bookedSeats));
        System.out.println("Movie Rating :  ***** ");
    }
}
