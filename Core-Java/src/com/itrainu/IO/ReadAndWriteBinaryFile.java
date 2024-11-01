package com.itrainu.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	//this program is basically done an image jpg file into new created jpg file basically tranfer the data of file into another copy// 

		public static void main(String[] args) throws IOException {

			String source = "E:\\radheyju.jpg";

			String target = "E:\\Radha.jpg";

			@SuppressWarnings("resource")
			FileInputStream in = new FileInputStream(source);

			FileOutputStream out = new FileOutputStream(target);

			int i = in.read();

			while (i != -1) {

				out.write(i);

				i = in.read();

			}

			out.close();
			System.out.println("sucessfullyy......");

		}

}
