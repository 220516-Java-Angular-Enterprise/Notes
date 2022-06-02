# Java.lang.Thread Class in Java

Thread a line of execution within a program. Each program can have 
multiple associated threads. Each thread has a priority which is 
used by the thread scheduler to determine which thread must run first.

Java provides a thread class that has various method calls in order 
to manage the behavior of threads by providing constructors and 
methods to perform operations on threads. 

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20210421114547/lifecycleofthread.jpg">

## Ways of creating threads

* Creating own class which is extending to parent `Thread` class
* Implementing the `Runnable` interface

## Thread Class in Java

A thread is a program that starts with a method frequently used 
in this class only known as the `start()` method. This method looks 
out for the `run()` method which is also a method of this class and 
begins executing the body of the `run()` method.

**Note:** Every class that is used as thread must implement Runnable 
interface and override it’s run method.

### Constructors

| Constructor                                                               | 	Action Performed                                                                                                                                                                                     |
|---------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `Thread()`                                                                | 	Allocates a new Thread object.                                                                                                                                                                       |
| `Thread(Runnable target)`                                                 | 	Allocates a new Thread object.                                                                                                                                                                       |
| `Thread(Runnable target, String name)`                                    | 	Allocates a new Thread object.                                                                                                                                                                       |
| `Thread(String name)`                                                     | 	Allocates a new Thread object.                                                                                                                                                                       |
| `Thread(ThreadGroup group, Runnable target)`                              | 	Allocates a new Thread object.                                                                                                                                                                       |
| `Thread(ThreadGroup group, Runnable target, String name)`                 | 	Allocates a new Thread object so that it has targeted as its run object, has the specified name as its name, and belongs to the thread group referred to by a group.                                 |
| `Thread(ThreadGroup group, Runnable target, String name, long stackSize)` | 	Allocates a new Thread object so that it has targeted as its run object, has the specified name as its name, and belongs to the thread group referred to by group, and has the specified stack size. |
| `Thread(ThreadGroup group, String name)`                                  | 	Allocates a new Thread object.                                                                                                                                                                       |

### Methods

| Methods                                                                   | 	Action Performed                                                                                                                                                                             |
|---------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `activeCount()`                                                           | 	Returns an estimate of the number of active threads in the current thread’s thread group and its subgroups                                                                                   |
| `checkAccess()`                                                           | 	Determines if the currently running thread has permission to modify this thread                                                                                                              |
| `clone()`                                                                 | 	Throws CloneNotSupportedException as a Thread can not be meaningfully cloned                                                                                                                 |
| `currentThread()`                                                         | 	Returns a reference to the currently executing thread object                                                                                                                                 |
| `dumpStack()`                                                             | 	Prints a stack trace of the current thread to the standard error stream                                                                                                                      |
| `enumerate(Thread[] tarray)`                                              | 	Copies into the specified array every active thread in the current thread’s thread group and its subgroups                                                                                   |
| `getAllStackTraces()`                                                     | 	Returns a map of stack traces for all live threads                                                                                                                                           |
| `getContextClassLoader()`                                                 | 	Returns the context ClassLoader for this Thread                                                                                                                                              |
| `getDefaultUncaughtExceptionHandler()`                                    | 	Returns the default handler invoked when a thread abruptly terminates due to an uncaught exception                                                                                           |                                                                                                                                                                                               |
| `getId()`                                                                 | 	Returns the identifier of this Thread                                                                                                                                                        |
| `getName()`                                                               | 	Returns this thread’s name                                                                                                                                                                   |
| `getPriority()`                                                           | 	Returns this thread’s priority                                                                                                                                                               |
| `getStackTrace()`                                                         | 	Returns an array of stack trace elements representing the stack dump of this thread                                                                                                          |
| `getState()`                                                              | 	Returns the state of this thread                                                                                                                                                             |
| `getThreadGroup()`                                                        | 	Returns the thread group to which this thread belongs                                                                                                                                        |
| `getUncaughtExceptionHandler()`                                           | 	Returns the handler invoked when this thread abruptly terminates due to an uncaught exception                                                                                                |
| `holdsLock(Object obj)`                                                   | 	Returns true if and only if the current thread holds the monitor lock on the specified object                                                                                                |
| `interrupt()`                                                             | 	Interrupts this thread                                                                                                                                                                       |
| `interrupted()`                                                           | 	Tests whether the current thread has been interrupted                                                                                                                                        |
| `isAlive()`                                                               | 	Tests if this thread is alive                                                                                                                                                                |
| `isDaemon()`                                                              | 	Tests if this thread is a daemon thread                                                                                                                                                      |
| `isInterrupted()`                                                         | 	Tests whether this thread has been interrupted                                                                                                                                               |
| `join()`                                                                  | 	Waits for this thread to die                                                                                                                                                                 |
| `join(long millis)`                                                       | 	Waits at most millis milliseconds for this thread to die                                                                                                                                     |
| `run()`                                                                   | 	If this thread was constructed using a separate Runnable run object, then that Runnable object’s run method is called; otherwise, this method does nothing and returns                       |
| `setContextClassLoader(ClassLoader cl)`	                                  | Sets the context ClassLoader for this Thread                                                                                                                                                  |
| `setDaemon(boolean on)`	                                                  | Marks this thread as either a daemon thread or a user thread                                                                                                                                  |
| `setDefaultUncaughtExceptionHandler( Thread.UncaughtExceptionHandler eh)` | 	Set the default handler invoked when a thread abruptly terminates due to an uncaught exception, and no other handler has been defined for that thread                                        |
| `setName(String name)`                                                    | 	Changes the name of this thread to be equal to the argument name.                                                                                                                            |
| `setUncaughtExceptionHandler( Thread.UncaughtExceptionHandler eh)`        | 	Set the handler invoked when this thread abruptly terminates due to an uncaught exception                                                                                                    |
| `setPriority(int newPriority)`                                            | 	Changes the priority of this thread                                                                                                                                                          |
| `sleep(long millis)`                                                      | 	Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers |
| `start()`                                                                 | 	Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread                                                                                          |
| `toString()`                                                              | 	Returns a string representation of this thread, including the thread’s name, priority, and thread group                                                                                      |
| `yield()`                                                                 | 	A hint to the scheduler that the current thread is willing to yield its current use of a processor                                                                                           |

