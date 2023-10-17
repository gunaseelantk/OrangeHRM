package com.java;

public class BankAbsint implements BankInterface {

	@Override
	public void accountholdername() {
		// TODO Auto-generated method stub
		System.out.println("guna");
	}

	@Override
	public void accountno() {
		// TODO Auto-generated method stub
		System.out.println(1564545456);
	}

	@Override
	public void atmpin() {
		// TODO Auto-generated method stub
		System.out.println(1345);
	}
	public static void main(String[] args) {
		BankAbsint s=new BankAbsint();
		s.accountholdername();
		s.accountno();
		s.atmpin();
	}

}
