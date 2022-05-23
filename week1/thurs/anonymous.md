# Anonymous Inner Class in Java

An anonymous inner class is an inner class without a name and 
for which only a single object is created. An anonymous inner 
class can be useful when making an instance of an object with 
certain “extras” such as overriding methods of a class or 
interface, without having to actually subclass a class.

## Syntax:
```
// Test can be interface,abstract/concrete class
Test t = new Test()
{
// data members and methods
public void test_method()
{
........
........
}   
};
```

* A normal class can implement any number of interfaces but 
the anonymous inner class can implement only one interface at a 
time.


* A regular class can extend a class and implement any 
number of interfaces simultaneously. But anonymous Inner 
class can extend a class or can implement an interface but 
not both at a time.


* For regular/normal class, we can write any number of 
constructors but we can’t write any constructor for anonymous 
Inner class because the anonymous class does not have any 
name and while defining constructor class name and constructor 
name must be same.

***Note:*** We can declare the following in anonymous classes 
as follows:

* Fields
* Extra methods (even if they do not implement any methods 
of the supertype)
* Instance initializers
* Local classes

## Example
```
// Java Program to Demonstrate Anonymous inner class

// Interface
interface Age {
int x = 21;
void getAge();
}

// Main class
class AnonymousDemo {

	// Main driver method
	public static void main(String[] args)
	{

		// Myclass is hidden inner class of Age interface
		// whose name is not written but an object to it
		// is created.
		Age oj1 = new Age() {
		
			@Override public void getAge()
			{
				// printing age
				System.out.print("Age is " + x);
			}
		};
	
		oj1.getAge();
	}
}
```
