# LinkedList in Java

**Linked List** is a part of the `Collection` framework present 
in `java.util` package. This class is an implementation of 
the `LinkedList` data structure which is a linear data structure 
where the elements are not stored in contiguous locations and 
every element is a separate object with a data part and 
address part. The elements are linked using pointers and 
addresses. Each element is known as a node. 

Due to their dynamic nature and ease of insertions and 
deletions, they are preferred over the arrays. It also 
has a few disadvantages like the nodes cannot be accessed 
directly instead we need to start from the head and follow 
through the link to reach a node we wish to access.

## Constructors

In order to create a `LinkedList`, we need to create an 
object of the `LinkedList` class. The `LinkedList` class 
consists of various constructors that allow the possible 
creation of the list. The following are the constructors 
available in this class:


1. `LinkedList()`: This constructor is used to create an empty linked list. If we wish to create an empty LinkedList with the name ll, then, it can be created as:

`LinkedList ll = new LinkedList();`

2. `LinkedList(Collection C)`: This constructor is used to create an ordered list that contains all the elements of a specified collection, as returned by the collection’s iterator. If we wish to create a LinkedList with the name ll, then, it can be created as:

`LinkedList ll = new LinkedList(C);`

## Methods

| Method                               | 	Description                                                                                                                                                                                                      |
|--------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, E element)`          | 	This method Inserts the specified element at the specified position in this list.                                                                                                                                |
| `add(E e)`                           | 	This method Appends the specified element to the end of this list.                                                                                                                                               |
| `addAll(int index, Collection<E> c)` | 	This method Inserts all of the elements in the specified collection into this list, starting at the specified position.                                                                                          |
| `addAll(Collection<E> c)`            | 	This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.                                         |
| `addFirst(E e)`                      | 	This method Inserts the specified element at the beginning of this list.                                                                                                                                         |
| `addLast(E e)`                       | 	This method Appends the specified element to the end of this list.                                                                                                                                               |
| `clear()`                            | 	This method removes all of the elements from this list.                                                                                                                                                          |
| `clone()`                            | 	This method returns a shallow copy of this LinkedList.                                                                                                                                                           |
| `contains(Object o)`                 | 	This method returns true if this list contains the specified element.                                                                                                                                            |
| `descendingIterator()`               | 	This method returns an iterator over the elements in this deque in reverse sequential order.                                                                                                                     |
| `element()`                          | 	This method retrieves but does not remove, the head (first element) of this list.                                                                                                                                |
| `get(int index)`                     | 	This method returns the element at the specified position in this list.                                                                                                                                          |
| `getFirst()`                         | 	This method returns the first element in this list.                                                                                                                                                              |
| `getLast()`                          | 	This method returns the last element in this list.                                                                                                                                                               |
| `indexOf(Object o)`                  | 	This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.                                                                    |
| `lastIndexOf(Object o)`              | 	This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.                                                                     |
| `listIterator(int index)`            | 	This method returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.                                                                           |
| `offer(E e)`                         | 	This method Adds the specified element as the tail (last element) of this list.                                                                                                                                  |
| `offerFirst(E e)`                    | 	This method Inserts the specified element at the front of this list.                                                                                                                                             |
| `offerLast(E e)`                     | 	This method Inserts the specified element at the end of this list.                                                                                                                                               |
| `peek()`                             | 	This method retrieves but does not remove, the head (first element) of this list.                                                                                                                                |
| `peekFirst()`                        | 	This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.                                                                                               |
| `peekLast()`                         | 	This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.                                                                                                |
| `poll()`                             | 	This method retrieves and removes the head (first element) of this list.                                                                                                                                         |
| `pollFirst()`                        | 	This method retrieves and removes the first element of this list, or returns null if this list is empty.                                                                                                         |
| `pollLast()`                         | 	This method retrieves and removes the last element of this list, or returns null if this list is empty.                                                                                                          |
| `pop()`                              | 	This method Pops an element from the stack represented by this list.                                                                                                                                             |
| `push(E e)`                          | 	This method pushes an element onto the stack represented by this list.                                                                                                                                           |
| `remove()`                           | 	This method retrieves and removes the head (first element) of this list.                                                                                                                                         |
| `remove(int index)`                  | 	This method removes the element at the specified position in this list.                                                                                                                                          |
| `remove(Object o)`                   | 	This method removes the first occurrence of the specified element from this list if it is present.                                                                                                               |
| `removeFirst()`                      | 	This method removes and returns the first element from this list.                                                                                                                                                |
| `removeFirstOccurrence(Object o)`    | 	This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).                                                                                     |
| `removeLast()`                       | 	This method removes and returns the last element from this list.                                                                                                                                                 |
| `removeLastOccurrence(Object o)`     | 	This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).                                                                                      |
| `set(int index, E element)`          | 	This method replaces the element at the specified position in this list with the specified element.                                                                                                              |
| `size()`                             | 	This method returns the number of elements in this list.                                                                                                                                                         |
| `spliterator()`                      | 	This method creates a late-binding and fail-fast Spliterator over the elements in this list.                                                                                                                     |
| `toArray()`                          | 	This method returns an array containing all of the elements in this list in proper sequence (from first to last element).                                                                                        |
| `toArray(T[] a)`                     | 	This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.                 |
| `toString()`                         | 	This method returns a string containing all of the elements in this list in proper sequence (from first to the last element), each element is separated by commas and the String is enclosed in square brackets. |