package com.itrainu.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {
	//this program is use to merge to files in one//

		public static void main(String[] args) throws IOException {

			FileWriter pw = new FileWriter("Arjun.txt");

			BufferedReader br = new BufferedReader(new FileReader("Arjun.txt"));

			String s1 = br.readLine();

			while (s1 != null) {

				pw.write(s1);

				s1 = br.readLine();

			}
			br.close();

			br = new BufferedReader(new FileReader("students.txt"));

			String s2 = br.readLine();

			while (s2 != null) {

				pw.write(s2);

				s2 = br.readLine();

			}
			br.close();
			pw.close();

			System.out.println("success.......");

		}
}
