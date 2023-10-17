package com.java;

public class JumpDoWhileBreak {
public static void main(String[] args) {
	int i=10;
	do {
		if(i==5) {
			break;
		}
		System.out.println(i);
		i--;
	}
	while(i>=1);
}
}
