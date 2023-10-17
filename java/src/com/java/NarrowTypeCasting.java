package com.java;

/*Narrow type casting, also known as explicit or manual type casting,
 *  is the process of converting a data type with a larger range to a data
 *   type with a smaller range. In Java, this is often used when you want to 
 *   store a larger data type in a smaller one, which may result in a potential
 *    loss of data. You use the casting operator (datatype) to perform a 
 *    narrow type cast.*/

public class NarrowTypeCasting {
    public static void main(String[] args) {
        // Declare a double and an int
        double doubleValue = 123.456;
        int intValue;

        // Attempt to directly assign the double to the int (will not compile)
        // intValue = doubleValue; // Error: Incompatible types

        // Perform a narrow type cast from double to int
        intValue = (int) doubleValue;

        // Print the values
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intValue);
    }
}
