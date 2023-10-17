package com.java;

public class SwapTask {
	public static void main(String[] args) {
		//USING 3RD VARIABLE
		 String a = "APPLE";
	     String b = "PAPAYA";
	        
	        System.out.println("Before swapping: a = " + a + ", b = " + b);
	        
	        String temp = a;
	        a = b;
	        b = temp;
	        
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    //WITHOUT USING 3RD VARIABLE
	        
	        System.out.println("Before swapping: a = "+a+", b = "+b);
	        a = a + b;
	        b = a.substring(0,a.length()-b.length());
	        a = a.substring(b.length());
	        System.out.println("After Swapping: a =  "+a+", b = "+b);
	}

}
