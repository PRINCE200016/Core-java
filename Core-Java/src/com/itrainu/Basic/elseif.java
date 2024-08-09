package com.itrainu.Basic;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		int age;
		System.out.println("enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		switch(age){
		case 18:
			System.out.println("you are adult now !");
			
			break;
		case 24:
			System.out.println("you can marrige now !");
			break;
		case 60:
			System.out.println("you get retired now !");
			break;
			default:
				System.out.println("enjoy your life !");
		
		}
		{
			System.out.println("thanks for using my code !");
		}
	}
}
	
	
		//*int age;
	//System.out.println("enter your age");
		//Scanner sc = new Scanner(System.in);
		//age = sc.nextInt();
		
		//if (age>70) {
			//System.out.println("you are exprienced");
			
	//	}
		//else if  (age>50){
			//System.out.println("you are semi experienced");
	//	}
		
		//else if (age>35){
			//System.out.println("you are semi-semi expirenced");
		//}
		//else {
	//		System.out.println("you are not a kind any more");
//		}
	//} 

//}
