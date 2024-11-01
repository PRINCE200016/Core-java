package com.itrainu.IO;
import java.io.FileWriter;  
import java.io.IOException;

public class Writefile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("students.txt");
            file.write("This file has information of Teachers");
            file.write("Name: Rosy Fernandes, Age: 36");
            file.write("Name: Isha Mheta, Age: 29");
            file.close();
            System.out.println("File has been written into.");
        } catch (IOException e) {
            System.out.println("Error......");
            e.printStackTrace();
        }
    }


}
