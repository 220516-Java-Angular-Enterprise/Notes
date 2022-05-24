# Keys

## Primary Key
First, a primary key uniquely identifies each record in a 
database table. Any individual key that does this can be called 
a candidate key, but only one can be chosen by database engineers 
as a primary key.
## Foreign Key
Meanwhile, if there is a key in a linked table, such as a 
buyer’s table that references the primary key, that will be a 
foreign key.

While a primary key and a composite key might do the same 
things, the primary key will consist of one column, where the 
composite key will consist of two or more columns.

The relationship between a primary key and a foreign key is 
quite different. The key thing to understand here is that the 
primary key in one database table becomes a foreign key in 
another database table, and vice versa.

A foreign key in a database table is taken from some other 
table and applied in order to link database records back to that 
foreign table.

The foreign key in the database table where it resides is 
actually the primary key of the other table.

Here's an example to make this clearer: If we have a database 
table labeled, say, "orders," and we have a foreign key that's 
labeled "customers," we could perhaps link that foreign key to 
a primary key, identifying each customer in a separate table.


## Composite Key
Next, there's the composite key, which is composed of two or 
more attributes that collectively uniquely identify each record.

An example would be a list of homes on a real estate market. 
In a well-ordered database, there should be a primary key 
that uniquely identifies each record.

How this works may have to do with the sophistication of the 
database.

In some cases, the homes may only be uniquely identified by a 
mortgage number — all other data (towns, streets, house numbers) 
is not unique to each record. The mortgage number would be the 
primary key. Suppose, however, that an MLS realtor’s listing 
technology assigns its own unique numbers to the records in the 
table.

Then, there will be two keys that developers might identify as 
“candidate keys”:

* The mortgage number.
* The MLS number.

One of them will qualify as the “primary key” in what some 
would consider an arbitrary way.

A composite key, then, would be the combination of two keys.

For example: the combination of house number and street might 
qualify as a composite key, given that the market listings are 
local. If so, then when someone searches using both the house 
number and the street, they should only get one single record 
returned.