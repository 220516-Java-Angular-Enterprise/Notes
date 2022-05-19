## Variables
We store information in variables, named locations in memory.
In Java,
We specify the type of information we're storing.
Primitive datatypes are types of data built-in to the Java system.

Declare a variable to reference it within our program.
Declaring a variable requires that we specify the type and name. 

Example:
int age;
double salaryRequirement;
boolean isEmployed;

# ints
Whole numbers are very common in programming. 
int data type allows values between
-2,147,483,648 and 2,147,483,647 

Example:
// int variable declaration
int yearJavaWasCreated;
//assignment
yearJavaWasCreated =1996;
//declaration and assignment
int numberOfPrimitiveTypes = 8;

# doubles
Whole numbers don't accomplish what we want to do in every program.
We need decimal points. 
The max_value=1.797,693,134,862,315, 7E+308
Which is 17 followed by 307 zeros.
The minimum value is 4.9 E-324 which is 324 decimal places.

//doubles can have decimal places:
double price=8.99;
//double can have values bigger than what an int could hold:
double gdp=12237700000;

# booleans
Programs face yes or no questions.
These questions are answered with a boolean, a type that references one of two values: true or false
Example:
boolean javaIsACompiledLanguage=true;
boolean javaIsACupOfCoffee=false;

# char 
char : can hold any character, letter, space, or punctuation mark.
Example:
char grade = 'A';
char firstLetter= 'p';
char punctuation='!';

# String
Strings are objects instead of primitives.
Objects have built-in behavior.
Strings hold sequences of characters. 
There are two ways to create a String object:
1. Using a string literal
2. Calling the String class to create a new String object

- String literal is any sequence of characters enclosed in double-quotes (" ")
 # Escape sequences
The \" escape sequence allows us to add quotation marks " to a String value 
Example: 
System.out.println("\"Hello World"");
// Prints: "Hello World"

If we don't use an escape sequence, then Java would think we're using " " to end the String.

Using \\ allows us to place backslashes in our String text:
System.out.println("This is the backslash symbol:\\");

If we place a \n escape sequence in a String, the compiler will output a new line of text:
System.out.println ("Hello\nGoodbye");
/* Prints:
Hello
Goodbye
*/
\n:newline


# Static : Checking 
Java programming language has static typing. 
Java will not compile or run if a variable is assigned a value of incorrect type
That bug is a declaration bug. 

Bugs are DANGEROUS!!!
They make our code crash or produce incorrect results.
When bugs are not caught at compilation... they interrupt execution of the code by cause RUNTIME errors.
