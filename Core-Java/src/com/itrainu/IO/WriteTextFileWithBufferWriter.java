package com.itrainu.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileWithBufferWriter {
	public static void main(String[] args) throws IOException {

		FileWriter fr = new FileWriter("Arjun.txt");

		BufferedWriter bw = new BufferedWriter(fr);

		char[] charArry = { 'h', 'i' };

		bw.write(charArry);
		bw.write(',');
		bw.write("SunRays");

		System.out.println("successfully....");

		bw.close();
	}
}
