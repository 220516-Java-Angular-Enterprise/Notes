package com.revature.exception;

import com.revature.inheritance.Cat;

public class ExceptionDemo {
    public static void main(String[] args) {
        /* An exception is an unwanted event that can disrupt the flow of our program. */
        /* This will throw an exception because you cannot convert a string animal into an integer. */

        int num = 0;
        int[] arr = {1, 2, 3, 4, 5};
        String willThrowException = "animal"; // Converting this into an integer will throw an exception.
        String willNotThrowException = "123"; // This is a valid conversion.

        /* Use a try-catch block to handle exceptions */
        try {
            num = Integer.parseInt(willNotThrowException);
        } catch (NumberFormatException e) {
            System.out.println("Exception was thrown.");
        }

        /* We can catch multiple exceptions using multi try-catch blocks */
        try {
            num = Integer.parseInt("asdf"); // NumberFormatException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException was thrown.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("AOOBE was thrown.");
        }

    }
}
