package com.lao.control_statements;

public class Example1ConditionStatement {
	
	boolean isCupEmpty;

	public static void main(String[] args) {
		
		Example1ConditionStatement condition = new Example1ConditionStatement();
		
		if(condition.isCupEmpty) {
			System.out.println("fill the cup with coffee");
		}
		else {
			System.out.println("drink the coffee");
		}

	}

}