Also do remember there are certain methods inherited from class 
`java. lang.Object` that are as follows:

1. `equals()` Method
2. `finalize()` Method
3. `getClass()` Method
4. `hashCode()` Method
5. `notify()` Method
6. `notifyAll()` Method
7. `toString()` Method
8. `wait()` Method

<a href="https://www.geeksforgeeks.org/java-lang-thread-class-java/">GeeksforGeeks Page</a>

## Creating a Thread
Thread can be referred to as a lightweight process. Thread uses 
fewer resources to create and exist in the process; thread shares 
process resources. 

The main thread of Java is the thread that is started when the 
program starts. The slave thread is created as a result of the 
main thread. This is the last thread to complete execution.

A thread can programmatically be created by:

* Implementing the `java.lang.Runnable` interface.
* Extending the `java.lang.Thread` class.

You can create threads by implementing the runnable interface 
and overriding the `run()` method. Then, you can create a thread 
object and call the `start()` method.

### Thread Class

The `Thread` class provides constructors and methods for creating 
and operating on threads. The thread extends the `Object` and 
implements the `Runnable` interface.
```
// start a newly created thread.
// Thread moves from new state to runnable state
// When it gets a chance, executes the target run() method
public void start()  
```

#### Example
```
import java.io.*;
class GFG extends Thread {
	public void run()
	{
		System.out.print("Welcome to GeeksforGeeks.");
	}
	public static void main(String[] args)
	{
		GFG g = new GFG(); // creating thread
		g.start(); // starting thread
	}
}
```

#### Output
`Welcome to GeeksforGeeks.`

### Runnable interface

Any class with instances that are intended to be executed by a 
thread should implement the `Runnable` interface. The `Runnable` 
interface has only one method, which is called `run()`.
```
// Thread action is performed
public void run() 
```
j
#### Example
```
import java.io.*;
class GFG implements Runnable {
	public static void main(String args[])
	{
		// create an object of Runnable target
		GFG gfg = new GFG();

		// pass the runnable reference to Thread
		Thread t = new Thread(gfg, "gfg");

		// start the thread
		t.start();

		// get the name of the thread
		System.out.println(t.getName());
	}
	@Override public void run()
	{
		System.out.println("Inside run method");
	}
}
```
#### Output
```
gfg
Inside run method
```

## Object Level Lock in Java

An object-level lock is a mechanism when we want to synchronize a
non-static method or non-static code block such that only one
thread will be able to execute the code block on a given instance
of the class.

Every object in java has a unique lock. Whenever we are using a 
synchronized keyword, then the lock concept will come into the 
picture only if a thread wants to execute a synchronized method on the 
given object. 

First, it has to get a lock of that object. Once the thread got the 
lock then it is allowed to execute any synchronized method on that 
object. Once method execution completes the thread automatically
releases the lock. Acquiring and releasing the lock is taken care of
internally by the JVM.

### Methods

There are different ways we can lock the object in the 
thread as below:

**Method 1:**
```
public class GeekClass
{
    public synchronized void GeekMethod(){}
}
```
**Method 2:**
```
public class GeekClass
{
    public void GeekMethod(){
        synchronized (this)
        {
            // other thread safe code
        }
    }
}
```
**Method 3:**
```
public class DemoClass
{
    private final Object lock = new Object();
    public void demoMethod(){
        synchronized (lock)
        {
            // other thread safe code
        }
    }
}
```

## `wait()` Method in Java

Inter-Thread communication is a way by which synchronized threads 
can communicate with each other using the methods namely `wait()`, 
`notify()` and `notifyAll()`. `wait()` method is a part of 
`java.lang.Object` class. When `wait()` method is called, the 
calling thread stops its execution until `notify()` or `notifyAll()` 
method is invoked by some other Thread.

