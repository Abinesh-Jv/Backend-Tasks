package com.abinesh.backend.enums;

public enum Seat {
    WOODEN_CHAIR(150),
    FIRST_CLASS(250),
    VIP(500);

    final int price;
    Seat(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    public String getDetails(){
        String seat = "";
        switch (this){
            case WOODEN_CHAIR -> seat = "Wooden chair";
            case FIRST_CLASS -> seat = "First Class";
            case VIP -> seat = "VIP";
        }
        return "You got a "+seat+" seat which worth "+this.price+"$";
    }

}
