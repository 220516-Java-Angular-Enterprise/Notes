# Referential Integrity

Referential integrity refers to the accuracy and consistency 
of data within a relationship.

In relationships, data is linked between two or more tables. 
This is achieved by having the foreign key (in the associated 
table) reference a primary key value (in the primary – or 
parent – table). Because of this, we need to ensure that data 
on both sides of the relationship remain intact.


So, referential integrity requires that, **whenever a 
foreign key value is used it must reference a valid, 
existing primary key in the parent table**.

## Example
For example, if we delete row number 15 in a primary table, 
we need to be sure that there’s no foreign key in any related 
table with the value of 15. We should only be able to delete a 
primary key if there are no associated rows. Otherwise, we would 
end up with an **orphaned record**.

<img src=https://database.guide/wp-content/uploads/2016/05/referential-integrity-orphaned-record.png>

So referential integrity will prevent users from:

* Adding rows to a related table if there is no associated row 
in the primary table.


* Changing values in a primary table that result in orphaned 
records in a related table.


* Deleting rows from a primary table if there are matching 
related rows.