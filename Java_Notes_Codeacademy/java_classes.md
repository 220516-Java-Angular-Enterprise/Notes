### Classes 
All programs require one or more classes that act as a model for the world. 
Object-Oriented Programming is programs built around objects and their interactions
An object contains state and behavior. 

Classes are blueprints for objects. 
Blueprints are the general structure.

An instance is the thing itself. 

## Classes:Syntax
The fundamental concept of object-oriented programming is the class.

A class is the set of instructions that describe how an instance can behave and what information it contains.

Java has pre-defined classes such as "System".... 

## Classes: Constructors

In order to create an object(an instance of a class), we need a constructor method.
The constructor is defined within the class. 

Example:
public class Car{
// Constructor method
public Car(){
//instructions for creating a Car instance 
}

public static void main (String[] args) {
// body of main method
}
}

To create an instance we have to CALL the constructor within the main().
Example continue:
public class Car{
public Car() {
//instructions for creating a Car instance 
}

public static void main(String[] args){
//Invoke the constructor
Car ferrari = new Car();
}
}
Reference data types are values of variables a reference to an instance's memory address. 
During its declaration the class name is used as the variable's type
If we assign null to an object it would have a void reference.

Example:
Car thunderBird = new Car();
System.out.println(thunderBird);//
Prints: Car@76ed5528

thunderBird = null;// change value to null
System.out.println(thunderBird);//
Prints: null

If we use a null reference to call a method or access an instance variable.... we will receive a "NullPointerException"error.

Example:
public class Store{
// new method: constructor!
public Store(){
System.out.println("I am inside the constructor method.);
}
//main method is where we create instances!
public static void main (String[] args){

System.out.println("Start of the main method.");

//create the instance below
Store lemonadeStand = new Store();
//print the instance below

System.out.println(lemonadeStand);
}
}
## Classes: Instance Fields
In the last exercise we ended up printing an instance of "Store".
It looked something like "Store@6bc7c054"

The first part,"Store", refers to the class 
The second part,"@6bc7c054" refers to the instance's location in the computer's memory.

We don't care about the memory location but our instances have no other characteristics!!!
When an object is created the constructor sets the initial state of the object. 

The "state" is made up of associated data that represents the characteristics of an object.
We add data to an object by introducing "instance variables" or "instance fields".

We want Car instances of different colors 
We declare a "String color" instance field.
"Instance variables" are described as a "has-a" relationship with the object.

Example:
A "Car" "has-a" color.

Instance variables are the nouns and adjectives associated with an object.

Example:
public class Car{
/* 
declare fields inside the class by specifying the type 
and name
*/
String color;

public Car() {
/*
instance fields available in scope of 
constructor method
*/
}

public static void main (String[] args){
// body of main method
}
}

The declaration is "within" the class and the instance variable will be available for assignment inside the constructor.

Fields are a type of state each instance will possess. 
Ex.)
One instance may have "red" as its color
Another instance may have "blue" as its color.

## Classes :Constructor Parameters 
 
In order to create objects with dynamic, individual states, we'll use a combination of constructor method and instance
fields.

To assign a value to an instance variable, we need to alter our constructor method to include parameters so that it can 
access the data we want to assign to an instance. 

Example:
public class Car{
String color; 
//constructor method with a parameter 
public Car(String carColor){
// parameter value assigned to the field 
color = carColor;
}
public static void main(String[]args){
//program tasks
}
}

The String value gets passed into Car(), it is assigned to the parameter carColor. 
Inside the constructor, "carColor" will be assigned as the value to the instance variable "color".

Our method also has a ^signature which defines the name and parameters of the method.
The ^signature is "Car(String carColor)"


There are two types of parameters: formal and actual.

A formal parameter specifies the type and name of data that can be passed into a method.
In the example "String car Color"- is a formal parameter.
"carColor" will represent whatever "String" value is passed into the constructor.

In Java, because of "constructor overloading" , a class can have multiple constructors as long as they have different 
parameter values .

The ^signature is useful in that it helps the compiler differentiate between different methods. 
 
Example:
public class Car{
String color;
int mpg;
boolean isElectric;

//constructor 1
public Car (String carColor, int milesPerGallon){
color = carColor;
mpg = milesPerGallon;
}

//constructor 2
public Car (boolean electricCar, int milesPerGallon){
isElectric= electricCar;
mpg= milesPerGallon;
}
}

When we initialize an object, the compiler will know which constructor to use because of the values we pass into it 
Ex.)
" Car myCar = new Car(true, 40)" will be created by the second constructor- the arguments match the type and the order
of the second constructor's ^signature.

If we don't define a constructor--- the Java compiler will generate a default constructor
Contains no arguments and assigns the object default values. 
Default values can be created by assigning values to the instance fields during the declaration:

Example:
public class Car{
String color = "red";
boolean isElectric = false ;
int cupHolders = 4;

public static void main (String[] args){
Car myCar = new Car();
System.out.println(myCar.color); // Prints:
red 
}
}

Example 2:
public class Store {
// instance fields 
String productType;

// constructor method
public Store(String product){
productType = product;
}

// main method 
public static void main (String[] args){

}
}
 
In this example we added the String parameter "product" to the"Store()" constructor.

Inside the constructor we put the instance variable productType equal to the product parameter. 

## Classes:Assigning Values to Instance Fields 
Now that our constructor has a parameter... we must pass values into the method call.
These values are referred to as "argument"...once they are passed in .. they will be used to give the instance fields
initial value. 

Example:
public class Car{
String color;

public Car(String carColor){
// assign parameter value to instance field
color= carColor;
}
public static void main (String[]args){
// parameter value supplied when calling constructor
Car ferrari = new Car("red");
}
}

Our constructor method call: "new Car("red");"
The type of the value given must match the type declared by the parameter. 

The constructor the parameter carColor refers to the value passed in during the invocation:
"red". 
This value is assigned to the instance field "color".

"color" has already been declared so we don't specify the type during assignment.
The object, ferrari, holds the state of color as an instance field referencing the value "red".

We access the value of this field with the dot operator (.)

Example:
/*
accessing a field:
objectName.fieldName
*/

ferrari.color;
//"red"

An 'actual parameter', or argument, refers to the value being passed during a method call.

'Call by Value' is the process of calling a method with an argument value.

## Classes: Multiple Fields
Objects are not limited to a single instance field.
We can declare as many fields as are necessary for the requirements of our program. 

Example:
public class Car{
String color;
//new fields!
boolean isRunning;
int velocity;

//new parameters that correspond to the new fields
public Car(String carColor, boolean carRunning,int milesPerHour){
color =carColor;
// assign new parameters to the new fields
isRunning=carRunning;
velocity= milesPerHour;
}

public static void main(String[] args){
//new values passed into the method call
Car ferrari = new Car ("red", true,27);
Car renault = new Car ("blue", false,70);

System.out.println(renault.isRunning);
//false
System.out.println(ferrari.velocity);
//27

// values match types, no error
Car honda = new Car ("green", false,0);

//values do not match types,error!
Car junker = new Car(true, 42, "brown");