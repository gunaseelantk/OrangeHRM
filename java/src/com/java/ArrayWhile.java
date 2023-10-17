package com.java;

public class ArrayWhile {
public static void main(String[] args) {
	int i[]=new int[5];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	i[4]=5;
	int j=0;
	while(j<=4) {
		System.out.println(i[j]);
		j++;
	}
}
}
