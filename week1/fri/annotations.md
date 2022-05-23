# Annotations in Java

Annotations are used to provide supplemental information about a program.


* Annotations start with ‘@’.


* Annotations do not change the action of a compiled program.


* Annotations help to associate metadata (information) to the 
program elements i.e. instance variables, constructors, methods, 
classes, etc.


* Annotations are not pure comments as they can change the way 
a program is treated by the compiler. See below code for example.


* Annotations basically are used to provide additional information, 
so could be an alternative to XML and Java marker interfaces.

## Predefined/ Standard Annotations

Java popularly defines seven built-in annotations as we have 
seen up in the hierarchy diagram.

Four are imported from java.lang.annotation: 
**@Retention**, **@Documented**, **@Target**, and **@Inherited**.
Three are included in java.lang: **@Deprecated**, **@Override** 
and **@SuppressWarnings**

## User-defined Annotations

User-defined annotations can be used to annotate 
program elements, i.e. variables, constructors, methods, 
etc. These annotations can be applied just before the 
declaration of an element (constructor, method, classes, etc).

### Syntax: Declaration
```
[Access Specifier] @interface<AnnotationName>
{         
DataType <Method Name>() [default value];
}
```
Do keep these certain points as rules for custom annotations 
before implementing user-defined annotations.

* AnnotationName is an interface.

* The parameter should not be associated with method 
declarations and throws clause should not be used with method 
declaration.

* Parameters will not have a null value but can have a default value.

* **default** value is optional.

* The return type of method should be either primitive, 
enum, string, class name, or array of primitive, enum, 
string, or class name type.