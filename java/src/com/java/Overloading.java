package com.java;

public class Overloading {
	public void studentdetails(String name) {
		System.out.println(name);
		
	}
	public void studentdetails(int rollnumber ,String dob) {
		System.out.println("ROLL NUMBER="+rollnumber);
		System.out.println("DOB ="+dob);
		
	}
	public void studentdetails(int m1,int m2,int m3,int m4,int m5 ) {
		System.out.println("MARK DETAILS :");
		System.out.println("ENGLISH="+m1+","+"TAMIL="+m2+","+"MATHS="+m3+","+"SCIENCE="+m4+","+"SOCIAL="+m5);
		
	}
/*public static void main(String[] args) {
	Overloading s=new Overloading();
	s.studentdetails("gunaseelan");
	s.studentdetails(03, "01/02/1995");
	s.studentdetails(99, 99, 99, 99, 99);
}*/
}
