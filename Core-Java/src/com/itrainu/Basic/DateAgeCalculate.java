package com.itrainu.Basic;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {

	public static void main(String[] args) {

	//	LocalDate today = LocalDate.now();

		//LocalDate empbirth = LocalDate.of(2000, 7, 16);

	//	Period p = Period.between(empbirth, today);
	//	System.out.println("employee age : " + p.getYears());
	LocalDate Today = LocalDate.now();
	LocalDate empbirth = LocalDate.of(2000, 7, 16);
	Period p = Period.between(empbirth, Today);
	System.out.println("employee age : "+ p.getYears());
	System.out.println("employe age in months :"+ p.getDays());
	}

}
