# Queues

The Queue interface present in the java.util package and 
extends the Collection interface is used to hold the 
elements about to be processed in FIFO(First In First Out) 
order. It is an ordered list of objects with its use limited 
to insert elements at the end of the list and deleting 
elements from the start of the list, (i.e.), it follows the 
FIFO or the First-In-First-Out principle.

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200903183026/Queue-Deque-PriorityQueue-In-Java.png">

## Creating Queue Objects
Since Queue is an interface, objects cannot be created of 
the type queue. We always need a class which extends this 
list in order to create an object. And also, after the 
introduction of Generics in Java 1.5, it is possible to 
restrict the type of object that can be stored in the 
Queue. This type-safe queue can be defined as:

```
// Obj is the type of the object to be stored in Queue
Queue<Obj> queue = new PriorityQueue<Obj> (); 
```

## Methods of Queue Interface
| Method                                     | Description                                                                                                                                                                                   |
|--------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, element)`                  | 	This method is used to add an element at a particular index in the list. When a single parameter is passed, it simply adds the element at the end of the list.                               |
| `addAll(int index, Collection collection)` | 	This method is used to add all the elements in the given collection to the list. When a single parameter is passed, it adds all the elements of the given collection at the end of the list. |
| `size()`                                   | 	This method is used to return the size of the list.                                                                                                                                          |
| `clear()`                                  | 	This method is used to remove all the elements in the list. However, the reference of the list created is still stored.                                                                      |
| `remove(int index)`                        | 	This method removes an element from the specified index. It shifts subsequent elements(if any) to left and decreases their indexes by 1.                                                     |
| `remove(element)`                          | 	This method is used to remove and return the first occurrence of the given element in the list.                                                                                              |
| `get(int index)`                           | 	This method returns elements at the specified index.                                                                                                                                         |
| `set(int index, element)`                  | 	This method replaces elements at a given index with the new element. This function returns the element which was just replaced by a new element.                                             |
| `indexOf(element)`                         | 	This method returns the first occurrence of the given element or -1 if the element is not present in the list.                                                                               |
| `lastIndexOf(element)`                     | 	This method returns the last occurrence of the given element or -1 if the element is not present in the list.                                                                                |
| `equals(element)`                          | 	This method is used to compare the equality of the given element with the elements of the list.                                                                                              |
| `hashCode()`                               | 	This method is used to return the hashcode value of the given list.                                                                                                                          |
| `isEmpty()`                                | 	This method is used to check if the list is empty or not. It returns true if the list is empty, else false.                                                                                  |
| `contains(element)`                        | 	This method is used to check if the list contains the given element or not. It returns true if the list contains the element.                                                                |
| `containsAll(Collection collection)`       | 	This method is used to check if the list contains all the collection of elements.                                                                                                            |
| `sort(Comparator comp)`                    | 	This method is used to sort the elements of the list on the basis of the given comparator.                                                                                                   |

## Deque Interface in Java

The Deque interface present in java.util package is a 
subtype of the queue interface. The Deque is related 
to the double-ended queue that supports addition or 
removal of elements from either end of the data structure. 
It can either be used as a queue(first-in-first-out/FIFO) 
or as a stack(last-in-first-out/LIFO). Deque is the 
acronym for double ended queue.

### Creating Deque Objects

Since Deque is an interface, objects cannot be created of 
the type deque. We always need a class which extends this 
list in order to create an object. And also, after the 
introduction of Generics in Java 1.5, it is possible to 
restrict the type of object that can be stored in the 
Deque. This type-safe queue can be defined as:

```
// Obj is the type of the object to be stored in Deque
Deque<Obj> deque = new ArrayDeque<Obj> ();
```

### Adding Elements
In order to add an element in a deque, we can use the 
`add()` method. The difference between a queue and a deque 
is that in deque, the addition is possible from any 
direction. Therefore, there are other two methods 
available named `addFirst()` and `addLast()` which are used 
to add the elements at either end.

### Removing Elements
In order to remove an element from a deque, there are 
various methods available. Since we can also remove from 
both the ends, the deque interface provides us with 
`removeFirst()`, `removeLast()` methods. Apart from that, 
this interface also provides us with the `poll()`, `pop()`, 
`pollFirst()`, `pollLast()` methods where `pop()` is used to 
remove and return the head of the deque. However, `poll()` 
is used because this offers the same functionality as 
`pop()` and doesn't return an exception when the deque is empty.

### Methods of Deque Interface

| Method	                | Description                                                                                                                                                                                                                       |
|------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(element)`         | 	This method is used to add an element at the tail of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.  |
| `addFirst(element)`    | 	This method is used to add an element at the head of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.  |
| `addLast(element)`     | 	This method is used to add an element at the tail of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.  |
| `contains()`           | 	This method is used to check whether the queue contains the given object or not.                                                                                                                                                 |
| `descendingIterator()` | 	This method returns an iterator for the deque. The elements will be returned in order from last(tail) to first(head).                                                                                                            |
| `element()`            | 	This method is used to retrieve, but not remove, the head of the queue represented by this deque.                                                                                                                                |
| `getFirst()`           | 	This method is used to retrieve, but not remove, the first element of this deque.                                                                                                                                                |
| `getLast()`            | 	This method is used to retrieve, but not remove, the last element of this deque.                                                                                                                                                 |
| `iterator()`           | 	This method returns an iterator for the deque. The elements will be returned in order from first (head) to last (tail).                                                                                                          |
| `offer(element)`       | 	This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.      |
| `offerFirst(element)`  | 	This method is used to add an element at the head of the queue. This method is preferable to addFirst() method since this method does not throws an exception when the capacity of the container is full since it returns false. |
| `offerLast(element)`   | 	This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.      |
| `peek()`               | 	This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.                                                              |
| `peekFirst()`          | 	This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.                                                              |
| `peekLast()`           | 	This method is used to retrieve the element at the tail of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.                                                              |
| `poll()`               | 	This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.                                                                                                 |
| `pollFirst()`          | 	This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.                                                                                                 |
| `pollLast()`           | 	This method is used to retrieve and remove the element at the tail of the deque. This method returns null if the deque is empty.                                                                                                 |
| `pop()`                | 	This method is used to remove an element from the head and return it.                                                                                                                                                            |
| `push(element)`        | 	This method is used to add an element at the head of the queue.                                                                                                                                                                  |
| `removeFirst()`        | 	This method is used to remove an element from the head of the queue.                                                                                                                                                             |
| `removeLast()`         | 	This method is used to remove an element from the tail of the queue.                                                                                                                                                             |
| `size()`               | 	This method is used to find and return the size of the deque.                                                                                                                                                                    |