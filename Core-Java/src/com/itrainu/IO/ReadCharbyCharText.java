package com.itrainu.IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharbyCharText {
	public static void main(String[] args) throws IOException {
		//this program is used to read all the character present in the file and shown them on console//

		FileReader file = new FileReader("Arjun.txt");

		int i = file.read();

		while (i != -1) {

			System.out.print((char) i);

			i = file.read();

		}

		file.close();

	}
        
        }
    


