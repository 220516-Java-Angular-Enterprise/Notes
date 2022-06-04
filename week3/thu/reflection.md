# Reflection in Java

Reflection is an API that is used to examine or modify the 
behavior of methods, classes, and interfaces at runtime. 
The required classes for reflection are provided under 
`java.lang.reflect` package which is essential in order to 
understand reflection. So we are illustrating the package 
with visual aids to have a better understanding as follows: 

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20220110121120/javalang.jpg">

* Reflection gives us information about the class to which an 
object belongs and also the methods of that class that can be executed by using the object.


* Through reflection, we can invoke methods at runtime 
irrespective of the access specifier used with them.

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/reflection.png">

## Retrieving Class Objects

### `Object.getClass()`
If an instance of an object is available, then the simplest 
way to get its `Class` is to invoke `Object.getClass()`. 
Of course, this only works for reference types which all 
inherit from `Object`. Some examples follow.

`Class c = "foo".getClass();`

### The `.class` Syntax
If the type is available but there is no instance then it 
is possible to obtain a `Class` by appending `.class` to 
the name of the type. This is also the easiest way to obtain 
the `Class` for a primitive type.

### Class.forName()
If the fully-qualified name of a class is available, 
it is possible to get the corresponding Class using the 
static method `Class.forName()`. This cannot be used for 
primitive types. The syntax for names of array classes 
is described by `Class.getName()`. This syntax is applicable 
to references and primitive types.

`Class c = Class.forName("com.duke.MyLocaleServiceProvider");`

## Methods that Return Classes
There are several Reflection APIs which return classes 
but these may only be accessed if a `Class` has already 
been obtained either directly or indirectly.

### `Class.getSuperclass()`

Returns the super class for the given class.

`Class c = javax.swing.JButton.class.getSuperclass();`

The super class of `javax.swing.JButton` is 
`javax.swing.AbstractButton`.

### `Class.getClasses()`

Returns all the public classes, interfaces, and enums 
that are members of the class including inherited members.

`Class<?>[] c = Character.class.getClasses();`

Character contains two member classes `Character.Subset` 
and `Character.UnicodeBlock`.

### `Class.getDeclaredClasses()`

Returns all the classes, interfaces, and enums that 
are explicitly declared in this class.

`Class<?>[] c = Character.class.getDeclaredClasses();`

Character contains two public member classes 
`Character.Subset` and `Character.UnicodeBlock` and one 
private class `Character.CharacterCache`.


### `Class.getDeclaringClass()`
```
Class.getDeclaringClass()
java.lang.reflect.Field.getDeclaringClass()
java.lang.reflect.Method.getDeclaringClass()
java.lang.reflect.Constructor.getDeclaringClass()
```

Returns the Class in which these members were declared. 
Anonymous Class Declarations will not have a declaring 
class but will have an enclosing class.

```
import java.lang.reflect.Field;

Field f = System.class.getField("out");
Class c = f.getDeclaringClass();

The field out is declared in System.
public class MyClass {
    static Object o = new Object() {
    public void m() {}
    };
    static Class<c> = o.getClass().getEnclosingClass();
}
```
The declaring class of the anonymous class defined by `o` 
is null.

### `Class.getEnclosingClass()`

Returns the immediately enclosing class of the class.

`Class c = Thread.State.class().getEnclosingClass();`

The enclosing class of the enum `Thread.State` is `Thread`.

## Examining Class Modifiers and Types

A class may be declared with one or more modifiers which 
affect its runtime behavior:

* Access modifiers: `public`, `protected`, and `private`
* Modifier requiring override: `abstract`
* Modifier restricting to one instance: `static`
* Modifier prohibiting value modification: `final`
* Modifier forcing strict floating point behavior: `strictfp`
* Annotations

Not all modifiers are allowed on all classes, for example 
an interface cannot be final and an enum cannot be abstract. 
java.lang.reflect.Modifier contains declarations for all 
possible modifiers. It also contains methods which may be 
used to decode the set of modifiers returned by 
`Class.getModifiers()`.

## Discovering Class Members
There are two categories of methods provided in Class 
for accessing fields, methods, and constructors: methods 
which enumerate these members and methods which search for 
particular members. 

Also, there are distinct methods for accessing members 
declared directly on the class versus methods which 
search the superinterfaces and superclasses 
for inherited members. The following tables provide a 
summary of all the member-locating methods and their 
characteristics.

### Class Methods for Locating Fields
| Class API           | 	List of members? | 	Inherited members? | 	Private members? |
|---------------------|-------------------|---------------------|-------------------|
| getDeclaredField()  | 	no               | 	no                 | 	yes              |
| getField()          | 	no               | 	yes	               | no                |
| getDeclaredFields() | 	yes              | 	no                 | 	yes              |
| getFields()         | 	yes              | 	yes                | 	no               |

