package Java.Basic;

import java.util.Scanner;

public class exercise414II {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Enter a natural number: "); int n = scanner.nextInt();
		 * scanner.close();
		 * 
		 * int reversedNum = reverseNaturalNumber(n);
		 * System.out.println("The reversed number is: " + reversedNum); }
		 * 
		 * public static int reverseNaturalNumber(int num) { if (num <= 0) {
		 * System.out.println("Please provide a positive natural number."); return -1;
		 * // Indicating an error }
		 * 
		 * int reversed = 0; while (num > 0) { int digit = num % 10; reversed = reversed
		 * * 10 + digit; num /= 10; }
		 * 
		 */
		// return reversed;

		// genrate a triangle
	/*	int ab = 4;         // Numbber of row for the triangle
		// outer loop for each row
		for (int i = 1; i <= ab; i++) {
			// inner loop for each row
			for (int j = 1; j <= ab; j++) {
				// print the row number if the column is  less than or  equal to 
			//	to the row
				if (j <= i) {
					System.out.print(i+" "); 

				}

			}
			// move to next line after each row
			System.out.println(""); */
		
		// # question 7
		 
	/*	for(int i = 100; i<=200; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			} */
		
		//# question 8
		
	/*	int [] [] table = new int [10] [10];
		for (int i= 0; i<table.length; i++) {
			for(int j = 0; j<table.length; j++) {
				table [i][j] = (i + 1)*(j+ 1);
				System.out.print(table[i][j]+"\t");
			}
			System.out.println( );
		}
*/
		//# question 8 find the given number is prime or not 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		sc.close();
		
		if(isPrime(a)) {
			System.out.println(a+" is a prime number .");
		}else {
			System.out.println(a+" is not a prime number");
			
		}
		
		}
	static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
	
	
	for (int i=2; i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
	}
}


