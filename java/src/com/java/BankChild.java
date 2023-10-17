package com.java;

public class BankChild extends BankParent {
	@Override
	public void atmpin() {
	System.out.println(8785);	
	}
	@Override
	public void accountno() {
		System.out.println(5454444664649l);
		
	}
public static void main(String[] args) {
	BankChild s=new BankChild();
	s.accountholdername();
	s.accountno();
	s.atmpin();
}

}
