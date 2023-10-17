package com.java;

import java.util.Scanner;

public class Scannerclass {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first name and last name");
    String next = s.next();
	System.out.println("first name:");
    System.out.println("first nameis:"+next);
    
    System.out.println("last name:");
    String nextline=s.nextLine();
    System.out.println("last name is:"+nextline);
    
	System.out.println("enter the birth date");
	byte nextbyte=s.nextByte();
	//System.out.println(nextbyte);
	
	System.out.println("enter the birth month");
	short nextshort=s.nextShort();
	//System.out.println(nextshort);
	
	System.out.println("enter the birth year");
	int nextint=s.nextInt();
	System.out.println("DOB is:"+nextbyte+"/"+nextshort+"/"+nextint);
	
	System.out.println("enter the phone number");
	long nextlong=s.nextLong();
	System.out.println("phone number is:"+ nextlong);
	
	System.out.println("enter the born weight");
	float nextfloat=s.nextFloat();
	System.out.println("born weight is:"+nextfloat+"kg");
	
	System.out.println("enter the birth time");
	double nextdouble=s.nextDouble();
	System.out.println("birth time is:"+nextdouble);
	
	System.out.println("enter your father name");
	char charAt=s.next().charAt(0);
	System.out.println(next +nextline+" . "+charAt);
	System.out.println("enter the place of birth");
	String toString=s.next().toString();
	System.out.println("birth place is:"+toString);
}
}
