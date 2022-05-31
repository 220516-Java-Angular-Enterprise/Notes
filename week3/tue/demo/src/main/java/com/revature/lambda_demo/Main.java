package com.revature.lambda_demo;

public class Main {
    public static void main(String[] args) {

        /*
         * We can think of lambda expression as declaring a function as a variable.
         * But can we assign a block of code as a variable?
         * Why use lambda expression?
         * Enables functional programming.
         * It helps to iterate, filter and extract data from collection.
         * The Lambda expression is used to provide the implementation of an interface which has functional interface.
         * It saves a lot of code.
         * In case of lambda expression, we don't need to define the method again for providing the implementation.
         */

        Action action = (a, b) -> {
            return a + b;
        };

        System.out.println(action.add(1, 2));
    }
}
