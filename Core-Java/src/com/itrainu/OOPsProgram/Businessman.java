package com.itrainu.OOPsProgram;

public class Businessman  implements Richman {

	public int amount = 2000;

	@Override
	public void donationg(int i) {

		System.out.println("Total Amount Of BusinessMan : " + amount);

		System.out.println("Donation Amount Of BusinessMan : " + i);

		int a = amount - i;

		System.out.println("Remain Amount After BusinessMan Donation : " + a);
	}

}
