package com.revature.lambda_expressions;

/* FunctionalInterface only have one abstract method. */
/* You can only use lambda expression on FunctionalInterface. */
@FunctionalInterface
public interface Action {
    int add(int a, int b);
}
