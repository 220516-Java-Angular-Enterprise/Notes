### Tuesday 5/17
## Access Modifiers 
# Encapsulation
-Keeps things contained so that the user cannot change the code 
There are 4 access modifiers public, private , protected and default. 
Don't make classes private because the original class cannot access it. 
It is like having money and not being able to access it
All the components need to be able to talk to each other 
We use private for attributes and methods
We don't use private for constructors, because AGAIN it defeats the purpose.
# Why would we want to use private methods?
Because if we have a really long logic and helper methods you don't want to use expose the helper function to the UI. 
# Can Private Methods Be inherited by subclasses???
No it cannot be inherited. 
## DATA Structure
Structures that house data
# Why do we use data structures? 
We use data structures because it runs the program faster. And Optimizes technology. 
# What is the problem with Arrays?
They have a fixed size 
# What is the purpose of a set?
It takes in unique characters
# What is a wrapper class?
It turns data types into objects
There are 8 wrapper classes because there are 8 primitive data types 
Data structures only use wrapper classes because you have to turn the primitive data types into objects
-Data structures only work with objects 
Coding Game 
LeetCode
CodeWars
Hacker Rank

Set<Character> stringToSet(Strings){
Set<Character> set = new LinkedHashSet<>();
for(char c: s.toCharArray());

The downside of an enhanced for loop is 
Enhanced for loops are quicker. 
Make helper functions private. 

# Why don't arrays have parenthesis?
Because arrays are attributes and Strings have parameters.
Parameters need ()
 Method is a function/behavior 
Attributes are variables 
Classes are blueprints 



## Testing 
# Why should we test?
We know when our code works and what breaks our code 
We use JavaU testing 

Right click on class 
click on the methods you want to test 
Make a global unit 
assertEquals takes in 2 numbers (the expected, the actual)

Code coverage shows you your other code that you haven't covered. 
When you write tests you want to write multiple tests just because of false positives. 
Expected has to match the return output.
http://www.java2s.com/Tutorial/Java/0200__Generics/Genericmethodmaximumreturnsthelargestofthreeobjects.htm
https://beginnersbook.com/2014/07/java-finding-minimum-and-maximum-values-in-an-array/




