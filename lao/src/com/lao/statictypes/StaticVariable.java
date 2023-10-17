package com.lao.statictypes;

public class StaticVariable {
	
	static int accountbalance;
	String Deposited_by;
	
	public static void main(String[] args) {
		
		StaticVariable staticVariable=new StaticVariable();
		System.out.println(staticVariable.Deposited_by = "ram");
		System.out.println(accountbalance=1000);
		
		
		StaticVariable staticVariable2=new StaticVariable();
		System.out.println(staticVariable2.Deposited_by = "sam");
		System.out.println(accountbalance=2000);
		
		
	}

}
