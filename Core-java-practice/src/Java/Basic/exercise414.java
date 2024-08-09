package Java.Basic;

import java.util.Scanner;
import java.util.Random;
public class exercise414 {

	public static void main(String[] args) {
		// 1 find maximum of two numbers

		// * Scanner scannner = new Scanner(System.in);
		// System.out.println("enter the first number : ");
		// double num1 = scannner.nextDouble();
		// System.out.println("enter the second number :");
		// double num2 = scannner.nextDouble();
		// double max = Math.max(num1,num2);
		// * System.out.println("the maximum of " +num1 + " and "+ num2 + " is " + max);

		// 2 # smaller of two number using conditional operators

		// Scanner scannner = new Scanner(System.in);
		// System.out.println("enter the first number : ");
		// double num1 = scannner.nextDouble();
		// System.out.println("enter the second number :");
		// double num2 = scannner.nextDouble();
		// double smaller = (num1 < num2) ? num1 : num2 ;
		// System.out.println(" the smaller number is " + smaller);

		// 3 # program to generate 5 random integer numbers between 1 to 100
		
//	Random random = new Random();
	//	 System.out.println("generate random number : ");
		//  for (int i = 0; i < 5; i++) {
	  //          int randomNumber = random.nextInt(100) + 1;
	//	  System.out.println(randomNumber);
		
		// 4 #find factorial of a given number
		
	Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number for find factorial ");
		int num = scanner.nextInt();
	long factorial = 1;
	
	
	if (num < 0) {
		System.out.println("factorial is not defined for negative numbers , : ");
		
	} else {
		for (int i = 1; i <= num; i++) { 
			factorial *= i;
		}
		System.out.println("factorial of "+num+"is "+factorial);
	}

		
	}

}
