package com.java;

public class SplitTask {
	public static void main(String[] args) {
		String s = "butterfly";
		String[] split = s.split("");
		for(String b:split) {
			System.out.println(b);
		}
	}
}
