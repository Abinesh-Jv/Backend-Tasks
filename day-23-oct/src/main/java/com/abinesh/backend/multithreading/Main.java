package com.abinesh.backend.multithreading;

public class Main {
    public static void main(String[] args) {
        MultiThreading screen1 = new MultiThreading("Screen 1",10);
        MultiThreading screen2 = new MultiThreading("Screen 2",15);
        screen1.start();
        screen2.start();
    }

}
