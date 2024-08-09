package com.itrainu.Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateparsing {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		String date = "16/07/2024";

		Date d = sdf.parse(date);

		System.out.println(d + "(string to date)");

		String stringDate = sdf.format(d);

		System.out.println(stringDate + "(date to string)");

	}

}
