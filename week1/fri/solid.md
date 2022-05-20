# Object-Oriented Programming Principles

**SOLID** is an acronym used to refer to a group of five important principles 
followed in software development. This principle is an acronym of the five 
principles which are given below…

* Single Responsibility Principle (SRP)
* Open/Closed Principle
* Liskov’s Substitution Principle (LSP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

## Single Responsibility Principle

When we design our classes, we need to ensure that our class is 
responsible only for 1 task or functionality and when there is a change in that 
task/functionality, only then, that class should change.

## Open/Closed Principle

This principle states that software entities like class, 
modules, functions, etc.; should be able to extend a class 
behavior without modifying it. This principle separates the 
existing code from modified mode to provide better stability, 
maintainability and minimizes the changes in the code. In a 
nutshell, the developer must need to change only a specific 
part of the code (a class or a function) every time a 
requirement changes.

## Liskov’s Substitution Principle

The principle defines that objects of a superclass shall 
be replaceable with objects of its subclasses without breaking 
the application. That requires the objects of your subclasses 
to behave in the same way as the objects of your superclass.

An overridden method of a subclass needs to accept the 
same input parameter values as the method of the superclass. 
That means you can implement less restrictive validation rules, 
but you are not allowed to enforce stricter ones in your 
subclass. Otherwise, any code that calls this method on an 
object of the superclass might cause an exception, if it gets 
called with an object of the subclass.

Similar rules apply to the return value of the method. 
The return value of a method of the subclass needs to 
comply with the same rules as the return value of the 
method of the superclass. You can only decide to apply 
even stricter rules by returning a specific subclass of 
the defined return value, or by returning a subset of 
the valid return values of the superclass.

## Interface Segregation Principle

This principle was first defined by Robert C. Martin as: 
“Clients should not be forced to depend upon interfaces that 
they do not use“.

The goal of this principle is to reduce the side effects 
of using larger interfaces by breaking application interfaces 
into smaller ones. It's similar to the Single Responsibility 
Principle, where each class or interface serves a single purpose.

Precise application design and correct abstraction is the 
key behind the Interface Segregation Principle. Though it'll 
take more time and effort in the design phase of an application 
and might increase the code complexity, in the end, we get a 
flexible code.

## DRY (Don't Repeat Yourself) Principle

DRY is simply an approach, or we can say a different
perceptive to programmers. DRY stands for Don’t Repeat
Yourself. In Java, it means don’t write the same code repeatedly.
Suppose you are having the same code at many places in your
program, then It is known as DRY, You are repeating the same
code repeatedly at different places. Hence, the solution is
obtained using the DRY concept by placing the methods in
place of all repeated codes and define the code in one method.
So By calling methods, we will reach the principle DRY.