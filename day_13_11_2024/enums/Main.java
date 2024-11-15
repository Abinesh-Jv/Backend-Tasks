package com.abinesh.backend.enums;

public class Main {
    public static void main(String[] args) {
        Seat seat = Seat.VIP;
        System.out.println(seat.getDetails());

        seat = Seat.WOODEN_CHAIR;
        System.out.println("The cost of the wooden chair seat is "+seat.getPrice());

    }
}
