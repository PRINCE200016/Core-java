package com.itrainu.IO;
import java.io.File;

public class Deletionfile {
    public static void main(String[] args) {
        File file = new File("students.txt"); 
        if (file.delete()) { 
            System.out.println("Deleted Sccessfully: " + file.getName());
        } else {
            System.out.println("Error......");
        } 
    }


}
