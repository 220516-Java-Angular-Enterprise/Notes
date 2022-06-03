# Collection Interface in Java

The **Collection** interface is a member of the Java Collections 
Framework. It is a part of `java.util` package. It is one of 
the root interfaces of the Collection Hierarchy. The 
`Collection` interface is not directly implemented by any 
class. However, it is implemented indirectly via its subtypes 
or sub-interfaces like `List`, `Queue`, and `Set`.

For Example, the `HashSet` class implements the `Set` interface
which is a sub-interface of the `Collection` interface. If a 
collection implementation doesn’t implement a particular 
operation, it should define the corresponding method to 
throw `UnsupportedOperationException`.

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20201105225856/Collection-Interface-in-Java-with-Examples.png">

It implements the `Iterable<E>` interface. The sub-interfaces 
of Collection are `BeanContext`, `BeanContextServices`, 
`BlockingDeque<E>`, `BlockingQueue<E>`, `Deque<E>`, `EventSet`, 
`List<E>`, `NavigableSet<E>`, `Queue<E>`, `Set<E>`, `SortedSet<E>`, 
`TransferQueue<E>`.