# Abstraction in Java

**Data Abstraction** is the property by virtue of which only the 
essential details are displayed to the user. The trivial or 
the non-essentials units are not displayed to the user.

**Data Abstraction** may also be defined as the process of 
identifying only the required characteristics of an object 
ignoring the irrelevant details. The properties and behaviours 
of an object differentiate it from other objects of similar 
type and also help in classifying/grouping the objects.

In java, **abstraction** is achieved by **interfaces** and **abstract 
classes**. We can achieve 100% abstraction using interfaces.

## Abstract classes and Abstract methods :

* An abstract class is a class that is declared with an 
abstract keyword.


* An abstract method is a method that is declared without 
implementation.


* An abstract class may or may not have all abstract methods. 
Some of them can be concrete methods


* A method defined abstract must always be redefined in the 
subclass, thus making overriding compulsory OR either make 
the subclass itself abstract.


* Any class that contains one or more abstract methods must 
also be declared with an abstract keyword.


* There can be no object of an abstract class. That is, an 
abstract class can not be directly instantiated with the 
new operator.


* An abstract class can have parameterized constructors and 
the default constructor is always present in an abstract class.

## Interfaces in Java

An **Interface** in Java programming language is defined as an 
abstract type used to specify the behavior of a class. An 
**interface** in Java is a blueprint of a class. A Java **interface** 
contains static constants and abstract methods.

Like a class, an interface can have methods and variables, 
but the methods declared in an interface are by default 
abstract (only method signature, no body).

* Interfaces specify what a class must do and not how. It is the 
blueprint of the class.


* An Interface is about capabilities like a Player may be an 
interface and any class implementing Player must be able to 
(or must implement) move(). So it specifies a set of methods 
that the class has to implement.


* If a class implements an interface and does not provide 
method bodies for all functions specified in the interface, 
then the class must be declared abstract.

### Syntax:
```
interface {

    // declare constant fields
    // declare methods that abstract 
    // by default.   
}
```
To declare an interface, use the `interface` keyword. It is 
used to provide total abstraction. That means all the methods 
in an interface are declared with an empty body and are 
public and all fields are public, static, and final by default. 
A class that `implements` an interface must implement all the 
methods declared in the interface. To implement interface 
use `implements` keyword.


### Why do we use an Interface?
* It is used to achieve total abstraction.


* Since java does not support multiple inheritances in the 
case of class, by using an interface it can achieve multiple 
inheritances.


* It is also used to achieve loose coupling.


* Interfaces are used to implement abstraction. So the 
question arises why use interfaces when we have abstract classes?

The reason is, abstract classes may contain non-final variables, 
whereas variables in the interface are `final`, `public` and `static`.

## Abstract Classes in Java