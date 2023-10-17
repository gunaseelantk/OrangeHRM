package com.java;

public class stringMethods {
public static void main(String[] args) {
	String s="Hello Java";
	String s1="Hello Java";
	String s2="";
	String s3="hello java";
	int length =s.length();
	System.out.println(length);
	boolean equals = s1.equals(s1);
	System.out.println(equals);
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	boolean startsWith = s.startsWith("H");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("a");
	System.out.println(endsWith);
	boolean contains = s.contains("J");
	System.out.println(contains);
	int indexOf = s.indexOf('a');
	System.out.println(indexOf);
	int lastIndexOf = s.lastIndexOf('a');
	System.out.println(lastIndexOf);
	char charAt = s.charAt(0);
	System.out.println(charAt);
	String replace = s.replace(" ", "_");
	System.out.println(replace);
	String substring = s.substring(6);
	System.out.println(substring);
	boolean empty = s2.isEmpty();
	System.out.println(empty);
	String[] split = s3.split("");
	for(String b:split) {
		System.out.println(b);
	}
	String trim = s.trim();
	System.out.println(trim);
	String substring2 = s.substring(1, 5);
	System.out.println(substring2);
}
}
