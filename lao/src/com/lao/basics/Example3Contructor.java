package com.lao.basics;

public class Example3Contructor extends Example3ContructorParentclass {
	// default constructor
	String name;
	String type;

	// non parameterized constructor
	Example3Contructor() {

		name = "bike";
		type = "two wheeler";

	}

	// parameterized constructor
	Example3Contructor(String vname, String vtype) {
		 name = vname;
		 type = vtype;
	}

	private void motors() {

		System.out.println("vehicle name is :" + name + " and " + "vehicle type is :" + type);

	}

	public static void main(String[] args) {
		// default constructor
		// Example3Contructor contructor = new Example3Contructor();
		// System.out.println(contructor.name+contructor.type);

		// non parameterized constructor
		Example3Contructor contructor2 = new Example3Contructor();
		contructor2.motors();

		// parameterized constructor
		Example3Contructor contructor3 = new Example3Contructor("car", "four wheeler");
		contructor3.motors();
		
		// parameterized constructor
		Example3Contructor contructor4 = new Example3Contructor("auto", "three wheeler");
		contructor4.motors();

	}
}