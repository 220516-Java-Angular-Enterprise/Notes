# Primitive Java Data Types

The eight primitives defined in Java are *int, byte, short, long, float, 
double, boolean and char*. These aren't considered objects and 
represent raw values.

They're stored **directly on the stack** (check out this article 
for more information about memory management in Java).

<img src=https://2.bp.blogspot.com/-3y_BWimrMYA/W8LeDu8HNwI/AAAAAAAAETo/ojpo7dHnRNQNvYrCbMtdBXK3SctT24qyQCLcBGAs/s1600/primitive-data-types.PNG>

## Java Wrapper Classes
Wrapper classes provide a way to use primitive data types (`int`, `boolean`, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

|Primitive Data Type|Wrapper Class|
|---|---|
|byte|	Byte|
|short|	Short|
|int|	Integer|
|long|	Long|
|float|	Float|
|boolean|	Boolean|
|char|	Character|

Sometimes you must use wrapper classes, for example when working 
with Collection objects, such as ArrayList, where primitive types 
cannot be used.