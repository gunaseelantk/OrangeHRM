package com.java;

public class ContinueStatementExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration 3.");
                continue; // Skip the rest of the loop body and continue with the next iteration
            }
            System.out.println("Current value of i: " + i);
        }
    }
}

