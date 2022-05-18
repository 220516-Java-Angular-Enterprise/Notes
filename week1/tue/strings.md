# Java.lang.String Class

The **java.lang.String** class represents character strings. All string literals 
in Java programs, such as "abc", are implemented as instances of this 
class.Strings are constant, their values cannot be changed after they are created

## Class Declaration

```
public final class String
   extends Object
      implements Serializable, Comparable<String>, CharSequence
```
## Class Constructors

| Constructor                                                           | Description                                                                                                                                                                                      |
|-----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **String()**                                                          | This initializes a newly created String object so that it represents an empty character sequence.                                                                                                |
| **String(byte[ ] bytes)**                                             | This constructs a new String by decoding the specified array of bytes using the platform's default charset.                                                                                      |
| **String(byte[ ] bytes, Charset charset)**                            | This constructs a new String by decoding the specified array of bytes using the specified charset.                                                                                               |
| **String(byte[ ] bytes, int offset, int length)**                     | This constructs a new String by decoding the specified subarray of bytes using the platform's default charset                                                                                    |
| **String(byte[ ] bytes, int offset, int length, Charset charset)**    | This constructs a new String by decoding the specified subarray of bytes using the specified charset.                                                                                            |
| **String(byte[ ] bytes, int offset, int length, String charsetName)** | This constructs a new String by decoding the specified subarray of bytes using the specified charset.                                                                                            |
| **String(byte[ ] bytes, String charsetName)**                         | This constructs a new String by decoding the specified array of bytes using the specified charset.                                                                                               |
| **String(char[ ] value)**                                             | This allocates a new String so that it represents the sequence of characters currently contained in the character array argument.                                                                |
| **String(char[ ] value, int offset, int count)**                      | This allocates a new String that contains characters from a subarray of the character array argument.                                                                                            |
| **String(int[ ] codePoints, int offset, int count)**                  | This allocates a new String that contains characters from a subarray of the Unicode code point array argument.                                                                                   |
| **String(String original)**                                           | This initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string. |
| **String(StringBuffer buffer)**                                       | This allocates a new string that contains the sequence of characters currently contained in the string buffer argument.                                                                          |
| **String(StringBuilder builder)**                                     | This allocates a new string that contains the sequence of characters currently contained in the string builder argument.                                                                         |

## Class Methods

| Method                                                            | Description                                                                                                    |
|-------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| **char charAt(int index)**                                        | This method returns the char value at the specified index.                                                     |
| **int compareTo(String anotherString)**                           | This method compares two strings lexicographically.                                                            |
| **int compareToIgnoreCase(String str)**                           | This method compares two strings lexicographically, ignoring case differences.                                 |
| **String concat(String str)**                                     | This method concatenates the specified string to the end of this string.                                       |
| **boolean contains(CharSequence s)**                              | This method ceturns true if and only if this string contains the specified sequence of char values.            |
| **boolean endsWith(String suffix)**                               | This method tests if this string ends with the specified suffix.                                               |
| **boolean equals(Object anObject)**                               | This method compares this string to the specified object.                                                      |
| **boolean equalsIgnoreCase(String anotherString)**                | This method compares this String to another String, ignoring case considerations.                              |
| **static String format(Locale l, String format, Object... args)** | This method returns a formatted string using the specified locale, format string, and arguments.               |
| **int hashCode()**                                                | This method returns a hash code for this string.                                                               |
| **int indexOf(int ch)**                                           | This method returns the index within this string of the first occurrence of the specified character.           |
| **boolean isEmpty()**                                             | This method returns true if, and only if, length() is 0.                                                       |
| **int lastIndexOf(int ch)**                                       | This method returns the index within this string of the last occurrence of the specified character.            |
| **int length()**                                                  | This method returns the length of this string.                                                                 |
| **String substring(int beginIndex)**                              | This method returns a new string that is a substring of this string.                                           |
| **String substring(int beginIndex, int endIndex)**                | This method returns a new string that is a substring of this string.                                           |
| **char[] toCharArray()**                                          | This method converts this string to a new character array.                                                     |
| **String toLowerCase()**                                          | This method converts all of the characters in this String to lower case using the rules of the default locale. |
| **String toUpperCase()**                                          | This method converts all of the characters in this String to upper case using the rules of the default locale. |
| **String toString()**                                             | This method returns the string itself.                                                                         |
| **static String valueOf(primitive arg)**                          | This method returns the string representation of the object argument.                                          |


## StringBuffer Class in Java

**StringBuffer** is a peer class of **String** that provides much of the functionality 
of strings. The string represents fixed-length, immutable character sequences 
while **StringBuffer** represents growable and writable character sequences. 
**StringBuffer** may have characters and substrings inserted in the middle or 
appended to the end. It will automatically grow to make room for such additions 
and often has more characters pre-allocated than are actually needed, to allow 
room for growth.


