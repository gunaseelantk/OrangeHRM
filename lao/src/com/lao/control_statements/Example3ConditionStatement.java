package com.lao.control_statements;

public class Example3ConditionStatement {
	
	String myheroName = "Ajithkumar";
	
	public void ultimatestar() {
		switch (myheroName) {
		case "Simbu":
			System.out.println("Yes Simbu is Little Super Star");
			break;
		case "Vikram":
			System.out.println("Yes Vikram is Chiyan");
			break;
		case "Vijay":
			System.out.println("Yes Vijay is IllaiyaThalabathy");
			break;
		case "Ajithkumar":
			System.out.println("Yes Ajithkumar is Ultimate star/Thala");
			break;

		default:
			System.out.println("Sorry I Can't Guess");
			break;
			
		}

	}

	public static void main(String[] args) {
		Example3ConditionStatement conditionStatement = new Example3ConditionStatement();
		conditionStatement.ultimatestar();
		
	}
}