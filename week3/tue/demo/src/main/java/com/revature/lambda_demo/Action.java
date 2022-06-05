package com.revature.lambda_demo;

/* FunctionalInterface only have one abstract method. */
/* You can only use lambda expression on FunctionalInterface. */
@FunctionalInterface
public interface Action {
    void speak();
}
