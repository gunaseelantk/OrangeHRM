package com.java;

	import java.util.Scanner;

	public class BillDiscount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the total bill amount: ");
	        double totalBillAmount = scanner.nextDouble();

	        double discount = 0.0;

	        if (totalBillAmount >500) {
	            discount = totalBillAmount * 0.10;
	        } else if (totalBillAmount <=500) {
	            discount = totalBillAmount * 0.05;
	        }

	        double discountedBillAmount = totalBillAmount - discount;

	        System.out.println("Total Bill Amount: " + totalBillAmount);
	        System.out.println("Discount: " + discount);
	        System.out.println("Discounted Bill Amount: " + discountedBillAmount);
	        System.out.println("THANKYOU! HAVE A NICE DAY!");

	        scanner.close();
	    }
	

}
