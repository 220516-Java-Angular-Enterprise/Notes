# Shadowing in Java

***Inner class*** means one class that is a member of another class. 
There are basically four types of ***inner classes*** in java. 
***Nested Inner class*** can access any private instance variable 
of the outer class. Like any other instance variable, we can 
have access modifier `private`, `protected`, `public`, and `default` 
modifier.

## Implementation
```
// Java program to Demonstrates Shadowing in Java

// Class 1 and 2
// Outer Class
class Shadowing {

	// Custom instance variable or member variable
	String name = "Outer John";

	// Nested inner class
	class innerShadowing {

		// Instance variable or member variable
		String name = "Inner John";

		// Method of this class to
		// print content of instance variable
		public void print()
		{

			// Print statements
			System.out.println(name);
			System.out.println(Shadowing.this.name);
		}
	}
}

// Class 3
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Accessing an inner class by
		// creating object of outer class inside main()
		Shadowing obj = new Shadowing();

		Shadowing.innerShadowing innerObj
			= obj.new innerShadowing();

		// Calling method defined inside inner class
		// inside main() method
		innerObj.print();
	}
}
```