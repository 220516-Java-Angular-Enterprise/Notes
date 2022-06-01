# ArrayList in Java

ArrayList is a part of collection framework and is present 
in `java.util` package. It provides us with dynamic arrays in 
Java. Though, it may be slower than standard arrays but 
can be helpful in programs where lots of manipulation 
in the array is needed. This class is found in `java.util` 
package. 

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200624184403/ArrayList.png">

Since `ArrayList` is a dynamic array, and we do not have 
to specify the size while creating it, the size of the 
array automatically increases when we dynamically add 
and remove items.

## Constructors

In order to create an ArrayList, we need to create an 
object of the ArrayList class. The ArrayList class consists 
of various constructors which allow the possible creation 
of the array list. The following are the constructors 
available in this class:


1. `ArrayList()`: This constructor is used to build an empty array list. If we wish to create an empty ArrayList with the name arr, then, it can be created as:

`ArrayList arr = new ArrayList();`


2. `ArrayList(Collection c)`: This constructor is used to build an array list initialized with the elements from the collection c. Suppose, we wish to create an ArrayList arr which contains the elements present in the collection c, then, it can be created as:


`ArrayList arr = new ArrayList(c);`


3. `ArrayList(int capacity)`: This constructor is used to build an array list with initial capacity being specified. Suppose we wish to create an ArrayList with the initial size being N, then, it can be created as:

`ArrayList arr = new ArrayList(N);`  

## Methods

| Method	                                   | Description                                                                                                                                                                                        |
|-------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, Object element)`          | 	This method is used to insert a specific element at a specific position index in a list.                                                                                                          |
| `add(Object o)`                           | 	This method is used to append a specific element to the end of a list.                                                                                                                            |
| `addAll(Collection C)`                    | 	This method is used to append all the elements from a specific collection to the end of the mentioned list, in such an order that the values are returned by the specified collection’s iterator. |
| `addAll(int index, Collection C)`         | 	Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.                                                                         |
| `clear()`                                 | 	This method is used to remove all the elements from any list.                                                                                                                                     |
| `clone()`                                 | 	This method is used to return a shallow copy of an ArrayList.                                                                                                                                     |
| `contains(Object o)`                      | 	Returns true if this list contains the specified element.                                                                                                                                         |
| `ensureCapacity(int minCapacity)`         | 	Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.                           |
| `forEach(Consumer<? super E> action)`     | 	Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.                                                              |
| `get(int index)`                          | 	Returns the element at the specified position in this list.                                                                                                                                       |
| `indexOf(Object O)`                       | 	The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.                                                                            |
| `isEmpty()`                               | 	Returns true if this list contains no elements.                                                                                                                                                   |
| `lastIndexOf(Object O)`                   | 	The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list.                                                                           |
| `listIterator()`                          | 	Returns a list iterator over the elements in this list (in proper sequence).                                                                                                                      |
| `listIterator(int index)`                 | 	Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.                                                                      |
| `remove(int index)`                       | 	Removes the element at the specified position in this list.                                                                                                                                       |
| `remove(Object o)`                        | 	Removes the first occurrence of the specified element from this list, if it is present.                                                                                                           |
| `removeAll(Collection c)`                 | 	Removes from this list all of its elements that are contained in the specified collection.                                                                                                        |
| `removeIf(Predicate filter)`              | 	Removes all of the elements of this collection that satisfy the given predicate.                                                                                                                  |
| `removeRange(int fromIndex, int toIndex)` | 	Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.                                                                                   |
| `retainAll(Collection<?> c)`	             | Retains only the elements in this list that are contained in the specified collection.                                                                                                             |
| `set(int index, E element)`               | 	Replaces the element at the specified position in this list with the specified element.                                                                                                           |
| `size()`                                  | 	Returns the number of elements in this list.                                                                                                                                                      |
| `spliterator()`                           | 	Creates a late-binding and fail-fast Spliterator over the elements in this list.                                                                                                                  |
| `subList(int fromIndex, int toIndex)`     | 	Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.                                                                                    |
| `toArray()`                               | 	This method is used to return an array containing all of the elements in the list in the correct order.                                                                                           |
| `toArray(Object[ ] O)`                    | 	It is also used to return an array containing all of the elements in this list in the correct order same as the previous method.                                                                  |
| `trimToSize()`                            | 	This method is used to trim the capacity of the instance of the ArrayList to the list’s current size.                                                                                             |
