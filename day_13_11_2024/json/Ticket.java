package com.abinesh.backend.json;

import java.util.ArrayList;

public class Ticket {
    private final int ticketNo;
    private final String movieName;
    private final ArrayList<Integer> seats;
    private final int price;

    public int getTicketNo() {
        return ticketNo;
    }

    public String getTheaterName() {
        return movieName;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public int getPrice() {
        return price;
    }

    public Ticket(int ticketNo, String theaterName, ArrayList<Integer> seats, int price) {
        this.ticketNo = ticketNo;
        this.movieName = theaterName;
        this.seats = seats;
        this.price = price;
    }
}
