package com.revature.exceptions;

public class Problem {
    public static void main(String[] args) {
        int num = 0;
        int[] arr = {1,2,3,4,5};
        String allLetters = "animal";
        String allInts = "123";

        try {
            num = Integer.parseInt(allInts);
            num = Integer.parseInt(allLetters);
            System.out.println(arr[5]); // will never run, need another try block
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // the same as doing two different catch blocks
            e.printStackTrace();
        } finally {
            System.out.println(num);
        }
    }
}
