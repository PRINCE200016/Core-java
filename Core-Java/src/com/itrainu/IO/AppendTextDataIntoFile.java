package com.itrainu.IO;

import java.io.FileWriter;

public class AppendTextDataIntoFile {
public static void main(String[] args){
	try {FileWriter Writer =new FileWriter("C:\\Users\\arjun\\arjun.txt");
	Writer.write("new twxt file");
	System.out.println("added....success");
	Writer.close();
		
	} catch (Exception e) {
		
	}
		
	
}

}



