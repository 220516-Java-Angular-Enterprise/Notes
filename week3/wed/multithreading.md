# Multithreading

**Multithreading** is a technique that allows for concurrent 
(simultaneous) execution of two or more parts of a program for 
maximum utilization of a CPU. As a really basic example, 
multithreading allows you to write code in one program and listen 
to music in another. Programs are made up of processes and threads. 
You can think of it like this:

A **program** is an executable file like **chrome.exe**

A **process** is an executing instance of a **program**. When you 
double-click on the **Google Chrome** icon on your computer, you start 
a **process** which will run the **Google Chrome** **program**.

**Thread** is the smallest executable unit of a **process**. A **process** can 
have multiple **threads** with one main **thread**. In the example, a 
single **thread** could be displaying the current tab you’re in, and 
a different thread could be another tab.

## Why Use Multithreading?

With the introduction of multiple cores, **multithreading** has become 
extremely important in terms of the efficiency of your application. 
With multiple threads and a single core, your application would 
have to transition back and forth to give the illusion of multitasking.

With multiple cores, your application can take advantage of the 
underlying hardware to run individual threads through a dedicated 
core, thus making your application more responsive and efficient. 
**Multithreading** basically allows you to take full advantage of your 
CPU and the multiple cores, so you don’t have untapped processing 
power with idle cores.

**Developers should make use of multithreading for a few reasons:**

* Higher throughput


* Responsive applications that give the illusion of multitasking.


* Efficient utilization of resources. Thread creation is light-weight 
in comparison to spawning a new process and for web servers that 
use threads instead of creating a new process when fielding web 
requests, consume far fewer resources.

## Programs, Processes, and Threads

Operating systems today can run multiple **programs** at the same time. 
For example, you’re reading this article in your browser (a **program**) 
but you can also listen to music on your media player (another **program**).

**Processes** are what actually execute the **program**. Each process is 
able to run concurrent subtasks called **threads**.

**Threads** are sub-tasks of **processes** and if synchronized correctly 
can give the illusion that your application is performing everything 
at once. Without **threads**, you would have to write one **program** per 
task, run them as **processes** and synchronize them through the 
operating system.

## Concurrency
**Concurrency** relates to an application that is processing more than 
one task at the same time. **Concurrency** is an approach that is 
used for decreasing the response time of the system by using the 
single processing unit. 

**Concurrency** creates the illusion of **parallelism**, however actually the 
chunks of a task aren’t parallel processed, but inside the 
application, there is more than one task is being processed at a 
time. It doesn’t fully end one task before it begins ensuing.

**Concurrency** is achieved through the interleaving operation of 
processes on the central processing unit(CPU) or in other words 
by the **context switching**.

## Parallelism
**Parallelism** is where tasks are divided into smaller sub-tasks 
that are processed seemingly simultaneously or parallel. It is 
used to increase the throughput and computational speed of the 
system by using multiple processors. It enables single sequential 
CPUs to do a lot of things “seemingly” simultaneously.

**Parallelism** leads to overlapping of central processing units 
and input-output tasks in one process with the central processing 
unit and input-output tasks of another process, whereas in 
concurrency the speed is increased by overlapping the input-output 
activities of one process with CPU process of another process. 

## Asynchronous Programming

An asynchronous model allows multiple things to happen at the 
same time. When your program calls a long-running function, it 
doesn’t block the execution flow, and your program continues to 
run. When the function finishes, the program knows and gets 
access to the result (if there’s a need for that).

Let’s take an example of a program that fetches two files over a 
network and combines them:

<img src="https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/sync.png">

In an asynchronous system, the solution is to start an additional 
thread of control. The first thread fetches the first file, 
and the second thread fetches the second file without waiting 
for the first thread to finish, and then both threads wait for 
their results to come back, after which they resynchronize to 
combine their results.

Another example with a single-thread approach is a program that 
requests a file from the OS and needs to make a mathematical 
operation.

In an asynchronous system, the program asks the OS for the file 
and returns the control to the mathematical operation to be 
executed on the CPU, while waiting for the file.

One approach to asynchronous programming is to make functions 
that perform a slow action and take an extra argument, a 
callback function. The action is started, and when it finishes, 
the callback function is called with the result.

## Multithreading: Synchronized Resources

Java provides a way of creating threads and synchronizing their 
tasks using synchronized blocks. Synchronized blocks in Java are 
marked with the synchronized keyword. A synchronized block in Java 
is synchronized on some object. All synchronized blocks synchronize 
on the same object can only have one thread executing inside them 
at a time. All other threads attempting to enter the synchronized 
block are blocked until the thread inside the synchronized block 
exits the block.

Following is the general form of a synchronized block:
```
// Only one thread can execute at a time.

// sync_object is a reference to an object
   whose lock associates with the monitor.

// The code is said to be synchronized on
   the monitor object

synchronized(sync_object)
{
// Access shared variables and other
   shared resources
}
```

This synchronization is implemented in Java with a concept 
called monitors. Only one thread can own a monitor at a given 
time. When a thread acquires a lock, it is said to have entered 
the monitor. All other threads attempting to enter the locked 
monitor will be suspended until the first thread exits the monitor.