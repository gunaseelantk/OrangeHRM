package com.java;

import java.util.LinkedList;
import java.util.List;

public class   CollectionLinkedList{
	public static void main(String[] args) {
		List<String> s=new LinkedList<String>();
		s.add("g");
		s.add("u");
		s.add("n");
		s.add("a");
		System.out.println(s);
		int size = s.size();
		System.out.println(size);
		String string = s.get(0);
		System.out.println(string);
		int indexOf = s.indexOf("u");
		System.out.println(indexOf);
		boolean contains = s.contains("s");
		System.out.println(contains);
		s.set(3, "s");
		System.out.println(s);
	//	String remove = s.remove(3);
	//	System.out.println(remove);
	//	s.clear();
	//	System.out.println(s);
		
		List<String> s1=new LinkedList<>();
		s1.add("s");
		s1.add("e");
		s1.add("e");
		s1.add("l");
		s1.add("a");
		s1.add("n");
		System.out.println(s1);
	//	s1.addAll(s);
	//	System.out.println(s1);
	//	s1.retainAll(s);
	//	System.out.println(s1);
		s1.removeAll(s);
		System.out.println(s1);
	}

}