**Syntax:**

`public final void wait() throws InterruptedException`

### Exceptions

`InterruptedException` – if any thread interrupted the current 
thread before or while the current thread was waiting for a 
notification.


`IllegalMonitorStateException` – if the current thread is not the 
owner of the object’s monitor.

**Working:**

* In java, synchronized methods and blocks allow only one thread to 
acquire the lock on a resource at a time. So, when `wait()` method 
is called by a thread, then it gives up the lock on that resource 
and goes to sleep until some other thread enters the same monitor 
and invokes the `notify()` or `notifyAll()` method.


* Calling `notify()` wakes only one thread and calling `notifyAll()` 
wakes up all the threads on the same object. Calling both these 
methods does not give up the lock on the resource, rather its 
job is to wake up the threads that have been sent to the sleep 
state using `wait()` method.


* A big difference between `sleep()` method and `wait()` method is 
that `sleep()` method causes a thread to sleep for a specified amount 
of time while `wait()` causes the thread to sleep until `notify()` 
and `notifyAll()` are invoked.

## interrupt() Method in Java

In Java Threads, if any thread is in sleeping or waiting state 
(i.e. `sleep()` or `wait()` is invoked), calling the `interrupt()` 
method on the thread breaks the sleeping or waiting state throwing 
`InterruptedException`. 

If the thread is not in the sleeping or waiting state, calling 
the `interrupt()` method performs normal behavior and doesn’t 
interrupt the thread but sets the interrupt flag to true.

`interrupt()` method: If any thread is in sleeping or waiting for 
a state, then using the `interrupt()` method we can interrupt the 
execution of that thread by showing `InterruptedException`. A 
thread that is in the sleeping or waiting state can be interrupted 
with the help of the `interrupt()` method of `Thread` class.

## Thread Pools

**A thread pool reuses previously created threads to execute current 
tasks and offers a solution to the problem of thread cycle 
overhead and resource thrashing.** Since the thread is already 
existing when the request arrives, the delay introduced by thread 
creation is eliminated, making the application more responsive.

* Java provides the `Executor` framework which is centered around the 
`Executor` interface, its sub-interface `ExecutorService` and the 
class `ThreadPoolExecutor`, which implements both of these interfaces. 
By using the executor, one only has to implement the `Runnable` 
objects and send them to the executor to execute.


* They allow you to take advantage of threading, but focus on the 
tasks that you want the thread to perform, instead of thread 
mechanics.


* To use thread pools, we first create an object of `ExecutorService` 
and pass a set of tasks to it. `ThreadPoolExecutor` class allows to 
set the core and maximum pool size.The runnables that are run by 
a particular thread are executed sequentially.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Thread_Pool.jpg">

### Executor Thread Pool Methods

| Method                      | Description                                                                                                                     |
|-----------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| `newFixedThreadPool(int)`   | Creates a fixed size thread pool.                                                                                               |
| `newCachedThreadPool()`     | Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available |
| `newSingleThreadExecutor()` | Creates a single thread.                                                                                                        |

### Thread Pool Example

**Steps to be followed:**

1. Create a task(Runnable Object) to execute
2. Create Executor Pool using Executors
3. Pass tasks to Executor Pool
4. Shutdown the Executor Pool

```
// Java program to illustrate
// ThreadPool
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class to be executed (Step 1)
class Task implements Runnable
{
	private String name;
	
	public Task(String s)
	{
		name = s;
	}
	
	// Prints task name and sleeps for 1s
	// This Whole process is repeated 5 times
	public void run()
	{
		try
		{
			for (int i = 0; i<=5; i++)
			{
				if (i==0)
				{
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for"
							+ " task name - "+ name +" = " +ft.format(d));
					//prints the initialization time for every task
				}
				else
				{
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name - "+
							name +" = " +ft.format(d));
					// prints the execution time for every task
				}
				Thread.sleep(1000);
			}
			System.out.println(name+" complete");
		}
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class Test
{
	// Maximum number of threads in thread pool
	static final int MAX_T = 3;			

	public static void main(String[] args)
	{
		// creates five tasks
		Runnable r1 = new Task("task 1");
		Runnable r2 = new Task("task 2");
		Runnable r3 = new Task("task 3");
		Runnable r4 = new Task("task 4");
		Runnable r5 = new Task("task 5");	
		
		// creates a thread pool with MAX_T no. of
		// threads as the fixed pool size(Step 2)
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		// passes the Task objects to the pool to execute (Step 3)
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		// pool shutdown ( Step 4)
		pool.shutdown();	
	}
}
```

### Executor Service Design Pattern

Executor Design pattern can be defined as a particular type of 
design pattern that serves the purpose of decoupling the execution 
of a task from the real task taken by the user with the help of 
executors. 

Executors are specially designed to provide factory 
methods. These methods can be further used in the creation of 
ThreadPools of worker threads. It decouples the submission of a 
command from the execution of that very command.