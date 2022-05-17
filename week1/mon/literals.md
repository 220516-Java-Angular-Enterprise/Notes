# Literals in Java
Literal in Java is a synthetic representation of boolean, numeric, 
character, or string data. It is a means of expressing particular 
values in the program, such as an integer variable named ‘’/count 
is assigned an integer value in the following statement.

`int count = 0;`

Literals in Java can be classified into six types, as below:

* Integral Literals
* Floating-point Literals
* Char Literals
* String Literals
* Boolean Literals
* Null Literals

## 1. Integral Literals
   Integral literals are specified in four different ways, as follows:

### Decimal: 
It has base ten, and digits from 0 to 9.

For example,

Int x = 108;

### Octal: 
It has base eight and allows digits from 0 to 7. 
While assigning an octal literal in the Java code, a number must 
have a prefix 0.

For example,

int x = 0745;

### Hexadecimal:

It has base 16. Hexadecimal allows digits from 0 to 9, and 
characters from A to F. Even though Java is case sensitive, 
and it also provides an exception for using either uppercase 
or lowercase characters in the code for hexadecimal literals.

For example,

int x = 0X123Fadd;

### Binary:

It can be specified in binary literals, that is 0 and 1 with a 
prefix 0b or 0B.

For example,

int x = 0b1011;

## 2. Floating-Point Literals
Floating-point literals can be expressed using only decimal 
fractions or as exponential notation.

For example,

decimalNumber = 89d;

decimalNumber = 3.14159e0;

decimalNumber = 1.0e-6D;

Floating-point literals can indicate a positive or negative value, 
leading + or – sign respectively. If not specified, the value is 
always considered positive. It can be represented in the following 
formats:

-Integer digits (representing digits 0 through 9) followed by 
either a suffix or an exponent to distinguish it from an integral 
literal.

-Integer digit.

-integer digit. integer digit

– integer digit

An optional exponent of the form might be as below:

-an optional exponent sign + or –

-the exponent indicator e or E

–integer digit representing the integer exponent value

An optional floating-point suffix might be as below:

Single precision (4 bytes) floating-point number indicating either 
for F

Double precision (8 bytes) floating-point number indicating d or D

## 3. Char Literals
   Character (Char) literals have the type char and are an 
   unsigned integer primitive type. They are constant value 
   character expressions in the Java program. These are sixteen-bit 
   Unicode characters that range from 0 to 65535. Char literals 
   are expressed as a single quote, a single closing quote, and 
   the character in Java.

Char literals are specified in four different ways, as given below:

### Single quote: 
Java literal is specified to a char data type as a single 
character enclosed in a single quote.

For example,

char ch = ‘a’;

### Char Literal: 
Java literal is specified as an integer literal 
representing the Unicode value of a char. This integer can 
be specified in octal, decimal, and hexadecimal, ranging from 
0 to 65535.

For example,

char ch = 062;

### Escape Sequence: 
Every escape char can be specified as char literal.

For example,

char ch = ‘\n’;

### Unicode Representation: 
Java literal is specified in Unicode representation ‘\uzzz’, where 
zzzz are four hexadecimal numbers.

For example,

char ch = ‘\u0061’;

## 4. String Literals
A sequence of (zero or more including Unicode characters) 
characters within double quotes is referred to as string literals.

For example,

String s = “Hello”;

String literals may not have unescaped line feed or newline characters, but the Java compiler always evaluates compile-time expressions. Unicode escape sequences or special characters can be used within the string and character literal as backlash characters to escape special characters, as shown in the table below:

|Name 	|Character	|ASCII	| Hex   |
|---|---|---|-------|
|Single quote|	\’|	39| 	0x27 |
|Double quote|	\”|	34| 	0x22 |
|Carriage control|	\r|	13| 	0xd  |
|Backlash| 	\\|	92| 	0x5c |
|Newline| 	\n|	10| 	0x0a |
|NUL character|	\0|	0| 	0x00 |
|Backspace|	\b|	8| 	0x08 |
|TAB|	\t|	9| 	0x09 |

## 5. Boolean Literals
Boolean literals allow only two values and thus are divided 
into two literals:

**True:** it represents a real boolean value

**False:** it represents a false boolean value

For example,

`boolean b = true;`

`boolean d = false;`

## 6. Null Literals
Null literal is a particular literal in Java representing a null 
value. This value refers to no object. Java throws 
NullPointerException. Null often describe the uninitialized state 
in the program. It is an error to attempt to dereference the null 
value.