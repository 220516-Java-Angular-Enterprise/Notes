# Exception hierarchy

In Java "an event that occurs during the execution of a program that disrupts the normal flow of instructions" is called
an exception. This is generally an unexpected or unwanted event which can occur either at compile-time or run-time in
application code. Java exceptions can be of several types and all exception types are organized in a fundamental
hierarchy.

The class at the top of the exception class hierachy is the Throwable class, which is a direct subclass of the Object
class. Throwable has two direct subclasses - Exception and Error.

The diagram below shows the standard exception and error classes defined in Java, organized in the Java exceptions'
hierarchy:

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png">

The Exception class is used for exception conditions that the application may need to handle. Examples of exceptions
include `IllegalArgumentException`, `ClassNotFoundException` and `NullPointerException`.

The Error class is used to indicate a more serious problem in the architecture and should not be handled in the
application code. Examples of errors include `InternalError`, `OutOfMemoryError` and `AssertionError`.

Exceptions are further subdivided into checked (compile-time) and unchecked (run-time) exceptions. All subclasses of
`RuntimeException` are unchecked exceptions, whereas all subclasses of Exception besides `RuntimeException` are checked
exceptions.

# Checked vs Unchecked exceptions

## Checked Exceptions

Exceptions that can occur at compile-time are called checked exceptions since they need to be explicitly checked and
handled in code. Classes that directly inherit Throwable - except `RuntimeException` and Error - are checked exceptions
e.g. `IOException`, `InterruptedException` etc.

Here is an example of a method that handles a checked exception:

```
public void writeToFile() {
try (BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"))) {
        bw.write("Test");
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
} 
```

In this example, both statements within the try block (the instantiation of the `BufferedWriter` object and writing to
file using the object) can throw `IOException`, which is a checked exception and therefore needs to be handled either by
the method or its caller. In the example, `IOException` is handled within the method and the exception stack trace is
printed to the console.

Furthermore, the `BufferedWriter` object is a resource, which should be closed when it is no longer needed and closing
it can throw an `IOException` as well. In such cases where closing resources themselves can throw exceptions, using a
try-with-resources block is best practice since this takes care of the closing of resources automatically. The example
shown earlier uses try-with-resources for exactly this reason.

## Unchecked Exceptions

Unchecked exceptions can be thrown "at any time" (i.e. run-time). Therefore, methods don't have to explicitly catch or
throw unchecked exceptions. Classes that inherit `RuntimeException` are unchecked exceptions e.g. `ArithmeticException`,
`NullPointerException`.

Here is an example of a method that throws an unchecked exception (NullPointerException) which is not handled in code:

```
public void writeToFile() {
    try (BufferedWriter bw = null) {
        bw.write("Test");
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
} 
```

When the above method is called, a NullPointerException is thrown because the BufferedWriter object is null:

```
Exception in thread "main" java.lang.NullPointerException
    at IOExceptionExample.writeToFile(IOExceptionExample.java:10)
    at IOExceptionExample.main(IOExceptionExample.java:17) 
```

As mentioned, since NullPointerException is an unchecked exception, it did not need to be handled in code - only the
checked exception (IOException) was handled.

# Try-with-resources

## Java try block

Java **try** block is used to enclose the code that might throw an exception. It must be used within the method.

If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it
is recommended not to keep the code in try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

## Syntax of Java try-catch

``` 
try {

    //code that may throw an exception
        
} catch (Exception_class_Name ref){ }    
```

## Syntax of try-finally block

``` 
try {
    
    //code that may throw an exception
        
} finally { } 
```

## Internal Working of Java try-catch block

<img src="https://simplesnippets.tech/wp-content/uploads/2018/05/internal-working-of-try-catch-finally-block-in-java.jpg">

The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default
exception handler that performs the following tasks:

- Prints out exception description.
- Prints the stack trace (Hierarchy of methods where the exception occurred).
- Causes the program to terminate.

But if the application programmer handles the exception, the normal flow of the application is maintained, i.e., rest of
the code is executed.

# Multi-catch blocks

A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler.
So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.

## Points to remember

- At a time only one exception occurs and at a time only one catch block is executed.
- All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come
  before catch for Exception.

## Flowchart of Multi-catch Block

<img src="https://www.scientecheasy.com/wp-content/uploads/2020/05/multiple-try-catch-block.png">

# Custom Exceptions

<pre>
    public class MultipleCatchBlock1 {

      public static void main(String[] args) {

        try {

          int a[]=new int[5];    
          a[5]=30/0;

        } catch(ArithmeticException e) {  

            System.out.println("Arithmetic Exception occurs");

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBounds Exception occurs");

        } catch(Exception e) {

            System.out.println("Parent Exception occurs");

        }

        System.out.println("rest of the code");

        }  
    }  
</pre>