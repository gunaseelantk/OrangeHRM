package com.lao.control_statements;

public class Example2ConditionStatement {
	
	String myheroName = "ThalaAjith";
	
	public void guesshero() {
		
		if(myheroName.equalsIgnoreCase("Vijay")) {
			System.out.println("you thought about IllaiyaThalabathyVijay");
		}else if(myheroName.equalsIgnoreCase("Kamal Hassan")) {
			System.out.println("you thought about Kamal Hassan");
		}else if(myheroName.equalsIgnoreCase("Dhanush")) {
			System.out.println("you thought about Dhanush");
		}else {
			System.out.println("I can't guess");
		}
		
		

	}

	public static void main(String[] args) {
		
		Example2ConditionStatement conditionStatement = new Example2ConditionStatement();
		conditionStatement.guesshero();
		

	}

}