package com.abinesh.backend.inheritance;

public class Theater {
    protected final String name;
    protected final int totalSeat;
    protected int bookedSeats = 0;
    Theater(String name,int totalSeat){
        this.name = name;
        this.totalSeat = totalSeat;
    }
    public void getAvailableSeats(){
        System.out.println(this.totalSeat - this.bookedSeats);
    }
    public void bookTicket(){
        this.bookedSeats++;
        System.out.println("A seat is booked in "+this.name);
    }
    public void getTheaterDetails(){
        System.out.println("Available Seats : "+(this.totalSeat-this.bookedSeats));
        System.out.println("Show Type :  Any ");
    }
}

