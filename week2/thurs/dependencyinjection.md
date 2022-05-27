# Dependency Injection

When class A uses some functionality of class B, then its said that 
class A has a dependency of class B.

So, transferring the task of creating the object to someone else and directly 
using the dependency is called dependency injection.

## Why should I use Dependency Injection?
Let’s say we have a car class which contains various objects such as 
wheels, engine, etc.

Here the car class is responsible for creating all the dependency objects. 
Now, what if we decide to ditch MRFWheels in the future and want to use 
Yokohama Wheels?

We will need to recreate the car object with a new Yokohama dependency. 
But when using dependency injection (DI), we can change the Wheels at 
runtime (because dependencies can be injected at runtime rather than at 
compile time).

You can think of DI as the middleman in our code who does all the work 
of creating the preferred wheels object and providing it to the Car class.

It makes our Car class independent of creating the objects of Wheels, 
Battery, etc.

There are basically three types of dependency injection:

* **Constructor Injection**: the dependencies are provided through a class constructor.
* **Setter Injection**: the client exposes a setter method that the injector 
uses to inject the dependency.
* **Interface Injection**: the dependency provides an injector method that will 
inject the dependency into any client passed to it. Clients must implement 
an interface that exposes a setter method that accepts the dependency.