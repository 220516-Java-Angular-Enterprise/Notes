# Introduction to TDD and Unit Testing

## Test Driven Development

- It is commonly accepted that any software we create must be tested to ensure it meets the functional requirements, but
  we must also test non-functional requirements, like security, usability, and -- critically -- maintainability.


- Test-driven development (TDD) is an established technique for delivering better software, more rapidly, and more
  sustainably over time.

## JUnit Testing

JUnit is a test framework which uses annotations to identify methods that specify a test.

# Assert methods

You use an assert method, provided by JUnit or another assert framework, to check an expected result versus the actual
result. These method calls are typically called asserts or assert statements.

You should provide meaningful messages in assert statements. That makes it easier for the user to identify and fix the
problem. This is especially true if someone looks at the problem, who did not write the code under test or the test
code.

# JUnit annotations

JUnit Annotations is a special form of syntactic meta-data that can be added to Java source code for better code
readability and structure. Variables, parameters, packages, methods and classes can be annotated. Annotations were
introduced in Junit4, which makes Java code more readable and simple.

**Example**
<br>
`@Test` - This annotation is a replacement of org.junit.TestCase which indicates that public void method to which
it is attached can be executed as a test Case.