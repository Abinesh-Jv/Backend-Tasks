package com.abinesh.backend.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        ArrayList<Integer> seats = new ArrayList<>();
        seats.add(1);
        seats.add(2);
        Ticket ticket = new Ticket(1,"Avenger",seats,500);
        JSONObject json = new JSONObject(ticket);
        jsonArray.put(json);
        seats = new ArrayList<>();
        seats.add(3);
        seats.add(4);
        ticket = new Ticket(1,"Avenger",seats,500);
        json = new JSONObject(ticket);
        jsonArray.put(json);

        System.out.println(jsonArray);
    }
}
