package com.java;

public class Overriding extends Overloading {
public void studentdetails(String name) {
	super.studentdetails(name);
}
	public void studentdetails(int rollnumber, String dob) {
		super.studentdetails(rollnumber, dob);
	}
		public void studentdetails(int m1, int m2, int m3, int m4, int m5) {
			super.studentdetails(m1, m2, m3, m4, m5);
		}
		public static void main(String[] args) {
			Overriding m=new Overriding();
			m.studentdetails("NAME : GUNASEELAN");
			m.studentdetails( 03,"01-02-1995");
			m.studentdetails(98,97,94,99,100);
		}
}
