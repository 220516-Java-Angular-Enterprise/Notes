# Arrays in Java

An array in Java is a group of like-typed variables referred to by a common name. 
Following are some important points about Java arrays.

* In Java, all arrays are dynamically allocated. 
* Since arrays are objects in Java, we can find their length using the object 
property length. 
* A Java array variable can also be declared like other variables with [] 
after the data type.
* The variables in the array are ordered, and each has an index beginning from 0.
* Java array can be also be used as a static field, a local variable, or a 
method parameter.
* The size of an array must be specified by int or short value and not long.
* The direct superclass of an array type is Object.
* Every array type implements the interfaces Cloneable and java.io.Serializable.

## One-Dimensional Arrays:

The general form of a one-dimensional array declaration is
```
type var-name[];
```
```
type[] var-name;
```
### Instantiating an Array in Java

`var-name = new type [size];`

### Array Literal
In a situation where the size of the array and variables of the array are 
already known, array literals can be used.
```
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
// Declaring array literal
```
## Multidimensional Arrays

Multidimensional arrays are **arrays of arrays** with each element of the array 
holding the reference of other arrays. These are also known as Jagged Arrays. 
A multidimensional array is created by appending one set of square brackets ([]) 
per dimension.

```
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```

## Cloning of Arrays

When you clone a single-dimensional array, such as Object[], a 
“deep copy” is performed with the new array containing copies of the original 
array’s elements as opposed to references.

A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” 
however, which is to say that it creates only a single new array with each 
element array a reference to an original element array, but subarrays are shared. 