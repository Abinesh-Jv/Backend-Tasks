package com.abinesh.backend.constructdestruct;

public class Theater {
    private int numberOfSeats;
    Theater(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
        System.out.println("A theater with total of "+numberOfSeats+" is created");
    }
    public void bookTicket(int numberOfTickets){
        this.numberOfSeats -= numberOfTickets;
        System.out.println(numberOfTickets+" is booked and only "+this.numberOfSeats+" seats are available");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("the theater is demolished");
    }
}
