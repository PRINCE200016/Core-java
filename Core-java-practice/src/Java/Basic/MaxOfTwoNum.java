package Java.Basic;

import java.util.Scanner;

public class MaxOfTwoNum {
static void maximum(double a,double b) {
	double c = Math.max(a, b);
	System.out.println(c);
}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter first num");
		double a= scanner.nextDouble();
		System.out.println("Enter next num");
		double b = scanner.nextDouble();
		maximum(a,b);
//	public static void main(String[] args) {
//		Scanner scannner = new Scanner(System.in);
//		 System.out.println("enter the first number : ");
//		 double num1 = scannner.nextDouble();
//		 System.out.println("enter the second number :");
//		 double num2 = scannner.nextDouble();
//		 double max = Math.max(num1,num2);
//		  System.out.println("the maximum of " +num1 + " and "+ num2 + " is " + max);
	}

}


