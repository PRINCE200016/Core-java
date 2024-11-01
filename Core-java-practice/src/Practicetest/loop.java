package Practicetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class loop {

	public static void main(String[] args) throws ParseException {

//	
//		int row = 5;
//		for(int  i = 1;i<=row;i++) {
//			
//			System.out.println(" Arjun");
//				}
//	
//		int num =7;
//		System.out.println("multiplycation table of " +  num);
//		for(int i =1; i<=10; i++) {
//		int result = num*i;
//			System.out.println(num+" * "+i + "="+ result);
//			
//		}

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String Date = "21/09/2024";

		Date d = sdf.parse(Date);
		System.out.println(d + " (String to date)");

		String stringDate = sdf.format(d);
		
		System.out.println("  ");

		System.out.println(stringDate + " (Date to string)");

	}
}
