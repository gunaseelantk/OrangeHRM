package com.java;

public class StringBuilderTask {
	public static void main(String[] args) throws InterruptedException {
		int j;
		StringBuilder s=new StringBuilder("guna");
		System.out.println(System.identityHashCode(s));
		for (j=5; j>=1; j--) {
			Thread.sleep(1000);
			System.out.println(j+"sec");
		}
		
		StringBuilder s1=new StringBuilder("guna");
		System.out.println(System.identityHashCode(s1));
		
		for (j=5; j>=1; j--) {
			Thread.sleep(1000);
			System.out.println(j+"sec");
		}
		System.out.println(System.identityHashCode(s.append(s1)));
		
	}

}
