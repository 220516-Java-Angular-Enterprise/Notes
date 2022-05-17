# CharSequence vs. String in Java

## CharSequence
   CharSequence is an interface that represents a sequence of 
   characters. Mutability is not enforced by this interface. 
   Therefore, both mutable and immutable classes implement this 
   interface.

Of course, an interface can't be instantiated directly; 
it needs an implementation to instantiate a variable:

```CharSequence charSequence = "baeldung";```

Here, charSequence is instantiated with a String. 
Instantiating other implementations:

```
CharSequence charSequence = new StringBuffer("baeldung");
CharSequence charSequence = new StringBuilder("baeldung");
```

## String

String is a sequence of characters in Java. It is an immutable 
class and one of the most frequently used types in Java. 
This class implements the CharSequence, Serializable, and 
Comparable<String> interfaces.

Below both instantiations create Strings with the same content. 
However, they are not equal to each other:

```
@Test
public void givenUsingString_whenInstantiatingString_thenWrong() {
    CharSequence firstString = "baeldung";
    String secondString = "baeldung";

    assertNotEquals(firstString, secondString);
}
```
