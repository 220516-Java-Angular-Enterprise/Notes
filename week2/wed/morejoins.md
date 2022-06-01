# More Joins

## <a href="https://www.tutorialspoint.com/dbms/database_joins.htm">Theta, Equi, and Natural Joins</a>

## Self Join
A self join is a regular join, but the table is joined with itself.
```
Self Join Syntax
SELECT column_name(s)
FROM table1 T1, table1 T2
WHERE condition;
```
T1 and T2 are different table aliases for the same table.

## Cross Join

The `CROSS JOIN` keyword returns all records from both tables (table1 and table2).

<img src="https://www.w3schools.com/mysql/img_crossjoin.png">

`CROSS JOIN` **Syntax**
```
SELECT column_name(s)
FROM table1
CROSS JOIN table2;
```
