package com.java;

public class JumpDoWhileContinue {
	public static void main(String[] args) {
		int i=10;
		do {
			if(i==5) {
				i--;
				continue;
			}
			System.out.println(i);
			i--;
		}
		while(i>=1);
	}
}
