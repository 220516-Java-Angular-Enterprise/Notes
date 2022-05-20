# Stack Vs Heap in Java

## Stack Memory
The stack memory is a physical space (in RAM) allocated to each 
thread at run time. It is created when a thread creates. Memory 
management in the stack follows LIFO (Last-In-First-Out) 
order because it is accessible globally. It stores the variables, 
references to objects, and partial results. 

Memory allocated to stack lives until the function returns. If there is no space 
for creating the new objects, it throws the 
`java.lang.StackOverFlowError`. The scope of the elements is 
limited to their threads. The JVM creates a separate stack 
for each thread.

## Heap Memory
It is created when the JVM starts up and used by the 
application as long as the application runs. It stores 
objects and JRE classes. Whenever we create objects it 
occupies space in the heap memory while the reference of 
that object creates in the stack. It does not follow any 
order like the stack. It dynamically handles the memory blocks. 
It means, we need not handle the memory manually. 

For managing the memory automatically, Java provides the garbage 
collector that deletes the objects which are no longer being 
used. Memory allocated to heap lives until any one event, 
either program terminated or memory free does not occur. 
The elements are globally accessible in the application. 
It is a common memory space shared with all the threads. 
If the heap space is full, it throws the 
`java.lang.OutOfMemoryError`. 

## Garbage Collection
Garbage collection in Java is the process by which Java 
programs perform automatic memory management. Java programs 
compile to bytecode that can be run on a Java Virtual Machine, 
or JVM for short. When Java programs run on the JVM, objects 
are created on the heap, which is a portion of memory dedicated 
to the program. Eventually, some objects will no longer be 
needed. The garbage collector finds these unused objects and 
deletes them to free up memory.