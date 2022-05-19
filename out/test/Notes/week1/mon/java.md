# Introduction to Java

<img src="https://camo.githubusercontent.com/67c33b70efaa565d82d96e2013cd232a6fd06cabc8c24df39d150ad2ffab6db8/68747470733a2f2f6c6f676f732d646f776e6c6f61642e636f6d2f77702d636f6e74656e742f75706c6f6164732f323031362f31302f4a6176615f6c6f676f5f69636f6e2e706e67">

Java is a programming language and a platform.

Java is a high level, robust, object-oriented and secure programming language.

Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime
environment (JRE) and API, it is called a platform.

## Types of Java Applications

There are mainly 4 types of applications that can be created using Java programming:

- **Standalone Application**

Standalone applications are also known as desktop applications or window-based applications. These are traditional
software that we need to install on every machine. Examples of standalone application are Media player, antivirus, etc.
AWT and Swing are used in Java for creating standalone applications.

- **Web Application**

An application that runs on the server side and creates a dynamic page is called a web application. Currently, Servlet,
JSP, Struts, Spring, Hibernate, JSF, etc. technologies are used for creating web applications in Java.

- **Enterprise Application**

An application that is distributed in nature, such as banking applications, etc. is called enterprise application. It
has advantages of the high-level security, load balancing, and clustering. In Java, EJB is used for creating enterprise
applications.

- **Mobile Application**

An application which is created for mobile devices is called a mobile application. Currently, Android and Java ME are
used for creating mobile applications.

## Java Platforms / Editions

There are 4 platforms or editions of Java:

- **Java SE (Java Standard Edition)**

It is a Java programming platform. It includes Java programming APIs such as java.lang, java.io, java.net, java.util,
java.sql, java.math etc. It includes core topics like OOPs, String, Regex, Exception, Inner classes, Multithreading, I/O
Stream, Networking, AWT, Swing, Reflection, Collection, etc.

- **Java EE (Java Enterprise Edition)**

It is an enterprise platform which is mainly used to develop web and enterprise applications. It is built on the top of
the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, JPA, etc.

- **Java ME (Java Micro Edition)**

It is a micro platform which is mainly used to develop mobile applications.

- **JavaFX**

It is used to develop rich internet applications. It uses a light-weight user interface API.

## Object-Oriented Programming (OOP)

Object-oriented programming (OOP) is a computer programming model that organizes software design around data, or
objects, rather than functions and logic. An object can be defined as a data field that has unique attributes and
behavior.

OOP focuses on the objects that developers want to manipulate rather than the logic required to manipulate them. This
approach to programming is well-suited for programs that are large, complex and actively updated or maintained. This
includes programs for manufacturing and design, as well as mobile applications

# JDK, JRE, JVM

## Java Development Kit

It's the development kit that you need to create Java program. Basically it's the tools that will take your Java source
code, the code that you write, and convert them into a format that the JRE and the JVM, can execute. So it includes
things like debuggers for testing and for finding errors in your code but also the Java Compiler for compiling that
code.

## Java Runtime Environment

The JRE is used to run your Java program. So basically it includes the libraries, set of different libraries that come
with Java, the various functionality that you can basically execute in your Java code but also Java Launcher. It also
includes the Java Virtual Machine.

## Java Virtual Machine

The Java Virtual Machine is part of the Java Runtime Environment, and it is effectively an abstract computing machine.
The JVM converts bytecode to machine code.

# First Java Program - Hello World!

`public static void main(String[] args)` is the most important Java method. When you start learning java programming,
this is the first method you encounter. Java main method is the entry point of any java program.

## Public

This is the access modifier of the main method. It has to be public so that java runtime can execute this method. So it
means that the main method has to be public. Let’s see what happens if we define the main method as non-public.

## Static

When a member is declared static, it can be accessed before any objects of its class are created.

# Methods and parameters

A parameter is a value that you can pass to a method in Java. Then the method can use the parameter as though it were a
local variable initialized with the value of the variable passed to it by the calling method.

The guessing-game application has a method named getRandomNumber that returns a random number between 1 and 10:

```
public int getRandomNumber() { 
    return (int)(Math.random() * 10) + 1; 
}
```