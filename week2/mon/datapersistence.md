# Data Persistence Basics

## Relational vs Non-Relational
A relational database stores data in tables and rows. 
A relational database works by linking information from multiple 
tables through the use of **keys**. A **key** is a unique
identifier which can be assigned to a row of data contained
within a table.

A non-relational database stores data. It uses a storage model
optimized for the specific requirements of the data being stored.

## Database Objects
A database object is any defined object in a database that is 
used to store or reference data. Anything which we make from 
`create` command is known as Database Object. It can be used to 
hold and manipulate the data.

## Schema
A schema represents the storage of data in a database.

### Physical Schema
A physical database schema specifies how the data is stored 
physically on a storage system or disk storage in the form 
of Files and Indices.

### Logical Schema
A logical database schema specifies all the logical constraints 
that need to be applied to the stored data. It defines the 
views, integrity constraints, and table. Here the term 
integrity constraints define the set of rules that are used 
by DBMS (Database Management System) to maintain the quality 
for insertion & update the data. The logical schema represents 
how the data is stored in the form of tables and how the 
attributes of a table are linked together.

## Tables, Columns, Rows
### Tables (relations)
Tables are the functional units within an RDBMS schema and 
the primary objects of interest when performing JOIN operations. 
Understanding how an RDBMS system organizes its data into 
entities, and potentially further into types or hierarchies, 
is the first step in choosing tables for an analysis. 

### Rows (tuples)
Each row from an RDBMS table is unique and represents 
an atomic unit of relevance.

### Columns (attributes)
Columns serve multiple functions within a table, the most 
important of which for DBIs are the enforcement of each 
row’s uniqueness, linkage to other tables, indexing, and — 
the most practical aspect — information about each row or its 
raw values/measurements.

## Data Constraints
Constraints are the rules enforced on the data columns of a 
table. These are used to limit the type of data that can go 
into a table. This ensures the accuracy and reliability of 
the data in the database.

Constraints could be either on a column level or a table level. 
The column level constraints are applied only to one column, 
whereas the table level constraints are applied to the whole table.

Following are some of the most commonly used constraints available 
in SQL.

### Table-Level Constraints

* PRIMARY KEY

Specifies the column or columns that uniquely identify a row 
in the table. NULL values are not allowed.

* UNIQUE

Specifies that values in the columns must be unique.

* FOREIGN KEY

Specifies that the values in the columns must correspond to values in referenced primary key or unique columns or that they are NULL.

Note: If the foreign key consists of multiple columns, and 
any column is NULL, the whole key is considered NULL. The 
insert is permitted no matter what is on the non-null columns.

* CHECK

Specifies a wide range of rules for values in the table.


### Column-Level Constraints
* NOT NULL

Specifies that this column cannot hold NULL values 
(constraints of this type are not nameable).

* PRIMARY KEY
Specifies the column that uniquely identifies a row in the table.
The identified columns must be defined as NOT NULL.

Note: If you attempt to add a primary key using ALTER TABLE and 
any of the columns included in the primary key contain null 
values, an error will be generated and the primary key will not 
be added. See ALTER TABLE statement for more information.

* UNIQUE

Specifies that values in the column must be unique.

* FOREIGN KEY

Specifies that the values in the column must correspond to 
values in a referenced primary key or unique key column or 
that they are NULL.

* CHECK

Specifies rules for values in the column.

Constraints can be specified when a table is created with the
`CREATE TABLE` statement or you can use the `ALTER TABLE` statement
to create constraints even after the table is created.

### Dropping Constraints
Any constraint that you have defined can be dropped using the 
`ALTER TABLE` command with the `DROP CONSTRAINT` option.

For example, to drop the primary key constraint in the `EMPLOYEES` 
table, you can use the following command.

`ALTER TABLE EMPLOYEES DROP CONSTRAINT EMPLOYEES_PK;`

Some implementations may provide shortcuts for dropping certain 
constraints. For example, to drop the primary key constraint 
for a table in Oracle, you can use the following command.

`ALTER TABLE EMPLOYEES DROP PRIMARY KEY;`

Some implementations allow you to disable constraints. 
Instead of permanently dropping a constraint from the database, 
you may want to temporarily disable the constraint and then 
enable it later.

### Integrity Constraints
Integrity constraints are used to ensure accuracy and 
consistency of the data in a relational database. Data 
integrity is handled in a relational database through the 
concept of referential integrity.

There are many types of integrity constraints that play a role 
in Referential Integrity (RI). These constraints include 
Primary Key, Foreign Key, Unique Constraints and other 
constraints which are mentioned above.

## Primary Keys: Natural vs Surrogate
There are two strategies for assigning keys to tables:

### Natural Keys

A natural key is one or more existing data 
attributes that are unique to the business concept. For example, a 
Customer table can have two candidates for keys such as 
CustomerNumber and SocialSecurityNumber.

The advantage of natural keys is that they exist already,
you don't need to introduce a new "unnatural" value to your
data schema. However, the disadvantage of natural keys is that
because they have business meaning they are effectively coupled
to your business: you may need to rework your key when your
business requirements change. For example, if your users decide
to make CustomerNumber alphanumeric instead of numeric then in
addition to updating the schema for the Customer table (which
is unavoidable) you would have to change every single table
where CustomerNumber is used as a foreign key.

### Surrogate keys 

One can introduce a new column, called a surrogate key, 
which is a key that has no business meaning. 


There are several advantages to surrogate keys. First, they 
aren't coupled to your business and therefore will be easier 
to maintain (assuming you pick a good implementation strategy). 
For example, if the Customer table instead used a surrogate 
key then the change would have been localized to just the 
Customer table itself. Second, a common key strategy across most, 
or better yet all, tables can reduce the amount of source code that 
you need to write, reducing the total cost of ownership (TCO) 
of the systems that you build. The fundamental disadvantage of 
surrogate keys is that they're often not "human-readable", 
making them difficult for end users to work with. The 
implication is that you might still need to implement 
alternate keys for searching, editing, and so on.

## SQL Data Types
Each column in a database table is required to have a name 
and a data type.

An SQL developer must decide what type of data that will 
be stored inside each column when creating a table. The 
data type is a guideline for SQL to understand what type of 
data is expected inside each column, and it also identifies 
how SQL will interact with the stored data.

In MySQL there are three main data types: string, numeric, and date and time.

<a href="https://www.w3schools.com/sql/sql_datatypes.asp">
SQL Data Types
</a>

