package com.abinesh.backend.abstractclass;

public abstract class AbstractClass {

    protected void bookTicket(int seatNumber){
        System.out.print("Booking the ticket in seat no "+seatNumber);
    }
    abstract protected String getDirection();

}
