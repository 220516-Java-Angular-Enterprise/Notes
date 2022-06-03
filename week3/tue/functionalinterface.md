# Functional Interfaces in Java

A **functional interface** is an interface that contains only 
one abstract method. They can have only one functionality 
to exhibit. From Java 8 onwards, lambda expressions can be 
used to represent the instance of a functional interface. 
A functional interface can have any number of default 
methods. `Runnable`, `ActionListener`, `Comparable` are some 
of the examples of functional interfaces. 

Functional Interface is additionally recognized as Single 
Abstract Method Interfaces. In short, they are also known 
as SAM interfaces. Functional interfaces in Java are the 
new feature that provides users with the approach of 
fundamental programming. 

Functional interfaces are included in Java SE 8 with 
Lambda expressions and Method references in order to make 
code more readable, clean, and straightforward. Functional 
interfaces are interfaces that ensure that they include 
precisely only one abstract method. 

Functional interfaces are used and executed by representing 
the interface with annotation called `@FunctionalInterface`. 
As described earlier, functional interfaces can contain 
only one abstract method. However, they can include any 
quantity of default and static methods.

In Functional interfaces, there is no need to use the 
abstract keyword as it is optional to use the abstract 
keyword because, by default, the method defined inside 
the interface is abstract only. We can also call Lambda 
expressions as the instance of functional interface.

```
// Java program to demonstrate functional interface

class Test {
	public static void main(String args[])
	{
		// create anonymous inner class object
		new Thread(new Runnable() {
			@Override public void run()
			{
				System.out.println("New thread created");
			}
		}).start();
	}
}

```
Java 8 onwards, we can assign lambda expression to its 
functional interface object like this: 

```
// Java program to demonstrate Implementation of
// functional interface using lambda expressions

class Test {
	public static void main(String args[])
	{

		// lambda expression to create the object
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();
	}
}

```

## @FunctionalInterface Annotation
`@FunctionalInterface` annotation is used to ensure that 
the functional interface can’t have more than one abstract 
method. In case more than one abstract methods are present, 
the compiler flags an ‘Unexpected @FunctionalInterface 
annotation’ message. However, it is not mandatory to use 
this annotation.

## Some Built-in Java Functional Interfaces
Since Java SE 1.8 onwards, there are many interfaces that 
are converted into functional interface. All these 
interfaces are annotated with @FunctionalInterface. 
These interfaces are as follows –

* Runnable –> This interface only contains the run() method.
* Comparable –> This interface only contains the compareTo() method.
* ActionListener –> This interface only contains the actionPerformed() method.
* Callable –> This interface only contains the call() method.

## Java SE 8 Has Four Main Kinds of Functional Interfaces

### 1. `Consumer`
The `Consumer` interface of the functional interface is the 
one that accepts only one argument or a gentrified 
argument. The consumer interface has no return value. 
It returns nothing. There are also functional variants 
of the `Consumer` — `DoubleConsumer`, `IntConsumer`, and 
`LongConsumer`. These variants accept primitive values 
as arguments.

Other than these variants, there is also one more variant 
of the `Consumer` interface known as `Bi-Consumer`.

#### `Bi-Consumer` 
`Bi-Consumer` is the most exciting variant of the 
Consumer interface. The consumer interface takes only 
one argument, but on the other side, the `Bi-Consumer` 
interface takes two arguments. Both, `Consumer` and 
`Bi-Consumer` have no return value. It also returns 
noting just like the `Consumer` interface. It is used in 
iterating through the entries of the map.

**Syntax / Prototype of Consumer Functional Interface –**

`Consumer<Integer> consumer = (value) -> System.out.println(value);`

This implementation of the Java `Consumer` functional 
interface prints the value passed as a parameter to the 
print statement. This implementation uses the Lambda 
function of Java.

### 2. `Predicate`
In scientific logic, a function that accepts an 
argument and, in return, generates a boolean value 
as an answer is known as a predicate. Similarly, in 
the java programming language, a predicate functional 
interface of java is a type of function which accepts a 
single value or argument and does some sort of processing 
on it, and returns a boolean (True/ False) answer. 

