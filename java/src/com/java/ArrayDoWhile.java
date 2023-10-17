package com.java;

public class ArrayDoWhile {
	public static void main(String[] args) {
		int i[]=new int[5];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		i[4]=5;
		int j=0;
		do{
			System.out.println(i[j]);
			j++;
		}while(j<=4); 
	}
}
