package com.itrainu.Basic;

public interface Functionalintf {
	public interface FunctionalIntf {

		public int sum(int a, int b);

		// static Method
		public static void multi(int a, int b) {

			System.out.println("Multi : " + (a * b));

		}
		
//		public static void sum1(int a, int b) {
	//
//			System.out.println("Sum : " + (a + b));
	//
//		}

		// default Method
		public default void sub(int a, int b) {

			System.out.println("Sub : " + (a - b));

		}
		public default void sum1(int a, int b) {
			
				System.out.println("Sum : " + (a + b));
				}

	}
}
