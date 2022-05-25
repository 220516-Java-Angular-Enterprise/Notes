# SQL: Views

Views in SQL are kind of virtual tables. A view also has rows and columns as 
they are in a real table in the database. We can create a view by selecting fields from 
one or more tables present in the database. A View can either have all the rows of a 
table or specific rows based on certain condition.

We can create View using `CREATE VIEW` statement. A View can be created from a single table 
or multiple tables.

**Syntax**:
````
CREATE VIEW view_name AS
SELECT column1, column2.....
FROM table_name
WHERE condition;

view_name: Name for the View
table_name: Name of the table
condition: Condition to select rows
````

## Updating Views

There are certain conditions needed to be satisfied to update a view. 
If any one of these conditions is not met, then we will not be allowed to update the view.

* The `SELECT` statement which is used to create the view should not include `GROUP BY` 
clause or `ORDER BY` clause.
* The `SELECT` statement should not have the `DISTINCT` keyword.
* The View should have all `NOT NULL` values.
* The view should not be created using nested queries or complex queries.
* The view should be created from a single table. If the view is created using multiple 
tables then we will not be allowed to update the view.

We can use the `CREATE OR REPLACE VIEW` statement to add or remove fields from a view.

**Syntax**:
````
CREATE OR REPLACE VIEW view_name AS
SELECT column1,coulmn2,..
FROM table_name
WHERE condition;
````

### Inserting a row in a view:
We can insert a row in a View in a same way as we do in a table. 
We can use the `INSERT INTO` statement of SQL to insert a row in a View.

**Syntax**:
````
INSERT INTO view_name(column1, column2 , column3,..)
VALUES(value1, value2, value3..);

view_name: Name of the View
````
### Deleting a row from a View:

Deleting rows from a view is also as simple as deleting rows from a table. We can use 
the `DELETE` statement of SQL to delete rows from a view. Also deleting a row from a 
view first delete the row from the actual table and the change is then reflected in 
the view.

**Syntax**:
````
DELETE FROM view_name
WHERE condition;

view_name:Name of view from where we want to delete rows
condition: Condition to select rows 
````