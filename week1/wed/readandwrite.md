# Reading and Writing in Java

## Reading from Console

### 1. Using Scanner Class

This is probably the most preferred method to take input. 
The main purpose of the Scanner class is to parse 
primitive types and strings using regular expressions, 
however, it is also can be used to read input from the 
user in the command line. 
```
// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class GetInputFromUser {
public static void main(String args[])
{
// Using Scanner for Getting Input from User
Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		System.out.println("You entered string " + s);

		int a = in.nextInt();
		System.out.println("You entered integer " + a);

		float b = in.nextFloat();
		System.out.println("You entered float " + b);
	}
}
```

### 2. Using Console Class

It has been becoming a preferred way for reading 
user’s input from the command line. In addition, 
it can be used for reading password-like input 
without echoing the characters entered by the user; 
the format string syntax can also be used 
(like `System.out.printf()`). 

```
// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
public class Sample {
	public static void main(String[] args)
	{
		// Using Console to input data from user
		String name = System.console().readLine();

		System.out.println("You entered string " + name);
	}
}
```

## Reading from a File

There are multiple ways of writing and reading a text 
file. this is required while dealing with many 
applications. There are several ways to read a 
plain text file in Java e.g. you can use `FileReader`, 
`BufferedReader`, or `Scanner` to read a text file. 
Every utility provides something special e.g. 
`BufferedReader` provides buffering of data for fast 
reading, and Scanner provides parsing ability.

### Using FileReader Class

Convenience class for reading character files. 
The constructors of this class assume that the 
default character encoding and the default byte-buffer 
size are appropriate.

Constructors defined in this class are as follows:

* `FileReader(File file)`: Creates a new FileReader, 
given the File to read from


* `FileReader(FileDescriptor fd)`: Creates a new 
FileReader, given the FileDescriptor to read from


* `FileReader(String fileName)`: Creates a new FileReader, 
given the name of the file to read from

```
// Java Program to Illustrate reading from
// FileReader using FileReader class

// Importing input output classes
import java.io.*;

// Main class
// ReadingFromFile
public class GFG {

	// Main driver method
	public static void main(String[] args) throws Exception
	{

		// Passing the path to the file as a parameter
		FileReader fr = new FileReader(
			"C:\\Users\\pankaj\\Desktop\\test.txt");

		// Declaring loop variable
		int i;
		// Holds true till there is nothing to read
		while ((i = fr.read()) != -1)

			// Print all the content of a file
			System.out.print((char)i);
	}
}
```

### Using Scanner Class

A simple text scanner that can parse primitive types 
and strings using regular expressions. A `Scanner`
breaks its input into tokens using a delimiter pattern, 
which by default matches whitespace. The resulting 
tokens may then be converted into values of different 
types using the various next methods.

```
// Java Program to illustrate
// reading from Text File
// using Scanner Class
import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner
{
public static void main(String[] args) throws Exception
{
	// pass the path to the file as a parameter
	File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
	Scanner sc = new Scanner(file);

	while (sc.hasNextLine())
	System.out.println(sc.nextLine());
}
}

```