package com.lao.basics;

public class Example1BankAccount {

	Long accountNumber = 987654321012l;
	String holderName = "gunaseelan";
	Integer accountBalance = 60000;

	private Integer AccountBalance() {
		// TODO Auto-generated method stub
		System.out.println("Account Balance is : "+ accountBalance);
		return accountBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1BankAccount account=new Example1BankAccount();
		account.AccountBalance();
	}

}
