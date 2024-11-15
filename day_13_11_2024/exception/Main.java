package com.abinesh.backend.exception;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int seats = 500;

        HashSet<Integer> booked_seats = new HashSet<>();
        boolean error = false;

        try {
            while (true) {

                System.out.println("Seat to book : ");
                String seat = sc.next();
                if (seat.equals("exit")) {
                    break;
                }
                int seatNum;
                if (Pattern.matches("^\\d+$", seat)) {
                    seatNum = Integer.parseInt(seat);
                } else {
                    throw new MyException("give a valid number");
                }
                if (seatNum > seats) {
                    throw new MyException("Only " + seats + " seats are available");
                }
                if (booked_seats.contains(seatNum)) {
                    throw new MyException("the seat is already booked");
                } else {
                    booked_seats.add(seatNum);
                }
            }

        } catch (MyException e) {
            System.err.println(e.getMessage());
            error = true;
        }
        finally {
            System.out.println("The loop is ended" + (error?" With":" Without") +" Exception");
        }
    }
}
