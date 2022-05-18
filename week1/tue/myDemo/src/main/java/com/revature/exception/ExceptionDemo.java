package com.revature.exception;

public class ExceptionDemo {

    public static void main(String[] args) {
        /* An exception is an unwanted event that can disrupt the flow of our program */
        /* This will throw an exception bc you cannot convert a string animal into an int. */


        int num = 0;
        int[] arr = {1, 2, 3, 4, 5};
        String willThrowException = "animal"; // Converting this into an int will throw an exception
        String willNotThrowException = "123"; // This is a valid conversion

        try {
            num = Integer.parseInt(willThrowException);
        } catch ( Exception e) {
            //e.printStackTrace();
            System.out.println("Exception was thrown.");
        } finally {
            System.out.println("Exiting Try-Catch Block");
        }

        // We can catch multiple exceptions using multi try-catch blocks
        try {
            num = Integer.parseInt("cat");
            System.out.println(arr[5]);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException was thrown.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException was thrown.");
        }

    }

}