### Constructors of StringBuffer Class

* `StringBuffer()`: It reserves room for 16 characters without reallocation


* `StringBuffer(int size)`: It accepts an integer argument that explicitly sets 
the size of the buffer.


* `StringBuffer(String str)`: It accepts a string argument that sets the 
initial contents of the StringBuffer object and reserves room for 16 more 
characters without reallocation.


### Methods of StringBuffer Class

| Methods              | 	Action Performed                                                            |
|----------------------|------------------------------------------------------------------------------|
| **append()**         | 	Used to add text at the end of the existing text.                           |
| **length()**         | 	The length of a StringBuffer can be found by the length( ) method           |
| **capacity()**       | 	the total allocated capacity can be found by the capacity( ) method         |
| **charAt()**         | 	Returns the character at given index                                        |
| **delete()**         | 	Deletes a sequence of characters from the invoking object                   |
| **deleteCharAt()**   | 	Deletes the character at the index specified by loc                         |
| **ensureCapacity()** | 	Ensures capacity is at least equals to the given minimum.                   |
| **insert()**         | 	Inserts text at the specified index position                                |
| **length()**         | 	Returns length of the string                                                |
| **reverse()**        | 	Reverse the characters within a StringBuffer object                         |
| **replace()**        | 	Replace one set of characters with another set inside a StringBuffer object |


## StringBuilder Class in Java

The **StringBuilder** in Java represents a mutable sequence of characters. 
Since the **String** Class in Java creates an immutable sequence of characters, 
the **StringBuilder** class provides an alternative to **String** Class, as it creates 
a mutable sequence of characters. 

The function of **StringBuilder** is very much 
similar to the **StringBuffer** class, as both of them provide an alternative to 
**String** Class by making a mutable sequence of characters. However, the **StringBuilder**
class differs from the **StringBuffer** class on the basis of synchronization. The 
StringBuilder class provides no guarantee of synchronization whereas the **StringBuffer** 
class does. Therefore, this class is designed for use as a drop-in replacement 
for **StringBuffer** in places where the **StringBuffer** was being used by a single 
thread (as is generally the case). 

Where possible, it is recommended that this 
class be used in preference to **StringBuffer** as it will be faster under most 
implementations. Instances of **StringBuilder** are not safe for use by multiple 
threads. If such synchronization is required then it is recommended that 
**StringBuffer** be used.

### Constructors in Java StringBuilder:


* `StringBuilder()`: Constructs a string builder with no characters in it and 
an initial capacity of 16 characters.


* `StringBuilder(int capacity)`: Constructs a string builder with no characters 
in it and an initial capacity specified by the capacity argument.


* `StringBuilder(CharSequence seq)`: Constructs a string builder that contains 
the same characters as the specified CharSequence.


* `StringBuilder(String str)`: Constructs a string builder initialized to the 
contents of the specified string. 


### Methods in Java StringBuilder:

* `StringBuilder append(X x)`: This method appends the string representation 
of the X type argument to the sequence.


* `int capacity()`: This method returns the current capacity.


* `char charAt(int index)`: This method returns the char value in this sequence 
at the specified index.


* `StringBuilder delete(int start, int end)`: This method removes the characters 
in a substring of this sequence.


* `StringBuilder deleteCharAt(int index)`: This method removes the char at the 
specified position in this sequence.


* `void ensureCapacity(int minimumCapacity)`: This method ensures that the capacity 
is at least equal to the specified minimum.


* `void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)`: This method 
characters are copied from this sequence into the destination character array dst.


* `int indexOf()`: This method returns the index within this string of the 
first occurrence of the specified substring.


* `StringBuilder insert(int offset, boolean b)`: This method inserts the string 
representation of the boolean argument into this sequence.


* `StringBuilder insert()`: This method inserts the string representation of the 
char argument into this sequence.


* `int lastIndexOf()`: This method returns the index within this string of the 
last occurrence of the specified substring.


* `int length()`: This method returns the length (character count).


* `StringBuilder replace(int start, int end, String str)`: This method replaces 
the characters in a substring of this sequence with characters in the specified String.


* `StringBuilder reverse()`: This method causes this character sequence to be 
replaced by the reverse of the sequence.


* `void setCharAt(int index, char ch)`: In this method, the character at the specified 
index is set to ch.


* `void setLength(int newLength)`: This method sets the length of the character sequence.


* `CharSequence subSequence(int start, int end)`: This method returns a new 
character sequence that is a subsequence of this sequence.


* `String substring()`: This method returns a new String that contains a 
subsequence of characters currently contained in this character sequence.


* `String toString()`: This method returns a string representing the data in 
this sequence.