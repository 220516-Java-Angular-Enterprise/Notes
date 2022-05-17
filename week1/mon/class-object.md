# Class Vs Object

## Class in Java

To develop a program in Java, we make use of objects and classes. While a class in Java is only a logical unit, an
object in Java is both a physical and logical entity.

**What is an object in Java?**

An object is an entity that has a state and exhibit behavior. For example, any real-life entity like a pen, a laptop, a
mobile, a table, a chair, a car, etc. is an object.

**State** tells us how the object looks or what properties it has.
**Behavior** tells us what the object does.

**So what is a Class?**

We know the main component of object-oriented programming is an object. If we want to build a specific type of object,
we need a blueprint. This blueprint will provide us a set of instructions that will help us to build an object.

For example, let’s say we want to build a house. The house here is an object. To build a house we need an initial
blueprint for the house. We cannot go about directly building the house as we please.

This is where class comes into the picture. So to build an object or real-life entity, we will first have a blueprint
that determines the contents and behavior of an object. This is known as a class in object-oriented programming.

So a class can be defined as “a blueprint or a template and it defines the state and behavior of the object”.

### How To Create A Class In Java

The general class syntax of a class definition in Java is:

**<access_modifier>** class **<class_name>** { }

```java
public class Dog {

    /*
     * fields
     * constructors
     * methods
     */

}
```

### Fields

Fields are variables or data of the class. Fields are also called as member variables in Java. We use the terms field
and variable interchangeably.

**Usually, Fields of a class are of two types:**

1) **Class Variables:** Class variables are declared with the word “static” so that they are static variables. This
   means that this type of variable has only one copy per class, irrespective of how many instances or objects are
   present for that class.


2) **Instance Variables:** These are the opposite of class variables. The data members are called instance variables
   because these variables have separate memory allocated for them for each class instance at runtime.

```java
public class Dog {
    /* these are fields or attributes of the class Dog */
    private int age;
    private String breed;
    private String fur;
}
```

### Constructor

Constructors are special methods that are generally used to initialize an instance of a class. Constructors do not have
a return type, they have the same name as the class, and may or may not contain parameters.

```java
public class Dog {
    /* these are fields or attributes of the class Dog */
    private int age;
    private String breed;
    private String fur;

    /* default constructor. We need a constructor to "construct" the Dog class into an object */
    public Dog() {
        /* this can be empty since it's a default constructor */
    }

    /* this constructor is used for setting the attributes/fields during instantiation of the class. */
    public Dog(int age, String breed, String fur) {
        this.age = age;
        this.breed = breed;
        this.fur = fur;
    }
}
```

### Method

A method in a Java class is the function that defines the behavior of the object and its members.

```java
public class Dog {
    /* these are fields or attributes of the class Dog */
    private int age;
    private String breed;
    private String fur;

    /* default constructor. We need a constructor to "construct" the Dog class into an object */
    public Dog() {
        /* this can be empty since it's a default constructor */
    }

    /* this constructor is used for setting the attributes/fields during instantiation of the class. */
    public Dog(int age, String breed, String fur) {
        this.age = age;
        this.breed = breed;
        this.fur = fur;
    }

    /* these are the behaviors aka "methods" of the dog */
    public void bark() {
        System.out.println("Woof!");
    }

    public void shake() {
        System.out.println("Shake shake!");
    }
}
```

<br>

## Object In Java

Now, we have enough knowledge about classes in Java, we can redefine the object in terms of class. So an object is “an
instance of a class”. Thus we create a variable or instance of type class_name and it is termed as an object.

Some points to remember about an object:

- An object is seen as a basic unit of OOP along with the class.
- An object is a runtime unit.
- An object is termed as an instance of a class.
- An object has behavior and state.
- An object takes all the properties and attributes of the class of which it is an instance. But at any point, each
  object has different states or variable values.
- An object is used to represent a real-time entity in software applications.
- A single class can have any number of objects.
- Objects interact with each other by way of invoking methods.

### How To Instantiate An Object

Declaration of the object is also termed as an instantiation of objects in Java. The declaration of an object is the
same as declaring a variable.

```java
public class Main {
    public static void main(String[] args) {
        
        /* creating a dog object */
        Dog mydog = new Dog();
        
        /* with this dog object I'm able to access its attributes and behaviors with the "." operator */
        mydog.bark(); // this will print out "Woof!"
        mydog.shake(); // this will print out "Shake shake!"
    }
}
```
