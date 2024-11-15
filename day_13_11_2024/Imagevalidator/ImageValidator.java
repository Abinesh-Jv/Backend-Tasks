package com.abinesh.backend.Imagevalidator;

import java.awt.*;
import java.util.regex.Pattern;


public class ImageValidator {

    public static void main(String[] args) {
        System.setProperty("apple.awt.application.appearance", "system");
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select a file", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String fileName = fileDialog.getFile();
        frame.dispose();
        System.out.println(fileName);
        if(Pattern.matches(".*\\.(png|jpg|jpeg|webp)$",fileName)){
            System.out.println("Its an image");
        }else{
            System.out.println("Its not an Image");
        }

    }
}