### Class Methods for Locating Methods

| Class API            | 	List of members? | 	Inherited members? | 	Private members? |
|----------------------|-------------------|---------------------|-------------------|
| getDeclaredMethod()  | 	no               | 	no                 | 	yes              |
| getMethod()          | 	no               | 	yes                | 	no               |
| getDeclaredMethods() | 	yes              | 	no                 | 	yes              |
| getMethods()         | 	yes              | 	yes                | 	no               |

### Class Methods for Locating Constructors

| Class API	                | List of members? | 	Inherited members?	 | Private members? |
|---------------------------|------------------|----------------------|------------------|
| getDeclaredConstructor()  | 	no              | 	N/A                 | 	yes             |
| getConstructor()          | 	no              | 	N/A                 | 	no              |
| getDeclaredConstructors() | 	yes             | 	N/A                 | 	yes             |
| getConstructors()         | 	yes             | 	N/A                 | 	no              |

## Obtaining Names of Method Parameters

You can obtain the names of the formal parameters of any 
method or constructor with the method 

`java.lang.reflect.Executable.getParameters`. 

(The classes Method and Constructor extend the class 
`Executable` and therefore inherit the method 
`Executable.getParameters`.)

## Invoking Methods

Reflection provides a means for invoking methods on a class. 
Typically, this would only be necessary if it is not 
possible to cast an instance of the class to the desired 
type in non-reflective code. 

Methods are invoked with 

`java.lang.reflect.Method.invoke()`.

The first argument is the object instance on which this 
particular method is to be invoked. (If the method is 
`static`, the first argument should be `null`). Subsequent 
arguments are the method's parameters. If the underlying 
method throws an exception, it will be wrapped by a 
`java.lang.reflect.InvocationTargetException`. 
The method's original exception may be retrieved using the 
exception chaining mechanism's 
`InvocationTargetException.getCause()` method.

## Creating New Class Instances

There are two reflective methods for creating instances 
of classes: `java.lang.reflect.Constructor.newInstance()` 
and `Class.newInstance()`. The former is preferred because:

* `Class.newInstance()` can only invoke the zero-argument 
constructor, while `Constructor.newInstance()` may invoke 
any constructor, regardless of the number of parameters.


* `Class.newInstance()` throws any exception thrown by the 
constructor, regardless of whether it is checked or 
unchecked. `Constructor.newInstance()` always wraps the 
thrown exception with an `InvocationTargetException`.


* `Class.newInstance()` requires that the constructor be 
visible; `Constructor.newInstance()` may invoke private 
constructors under certain circumstances.

## Identifying Array Types

Array types may be identified by invoking `Class.isArray()`. 

## Examining Enums
Reflection provides three enum-specific APIs:

| API                                        | Description                                                                            |
|--------------------------------------------|----------------------------------------------------------------------------------------|
| `Class.isEnum()`                           | Indicates whether this class represents an enum type                                   |
| `Class.getEnumConstants()`                 | Retrieves the list of enum constants defined by the enum in the order they're declared |
| `java.lang.reflect.Field.isEnumConstant()` | Indicates whether this field represents an element of an enumerated type               |

## Creating JDK Proxy objects

A proxy class is present in `java.lang` package. A proxy 
class has certain methods which are used for creating 
dynamic proxy classes and instances, and all the classes 
created by those methods act as subclasses for this proxy 
class.

#### Class declaration:
```
public class Proxy
    extends Object
    implements Serializable
```
#### Fields:

`protected InvocationHandler h`

It handles the invocation for this proxy instance.

#### Constructor:

`protected Proxy(InvocationHandler h)`

Constructs a Proxy instance from a subclass which is 
typically a dynamic proxy class. The instance is 
automatically created with the required value of this 
invocation handler `h`.

#### Creating Invocation Handler:

```
// Invocation handler implementation
import java.lang.reflect.InvocationHandler;

class demoInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method,
						Object[] args) throws Throwable
	{
		return null;
	}
}

public class GFG {

	public static void main(String[] args)
	{
		InvocationHandler h = new demoInvocationHandler();
	}
}
```

### Methods

| Method                                                                             | 	Description                                                                                                                                                              |
|------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `getInvocationHandler(Object proxy)`                                               | 	This method returns the invocation handler for the specified proxy instance.                                                                                             |
| `getProxyClass(ClassLoader loader, Class<?>… interfaces)`                          | 	This method returns the java.lang.Class object for a proxy class given a class loader and an array of interfaces.                                                        |
| `isProxyClass(Class<?> cl)`                                                        | 	This method returns true if and only if the specified class was dynamically generated to be a proxy class using the getProxyClass method or the newProxyInstance method. |
| `newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)` | 	This method returns an instance of a proxy class for the specified interfaces that dispatches method invocations to the specified invocation handler.                    |