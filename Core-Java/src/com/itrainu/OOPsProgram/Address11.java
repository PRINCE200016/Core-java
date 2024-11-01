package com.itrainu.OOPsProgram;

public class Address11 implements Cloneable{

public String city;
public Address11(String city) {
	this.city=city;
	
}
@Override
protected  Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}
}

