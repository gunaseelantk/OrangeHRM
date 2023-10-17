package com.java;

public class StudenDetails {
	public StudenDetails(String name) {
	System.out.println(name);
	}
	public StudenDetails(int id) {
	System.out.println(id);
	}
	public StudenDetails(long number) {
	System.out.println(number);
	}
	public StudenDetails() {
	System.out.println("TCFTECHNOLOGY");
	}
	public static void main(String[] args) throws Throwable {
	StudenDetails s=new StudenDetails("GUNASEELAN");
	StudenDetails s1=new StudenDetails(03);
	StudenDetails s2=new StudenDetails(9876543210l);
	StudenDetails s3=new StudenDetails();
	s.finalize();
    s1.finalize();
    s2.finalize();
    s3.finalize();
	}
}
