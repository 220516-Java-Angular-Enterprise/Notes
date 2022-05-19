### Java:Methods 
We create object behavior using "methods".
Methods are repeatable, modular blocks of code used to accomplish specific tasks.
We have the ability to define our own methods that will take input do something with it
and return with an output we want.

Method decomposition: We can use methods to break down a large problem into smaller,more manageable problems.

Methods are reusable.

Procedural abstraction: Knowing what a method does but not how it accomplishes it.

# Defining Methods
Example:
Say we want to define a checkBalance() method for the Saving Account it would look like:
public void checkBalance (){
System.out.println("Hello!);
System.out.println("Your balance is" +balance);
}

public void checkBalance()= method declaration
public means that other classes can access this method
the "void" keyword means that there is no specific output from the method. 
checkBalance() is the name of the method.

EVERY method has its own unique method signature = method's name + parameter type.
Anything we can do in our main() method,we can do in other methods!

checkBalance() - a non-static method because its signature does not contain the keyword "static" like the main method does.

# Calling Methods
A non-static method allows us to use the class on an object of that class.
In order to have our methods get executed we must call the method on the object we created.

Example:
class Car{
// declare fields inside the class 
String color;

// constructor method with a parameter
public Car(String carColor){

//parameter value assigned to the field
color = carColor;
}

//Method 1
public void startEngine(){
System.out.println("Starting the car!");
System.out.println("Vroom!");
}

public static void main (String[] args){
Car myFastCar = new Car("red");
// Call a method on an object

myFastCar.startEngine();
System.out.println("That was one fast car!");
}
}
The method call:
myFastCar.startEngine();

We reference our object : myFastCar
Then we use the dot operator (.)
This calls the method: startEngine()

This prints:
Starting the car!
Vroom!
That was a fast car!

# Scope
A method is a task that an object of a class performs.

We mark the domain of this task using curly braces
Everything inside the curly braces is part of the task
The domain is--- scope of a method

We can't access variable inside a method in code that is outside the scope of that method.

Example:

class Car{
String color;
int milesDriven;

public Car(String carColor){
color= carColor;
milesDriven = 0;
}

public void drive(){
String message ="Miles driven:"+ milesDriven;
System.out.println(message);
}

public static void main(String[] args){
Car myFastCar = new Car ("red");
myFastCar.drive();
}
}

The variable message--- which is declared and initialized inside of drive. 
Cannot be used inside of main()!
It only exists within the scope of the drive() method.

milesDriven which is declared at the top of the class can be used inside all methods in the class. 

# Adding Parameters 
 What if we had some information in one method that we needed to pass into another method??
 
We can customize all other methods to accept parameters. 

Example:

class Car{

String color;

public Car(String carColor){
color = carColor;
}

public void startRadio (double stationNum, String stationName){
System.out.println("Turning on the radio to")+ stationNum + ","+ stationName + "!");
System.out.println("Enjoy");
}

public static void main(String[] args){
Car myCar = new Car("red");
myCar.startRadio(103.7,"Mediation Station");
}
}

Method signature includes the method name as well as the parameter types of the method.
The method signature in our example: startRadio (double,String).
The double argument is : 103.7, "Mediation Station"
output: "Turning on the radio to 103.7, Mediation Station! Enjoy!"

# Method Overloading
Our Java programs can contain multiple methods with the same name as long as each method's parameter list is unique.

Example:
//Method 1
public void startRadio (double stationNum,String stationName){
System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
System.out.println("Enjoy!");
}

// Method 2
public void startRadio (double stationNum) {
System.out.println("Turning on the radio to " + stationNum+ "!");
}

public static void main (String[] args){
Car myCar = new Car("red");
//Calls the first startRadio() method
myCar.startRadio(103.7, "Meditation Station");

//Calls the second startRadio() method
myCar.startRadio (98.2);
}

## Reassigning Instance Fields

Two of the methods we will need for our Savings Account we will need depositing and withdrawing:
Example:

public class SavingsAccount{
double balance;
public SavingsAccount (double startingBalance){
balance = startingBalance;
}

public void deposit(double amountToDeposit){
//Add amountToDeposit to the balance
}

public void withdraw(double amounttoWithdraw){
//Subtract amountToWithdraw from the balance
}

public static void main(String[]args){

}
}

These methods will change the value of the variable balance.
We can reassign the balance to be a new value by using our assignment operator,=.

Example:

public void deposit(double amountToDeposit){
double updatedBalance = balance + amountToDeposit;
balance = updatedBalance;
}
When we call deposit(), it should change the value of the instance field balance:

public static void main(String[] args){
SavingsAccount myAccount = new SavingsAccount(2000);
System.out.println(myAccount.balance);
myAccount.deposit(100);
System.out.println(myAccount.balance);
}

The code will print 2000, the initial value of myAccount.balance.
Then it will print 2100 which is the value of myAccount.balance. 
After the deposit() method has run

Changing instance fields is how we change the state of an object and make our object flexible and realistic. 

# Returns
Variables can only exist in the scope that they were declared in.
We can use a value outside the method it was created in if we "return" it from the method

Example:

public int numberOfTires(){
int tires = 4;
// return statement
return tires;
}

This method, called numberOfTires(), returns 4.
Once the return statement is executed, the compiler exits the function.
Any code that exists after the return statement in a function is ignored.

In the example we replaced void with int to signify the return type is an int.

The void keyword (means "completely empty")

A non-void method returns a value when it is called
The return value type MUST match the return type of the method. 
If the return expression is compatible with the return type a copy of that value gets returned in a process known 
as return by value. 

Non-void methods can be used as either a variable or as part of an expression

Example:
public static void main(String[] args){
Car myCar = new Car("red");
int numTires = myCar.numberOfTires();
}
# How do we Return an Object?
Returning objects work a little differently than returning a primitive value.
When we return a primitive value a copy of the value is returned.
When we return an object we return a REFERENCE to the object instead of a copy of it.

Example:
class CarLot{
public CarLot(Car givenCar){
carInLot= givenCar;
}

 public Car returnACar(){
 // return Car object
 return carInLot;
 }
 
public static void main(String){
Car myCar = new Car("red", 70);
System.out.println(myCar);
CarLot myCarLot = new CarLot(myCar);
System.out.println(myCarLot.returnACar());
}
}
This code outputs the same memory address because myCar and carInLot
have the same reference value:

Car@2f333739
Car@2f333739

## The toString() Method
When we define a toString()method for a class, we can return a String that will print when we print the object:

Example:
class Car{

String color;

public Car(String carColor){
color = carColor;
}

public static void main(String[] args){
Car myCar = new Car("red");
System.out.println(myCar);
}

public String toString(){
return "This is a" + color + "car!";
//Prints : This is a red car!


