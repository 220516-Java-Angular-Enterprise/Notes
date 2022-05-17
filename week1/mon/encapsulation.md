# Encapsulation

By definition, **encapsulation** describes the idea of bundling 
data and methods that work on that data within one unit, like 
a class in Java. This concept is also often used to hide the 
internal representation, or state of an object from the outside. 
This is called information hiding.

The general idea of this mechanism is simple. For example, 
you have an attribute that is not visible from the outside of an 
object. You bundle it with methods that provide read (getter methods) 
or write (setter methods) access. Encapsulation allows you to hide specific 
information and control access to the internal state of the object.

## Access Modifiers

Java supports four access modifiers that you can use to define 
the visibility of classes, methods and attributes. Each modifier 
specifies a different level of accessibility, and you can only use 
one modifier per class, method or attribute. As a rule of thumb, 
you should always use the most restrictive modifier that still 
allows you to implement your business logic.

Starting from the most to the least restrictive, these modifiers are:

* private

* no modifier (default)

* protected

* public

Let’s take a closer look at each of these modifiers and discuss 
when you should use them.

### Private
The most restrictive and most commonly used access modifier, 
the private modifier makes an attribute or method only accessible 
within the same class. Subclasses or any other classes within the 
same or a different package can’t access this attribute or method.

For all attributes and internal methods that shouldn’t be called 
from external classes, choose the private modifier by default. 
You might need to make an exception to this rule when you’re 
using inheritance. Also, exempt some of the subclasses that need 
direct access to an attribute or internal method. In that case, 
you should use the protected modifier instead of private.

### No Modifier (default)
No modifiers mean you can access attributes or methods within 
your class and from all classes within the same package. That’s 
why it’s often called package-private.

### Protected
Attributes and methods with the access modifier protected 
can be accessed within your class, by all classes within the 
same package and by all subclasses within the same or other packages.

The protected modifier gets mostly used for internal methods that 
need to be called or overridden by subclasses. You can also use the 
protected modifier to allow subclasses to access internal attributes 
of a superclass directly.

### Public
This is the least restrictive access modifier. Methods and attributes 
that use the public modifier can be accessed within your current 
class and by all other classes.

Public methods and attributes become part of the public API of 
your class and of any component in which you include them. That 
is almost never a good idea for any attribute, so you should think 
twice before using this modifier on a method.

### Accessibility Matrix
Here you can see an overview of the different access modifiers 
and the accessibility of the attributes or methods.

<img src=https://stackify.com/wp-content/uploads/2017/11/word-image-20.png>