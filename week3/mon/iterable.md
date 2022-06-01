# Iterable Interface in Java

The `Iterable` interface was introduced in JDK 1.5. 
It belongs to `java.lang` package. In general, an object 
Implementing `Iterable` allows it to be iterated. An iterable 
interface allows an object to be the target of enhanced 
for loop(for-each loop). 

## Iterators in Java

A Java Cursor is an Iterator, which is used to iterate or 
traverse or retrieve a Collection or Stream object’s 
elements one by one. There are three cursors in Java.

1. Iterator
2. Enumeration
3. ListIterator

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20211222114908/Imagereedit-660x330.jpg">

## Iterator

Iterators in Java are used in the Collection framework 
to retrieve elements one by one. It is a universal 
iterator as we can apply it to any Collection object. 
By using Iterator, we can perform both read and remove 
operations. It is an improved version of Enumeration with 
the additional functionality of removing an element.

Iterator must be used whenever we want to enumerate elements 
in all Collection framework implemented interfaces like 
Set, List, Queue, Deque, and all implemented classes of 
Map interface. Iterator is the only cursor available for 
the entire collection framework.

Iterator object can be created by calling iterator() 
method present in Collection interface.

**Syntax:**

`Iterator itr = c.iterator();`

`Note: Here “c” is any Collection object. itr is of type Iterator interface and refers to “c”.`

### Methods of Iterator Interface in Java

Iterator interface defines three methods as listed below:

1. `hasNext()`: Returns true if the iteration has more elements.

`public boolean hasNext();`
2. `next()`: Returns the next element in the iteration. It throws NoSuchElementException if no more element is present.

`public Object next();`
3. `remove()`: Removes the next element in the iteration. This method can be called only once per call to next().

`public void remove();`