The implementation of the `Predicate` functional interface 
also encapsulates the logic of filtering (a process that 
is used to filter stream components on the base of a 
provided predicate) in Java.

Just like the `Consumer` functional interface, `Predicate` 
functional interface also has some extensions. 
These are `IntPredicate`, `DoublePredicate`, and `LongPredicate`. 
These types of predicate functional interfaces accept 
only primitive data types or values as arguments.

#### `Bi-Predicate` 
`Bi-Predicate` is also an extension of the Predicate 
functional interface, which, instead of one, takes 
two arguments, does some processing, and returns the 
boolean value.

**Syntax of Predicate Functional Interface –**
```
public interface Predicate<T> {

    boolean test(T t);

}
```
The predicate functional interface can also be implemented 
using a class. The syntax for the implementation of 
predicate functional interface using a class is given below –

```
public class CheckForNull implements Predicate {

    @Override
    public boolean test(Object o) {
 
        return o != null;
 
    }
}
```

The Java predicate functional interface can also be 
implemented using Lambda expressions. The example of 
implementation of Predicate functional interface is 
given below –
```
Predicate predicate = (value) -> value != null;
```

This implementation of functional interfaces in Java 
using Java Lambda expressions is more manageable and 
effective than the one implemented using a class as 
both the implementations are doing the same work, i.e., 
returning the same output.

### 3. `Function`  
A function is a type of functional interface in Java 
that receives only a single argument and returns a 
value after the required processing. There are many 
versions of Function interfaces because a primitive 
type can’t imply a general type argument, so we need 
these versions of function interfaces. 

Many versions of the function interfaces are instrumental 
and are commonly used in primitive types like double, 
int, long. The different sequences of these primitive 
types are also used in the argument.

These versions are:

#### `Bi-Function` 
The `Bi-Function` is substantially related to 
a `Function`. Besides, it takes two arguments, whereas 
Function accepts one argument.

**The prototype and syntax of Bi-Function is given below –**

```
@FunctionalInterface
public interface BiFunction<T, U, R> 
{
 
   R apply(T t, U u);
    .......
 
}
```
In the above code of interface, T and U are the inputs, and 
there is only one output that is R. 

#### Unary Operator and Binary Operator

There are also two other functional interfaces which are 
named as Unary Operator and Binary Operator. They both 
extend the `Function` and `Bi-Function`, respectively. 
In simple words, Unary Operator `extends Function`, and 
Binary Operator `extends Bi-Function`. 

1. **Unary Operator**

```
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, U> 
{
    ……...
}

```

3. **Binary Operator**

```
@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, U, R> 
{
    ……...
}
```

We can understand front the above example that the Unary 
Operator accepts only one argument and returns a single 
argument only. Still, in Unary Operator both the input 
and output values must be identical and of the same type.

On the other way, Binary Operator takes two values and 
returns one value comparable to `Bi-Function` but similarly 
like Unary Operator, the input and output value type must 
be identical and of the same type.

### 4. `Supplier`
The `Supplier` functional interface is also a type of 
functional interface that does not take any input or 
argument and yet returns a single output. 

This type of functional interface is generally used in the lazy 
generation of values. `Supplier` functional interfaces are 
also used for defining the logic for the generation of any 
sequence. For example – The logic behind the Fibonacci 
Series can be generated with the help of the `Stream.generate` 
method, which is implemented by the `Supplier` functional 
Interface.

The different extensions of the `Supplier` functional 
interface hold many other supplier functions like 
`BooleanSupplier`, `DoubleSupplier`, `LongSupplier`, and 
`IntSupplier`. The return type of all these further 
specializations is their corresponding primitives only. 

```
@FunctionalInterface
public interface Supplier<T>{
 
// gets a result
………….
 
// returns the specific result
…………
 
T.get();
 
}
```



