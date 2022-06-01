# Method References in Java

In Java 8 we can use the method as if they were objects or 
primitive values, and we can treat them as a variable. The 
example shows the function as a variable in java:
```
// This square function is a variable getSquare.
Function<Integer, Integer> getSquare = i -> i * i;
SomeFunction(a, b, getSquare);
// Pass function as a argument to other function easily
```
Sometimes, a lambda expression only calls an existing method. 
In those cases, it looks clear to refer to the existing 
method by name. The method references can do this, they are 
compact, easy-to-read as compared to lambda expressions. 
A method reference is the shorthand syntax for a lambda 
expression that contains just one method call.

## Syntax: Method Reference

### A. To refer to a method in an object

`Object :: methodName`
### B. To print all elements in a list

Following is an illustration of a lambda expression that 
just calls a single method in its entire execution:

`list.forEach(s -> System.out.println(s));`  
### C. Shorthand to print all elements in a list

To make the code clear and compact, In the above example, 
one can turn lambda expression into a method reference:

`list.forEach(System.out::println);` 

The method references can only be used to replace a single 
method of the lambda expression. 

A code is more clear and short if one uses a lambda 
expression rather than using an anonymous class and 
one can use method reference rather than using a single 
function lambda expression to achieve the same. 

In general, one doesn’t have to pass arguments to 
method references.

The following example is about performing some operations
on elements in the list and adding them. The operation to 
be performed on elements is a function argument and the 
caller can pass accordingly. 

```
ist<Integer> list = new ArrayList<>();
// Add some element to list
...
// Using an anonymous class
transformAndAdd(list, new Function<Integer, Integer>() {
    public Integer apply(Integer i) {
        // The method
        return OpsUtil.doHalf(i);
    }
});

// Using a lambda expression
tranformAndAdd(list, i -> OpsUtil.doHalf(i));

// Using a method reference
tranformAndAdd(list, OpsUtil::doHalf);

```

## Types of Method References

There are four type method references that are as follows:

### 1. Static Method Reference.
If a Lambda expression is like:

```
// If a lambda expression just call a static method of a class
(args) -> Class.staticMethod(args)
```

Then method reference is like:

```
// Shorthand if a lambda expression just call a static method of a class
Class::staticMethod
```

### 2. Instance Method Reference of a particular object.

If a Lambda expression is like:

```
// If a lambda expression just call a default method of an object

(args) -> obj.instanceMethod(args)
```

Then method reference is like:

```
// Shorthand if a lambda expression just call a default method of an object

obj::instanceMethod
```

### 3. Instance Method Reference of an arbitrary object of a particular type.
If a Lambda expression is like:

```
// If a lambda expression just call an instance method of a  ObjectType

(obj, args) -> obj.instanceMethod(args)
```

Then method reference is like:

```
// Shorthand if a lambda expression just call an instance method of a ObjectType

ObjectType::instanceMethod
```

### 4. Constructor Reference.
If a Lambda expression is like:

```
// If a lambda expression just create an object
(args) -> new ClassName(args)
```

Then method reference is like:

```
// Shorthand if a lambda expression just create an object
ClassName::new 
```