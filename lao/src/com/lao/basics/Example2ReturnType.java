package com.lao.basics;

public class Example2ReturnType {
	
	int collectionamount=1000;
	
	private Integer CollectAndGiveToMe() {
		System.out.println("amount collected and given " +collectionamount);
		return collectionamount;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Example2ReturnType example2ReturnType=new Example2ReturnType();
		Integer amount = example2ReturnType.CollectAndGiveToMe();
		System.out.println("got the amount "+amount);
	}

}