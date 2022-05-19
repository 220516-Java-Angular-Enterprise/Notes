# ArrayList in Java

ArrayList is a part of collection framework and is present 
in java.util package. It provides us with dynamic arrays in 
Java. Though, it may be slower than standard arrays but can 
be helpful in programs where lots of manipulation in the array 
is needed. This class is found in java.util package. 

Since ArrayList is a dynamic array and we do not have to 
specify the size while creating it, the size of the array 
automatically increases when we dynamically add and remove 
items. Though the actual library implementation may be more 
complex, the following is a very basic idea explaining the 
working of the array when the array becomes full and if we 
try to add an item:

* Creates a bigger-sized memory on heap memory (for example 
memory of double size).


* Copies the current memory elements to the new memory.


* New item is added now as there is bigger memory available now.


* Delete the old memory.

**Important Features:**

* ArrayList inherits AbstractList class and implements the 
List interface.


* ArrayList is initialized by the size. However, the size is 
increased automatically if the collection grows or shrinks if 
the objects are removed from the collection.


* Java ArrayList allows us to randomly access the list.


* ArrayList can not be used for primitive types, like int, 
char, etc. We need a wrapper class for such cases.


* ArrayList in Java can be seen as a vector in C++.


* ArrayList is not Synchronized. Its equivalent synchronized 
class in Java is Vector.


## Constructors in the ArrayList
In order to create an ArrayList, we need to create an 
object of the ArrayList class. The ArrayList class 
consists of various constructors which allow the possible 
creation of the array list. The following are the constructors 
available in this class:


### 1. ArrayList(): 
This constructor is used to build an empty array list. 
If we wish to create an empty ArrayList with the name arr, 
then, it can be created as:

`ArrayList arr = new ArrayList();`

### 2. ArrayList(Collection c): 
This constructor is used to build an array list initialized 
with the elements from the collection c. Suppose, we wish 
to create an ArrayList arr which contains the elements present 
in the collection c, then, it can be created as:

`ArrayList arr = new ArrayList(c);`

### 3. ArrayList(int capacity): 
This constructor is used to build an array list with 
initial capacity being specified. Suppose we wish to 
create an ArrayList with the initial size being N, then, it 
can be created as:

`ArrayList arr = new ArrayList(N);`  

## Methods in Java ArrayList

| Method                            | Description                                                                                                                                                                                       |
|-----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, Object element)`  | This method is used to insert a specific element at a specific position index in a list.                                                                                                          |
| `add(Object o)`                   | This method is used to append a specific element to the end of a list.                                                                                                                            |
| `addAll(Collection C)`            | This method is used to append all the elements from a specific collection to the end of the mentioned list, in such an order that the values are returned by the specified collection’s iterator. |
| `addAll(int index, Collection C)` | Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.                                                                         |
| `clear()`                         | 	This method is used to remove all the elements from any list.                                                                                                                                    |
| `clone()`                         | 	This method is used to return a shallow copy of an ArrayList.                                                                                                                                    |
| `contains(Object o)`              | Returns true if this list contains the specified element.                                                                                                                                         |
| `get(int index)`                  | 	Returns the element at the specified position in this list.                                                                                                                                      |
| `indexOf(Object O)`               | The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.                                                                            |
| `isEmpty()`                       | Returns true if this list contains no elements.                                                                                                                                                   |
| `lastIndexOf(Object O)`           | The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list.                                                                           |
| `remove(int index)`               | Removes the element at the specified position in this list.                                                                                                                                       |
| `remove(Object o)`                | Removes the first occurrence of the specified element from this list, if it is present.                                                                                                           |
| `removeAll(Collection c)`         | Removes from this list all of its elements that are contained in the specified collection.                                                                                                        |
| `set(int index, E element)`	      | Replaces the element at the specified position in this list with the specified element.                                                                                                           |
| `size()`                          | Returns the number of elements in this list.                                                                                                                                                      |



