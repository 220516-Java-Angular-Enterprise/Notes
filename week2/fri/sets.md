# Sets

The set interface is present in java.util package and 
extends the Collection interface is an unordered collection 
of objects in which duplicate values cannot be stored. 

It is an interface that implements the mathematical set. This 
interface contains the methods inherited from the Collection 
interface and adds a feature that restricts the insertion 
of the duplicate elements. 

There are two interfaces that extend the set implementation 
namely SortedSet and NavigableSet.

## Creating Set Objects
Since Set is an interface, objects cannot be created of 
the typeset. We always need a class that extends this list 
in order to create an object. And also, after the 
introduction of Generics in Java 1.5, it is possible to 
restrict the type of object that can be stored in the Set. 
This type-safe set can be defined as:
```
// Obj is the type of the object to be stored in Set
Set<Obj> set = new HashSet<Obj> (); 
```

Let us discuss methods present in the Set interface 
provided below in a tabular format below as follows:

| Method	                    | Description                                                                                                                                                                                                                           |
|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add(element)`	            | This method is used to add a specific element to the set. The function adds the element only if the specified element is not already present in the set else the function returns False if the element is already present in the Set. |
| `addAll(collection)`	      | This method is used to append all of the elements from the mentioned collection to the existing set. The elements are added randomly without following any specific order.                                                            |
| `clear()`	                 | This method is used to remove all the elements from the set but not delete the set. The reference for the set still exists.                                                                                                           |
| `contains(element)`	       | This method is used to check whether a specific element is present in the Set or not.                                                                                                                                                 |
| `containsAll(collection)`	 | This method is used to check whether the set contains all the elements present in the given collection or not. This method returns true if the set contains all the elements and returns false if any of the elements are missing.    |                                                                                                                                                                                                                                       |
| `hashCode()`	              | This method is used to get the hashCode value for this instance of the Set. It returns an integer value which is the hashCode value for this instance of the Set.                                                                     |
| `isEmpty()`	               | This method is used to check whether the set is empty or not.                                                                                                                                                                         |
| `iterator()`	              | This method is used to return the iterator of the set. The elements from the set are returned in a random order.                                                                                                                      |
| `remove(element)`	         | This method is used to remove the given element from the set. This method returns True if the specified element is present in the Set otherwise it returns False.                                                                     |
| `removeAll(collection)`	   | This method is used to remove all the elements from the collection which are present in the set. This method returns true if this set changed as a result of the call.                                                                |
| `retainAll(collection)`	   | This method is used to retain all the elements from the set which are mentioned in the given collection. This method returns true if this set changed as a result of the call.                                                        |
| `size()`	                  | This method is used to get the size of the set. This returns an integer value which signifies the number of elements.                                                                                                                 |
| `toArray()`	               | This method is used to form an array of the same elements as that of the Set.                                                                                                                                                         |

## HashSet

The `HashSet` class implements the `Set` interface, backed by 
a hash table which is actually a `HashMap` instance. No 
guarantee is made as to the iteration order of the set 
which means that the class does not guarantee the constant 
order of elements over time. This class permits the null 
element. 

The class also offers constant time performance 
for the basic operations like add, remove, contains, and 
size assuming the hash function disperses the elements 
properly among the buckets.

### Constructors of `HashSet` class

1. `HashSet()`: This constructor is used to build an empty 
HashSet object in which the default initial capacity is 16 
and the default load factor is 0.75. If we wish to create 
an empty HashSet with the name hs, then, it can be created as:

`HashSet<E> hs = new HashSet<E>();`

2. `HashSet(int initialCapacity)`: This constructor is used to build an empty HashSet object in which the initialCapacity is specified at the time of object creation. Here, the default loadFactor remains 0.75.

`HashSet<E> hs = new HashSet<E>(int initialCapacity);`

3. `HashSet(int initialCapacity, float loadFactor)`: This constructor is used to build an empty HashSet object in which the initialCapacity and loadFactor are specified at the time of object creation.

`HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);`

4. `HashSet(Collection)`: This constructor is used to build a HashSet object containing all the elements from the given collection. In short, this constructor is used when any conversion is needed from any Collection object to the HashSet object. If we wish to create a HashSet with the name hs, it can be created as:

`HashSet<E> hs = new HashSet<E>(Collection C);`