# Generics in Java

**Generics** means parameterized types. The idea is to allow type 
(Integer, String, … etc., and user-defined types) to be a 
parameter to methods, classes, and interfaces. Using **Generics**, 
it is possible to create classes that work with different data 
types. An entity such as class, interface, or method that 
operates on a parameterized type is a generic entity.

## Generic Class
```
// To create an instance of generic class
BaseType <Type> obj = new BaseType <Type>()
```

```
// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test<T> {
// An object of type T is declared
T obj;
Test(T obj) { this.obj = obj; } // constructor
public T getObject() { return this.obj; }
}
```

## Generic Functions

We can also write generic functions that can be called with 
different types of arguments based on the type of arguments 
passed to the generic method. The compiler handles each method.
```
// Java program to show working of user defined
// Generic functions

class Test {
// A Generic method example
static <T> void genericDisplay(T element)
{
System.out.println(element.getClass().getName()
+ " = " + element);
}
```

## Advantages of Generics

Programs that use Generics has got many benefits over 
non-generic code.

### 1. Code Reuse:
We can write a method/class/interface once 
and use it for any type we want.

### 2. Type Safety: 
Generics make errors to appear compile time than at runtime 
(It’s always better to know problems in your code at compile 
time rather than making your code fail at run time).