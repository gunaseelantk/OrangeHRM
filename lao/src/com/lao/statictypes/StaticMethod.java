package com.lao.statictypes;

public class StaticMethod {
	
	public static void method1() {
		
		System.out.println("static method");

	}
	
	public void Method2() {
		
		System.out.println("non-static method");
		

	}
	public static void main(String[] args) {
		
		StaticMethod method = new StaticMethod();
		method1();
		method.Method2();

	}

}
