# What is Normalization?

Normalization is a database design technique that reduces data 
redundancy and eliminates undesirable characteristics like 
Insertion, Update and Deletion Anomalies. Normalization rules 
divides larger tables into smaller tables and links them using 
relationships. The purpose of Normalisation in SQL is to 
eliminate redundant (repetitive) data and ensure data is 
stored logically.

## 1NF (First Normal Form) Rules
* Each table cell should contain a single value.
* Each record needs to be unique.

## 2NF (Second Normal Form) Rules
* Be in 1NF
* Single Column Primary Key that does not functionally 
depend on any subset of candidate key relation
  
## What are transitive functional dependencies?
A transitive functional dependency is when changing a 
non-key column, might cause any of the other non-key columns 
to change

## 3NF (Third Normal Form) Rules
* Be in 2NF
* Has no transitive functional dependencies
  
## 4NF (Fourth Normal Form) Rules
If no database table instance contains two or more, independent 
and multivalued data describing the relevant entity, then it 
is in 4th Normal Form.

## 5NF (Fifth Normal Form) Rules
A table is in 5th Normal Form only if it is in 4NF and it 
cannot be decomposed into any number of smaller tables without 
loss of data.

## 6NF (Sixth Normal Form) Proposed
6th Normal Form is not standardized, yet however, it is being 
discussed by database experts for some time.

## Denormalization in Databases

Denormalization is a database optimization technique in which 
we add redundant data to one or more tables. This can help 
us avoid costly joins in a relational database. Note that 
denormalization does not mean not doing normalization. It 
is an optimization technique that is applied after doing 
normalization.

In a traditional normalized database, we store data in separate 
logical tables and attempt to minimize redundant data. We 
may strive to have only one copy of each piece of data in 
database.

For example, in a normalized database, we might have a 
Courses table and a Teachers table. Each entry in Courses 
would store the teacherID for a Course but not the teacherName. 
When we need to retrieve a list of all Courses with the 
Teacher’s name, we would do a join between these two tables.

In some ways, this is great; if a teacher changes his or her 
name, we only have to update the name in one place.
The drawback is that if tables are large, we may spend an 
unnecessarily long time doing joins on tables.
Denormalization, then, strikes a different compromise. Under 
denormalization, we decide that we’re okay with some 
redundancy and some extra effort to update the database in 
order to get the efficiency advantages of fewer joins.

### Pros of Denormalization:

* Retrieving data is faster since we do fewer joins
* Queries to retrieve can be simpler(and therefore less likely 
to have bugs), since we need to look at fewer tables.

### Cons of Denormalization:-

* Updates and inserts are more expensive.
* Denormalization can make update and insert code harder to write.
* Data may be inconsistent . Which is the “correct” value for a 
piece of data?
* Data redundancy necessitates more storage.

In a system that demands scalability, like that of any 
major tech company, we almost always use elements of both 
normalized and denormalized databases.