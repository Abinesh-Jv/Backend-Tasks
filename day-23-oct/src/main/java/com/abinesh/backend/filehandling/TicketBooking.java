package com.abinesh.backend.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TicketBooking {
    File f;
    TicketBooking(String fileName) throws IOException {
        this.f = new File("/Users/abi-zstch1400/Documents/SAS/backend/day-23-oct/src/main/resources/"+fileName);
        if(f.createNewFile()){
            System.out.println("created file : "+fileName);
        }
    }

    public void bookTicket(String name,int seat,String paymentMethod) throws IOException {
        FileWriter fw = new FileWriter(this.f,true);
        fw.write(name + " Booked a ticket in seat number "+seat+" using "+paymentMethod+"\n");
        System.out.println("Data Added");
        fw.close();
    }
    public void readFile() throws FileNotFoundException {
        Scanner file = new Scanner(this.f);
        StringBuilder str = new StringBuilder();
        while (file.hasNextLine()){
            str.append(file.nextLine());
            str.append("\n");
        }
        System.out.print(str);
    }
    public void deleteFile(){
        this.f.delete();
        System.out.println("File Deleted");
    }



}
