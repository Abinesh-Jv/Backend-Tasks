package com.abinesh.backend.constructdestruct;

public class Main {

    public static void main(String[] args) {
        Theater t = new Theater(100);
        t.bookTicket(8);
        t.bookTicket(65);
        t = null;
        System.gc();
    }
}
