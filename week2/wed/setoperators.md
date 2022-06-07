# Set Operations

## `UNION`

The SQL `UNION` clause/operator is used to combine the results of two or more 
`SELECT` statements without returning any duplicate rows.

To use this `UNION` clause, each `SELECT` statement must have:

* The same number of columns selected
* The same number of column expressions
* The same data type and
* Have them in the same order
* But they need not have to be in the same length.

### Example
Consider the following two tables.

**Table 1**− `CUSTOMERS` Table is as follows.

| ID  | NAME     | AGE | ADDRESS   | SALARY   |
|-----|----------|-----|-----------|----------|
| 1   | Ramesh   | 32  | Ahmedabad | 2000.00  |
| 2   | Khilan   | 25  | Delhi     | 1500.00  |
| 3   | kaushik  | 23  | Kota      | 2000.00  |
| 4   | Chaitali | 25  | Mumbai    | 6500.00  |
| 5   | Hardik   | 27  | Bhopal    | 8500.00  |
| 6   | Komal    | 22  | MP        | 4500.00  |
| 7   | Muffy    | 24  | Indore    | 10000.00 |

**Table 2** − `ORDERS` Table is as follows.


| OID | DATE                | CUSTOMER_ID | AMOUNT |
|-----|---------------------|-------------|--------|
| 102 | 2009-10-08 00:00:00 | 3           | 3000   |
| 100 | 2009-10-08 00:00:00 | 3           | 1500   |
| 101 | 2009-11-20 00:00:00 | 2           | 1560   |
| 103 | 2008-05-20 00:00:00 | 4           | 2060   |

Now, let us join these two tables in our `SELECT` statement as follows −
```
SELECT  ID, NAME, AMOUNT, DATE
FROM CUSTOMERS
LEFT JOIN ORDERS
ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID
UNION
SELECT  ID, NAME, AMOUNT, DATE
FROM CUSTOMERS
RIGHT JOIN ORDERS
ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;
```
This would produce the following result −


| ID  | NAME     | AMOUNT | DATE                |
|-----|----------|--------|---------------------|
| 1   | Ramesh   | NULL   | NULL                |
| 2   | Khilan   | 1560   | 2009-11-20 00:00:00 |
| 3   | kaushik  | 3000   | 2009-10-08 00:00:00 |
| 3   | kaushik  | 1500   | 2009-10-08 00:00:00 |
| 4   | Chaitali | 2060   | 2008-05-20 00:00:00 |
| 5   | Hardik   | NULL   | NULL                |
| 6   | Komal    | NULL   | NULL                |
| 7   | Muffy    | NULL   | NULL                |

## `UNION ALL`
The `UNION ALL` operator is used to combine the results of two `SELECT` statements 
including duplicate rows.

The same rules that apply to the UNION clause will apply to the `UNION ALL` operator.

**Syntax**

The basic syntax of the UNION ALL is as follows.
```
SELECT column1 [, column2 ]
FROM table1 [, table2 ]
[WHERE condition]

UNION ALL

SELECT column1 [, column2 ]
FROM table1 [, table2 ]
[WHERE condition]
```

## `INTERSECT`
The SQL `INTERSECT` clause/operator is used to combine two SELECT statements, but 
returns rows only from the first SELECT statement that are identical to a row in the 
second SELECT statement. This means INTERSECT returns only common rows returned by 
the two SELECT statements.

Just as with the `UNION` operator, the same rules apply when using the `INTERSECT`
operator.

**Syntax**

The basic syntax of `INTERSECT` is as follows.
```
SELECT column1 [, column2 ]
FROM table1 [, table2 ]
[WHERE condition]

INTERSECT

SELECT column1 [, column2 ]
FROM table1 [, table2 ]
[WHERE condition]
```
Here, the given condition could be any given expression based on your requirement.

### Example
Consider the following two tables.

**Table 1** − `CUSTOMERS` Table is as follows

| ID  | NAME     | AGE | ADDRESS   | SALARY   |
|-----|----------|-----|-----------|----------|
| 1   | Ramesh   | 32  | Ahmedabad | 2000.00  |
| 2   | Khilan   | 25  | Delhi     | 1500.00  |
| 3   | kaushik  | 23  | Kota      | 2000.00  |
| 4   | Chaitali | 25  | Mumbai    | 6500.00  |
| 5   | Hardik   | 27  | Bhopal    | 8500.00  |
| 6   | Komal    | 22  | MP        | 4500.00  |
| 7   | Muffy    | 24  | Indore    | 10000.00 |


**Table 2** − `ORDERS` Table is as follows.

| OID | DATE                | CUSTOMER_ID | AMOUNT |
|-----|---------------------|-------------|--------|
| 102 | 2009-10-08 00:00:00 | 3           | 3000   |
| 100 | 2009-10-08 00:00:00 | 3           | 1500   |
| 101 | 2009-11-20 00:00:00 | 2           | 1560   |
| 103 | 2008-05-20 00:00:00 | 4           | 2060   |

Now, let us join these two tables in our `SELECT` statement as follows.
```
SQL> SELECT  ID, NAME, AMOUNT, DATE
FROM CUSTOMERS
LEFT JOIN ORDERS
ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID

INTERSECT

SELECT  ID, NAME, AMOUNT, DATE
FROM CUSTOMERS
RIGHT JOIN ORDERS
ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;
```
This would produce the following result.

| ID  | NAME    | AMOUNT | DATE                |
|-----|---------|--------|---------------------|
| 3   | kaushik | 3000   | 2009-10-08 00:00:00 |
| 3   | kaushik | 1500   | 2009-10-08 00:00:00 |
| 2   | Ramesh  | 1560   | 2009-11-20 00:00:00 |
| 4   | kaushik | 2060   | 2008-05-20 00:00:00 |

## `EXCEPT`

The SQL `EXCEPT` clause/operator is used to combine two `SELECT` statements and returns 
rows from the first `SELECT` statement that are not returned by the second `SELECT` statement. 
This means `EXCEPT` returns only rows, which are not available in the second `SELECT` statement.

Just as with the `UNION` operator, the same rules apply when using the `EXCEPT` operator.

**Syntax**

The basic syntax of `EXCEPT` is as follows.
```
SELECT column1 [, column2 ]
FROM table1 [, table2 ]
[WHERE condition]

EXCEPT

SELECT column1 [, column2 ]
FROM table1 [, table2 ]
[WHERE condition]
```

Here, the given condition could be any given expression based on your requirement.

### Example
Consider the following two tables.

**Table 1** − `CUSTOMERS` Table is as follows.

| ID  | NAME     | AGE | ADDRESS   | SALARY   |
|-----|----------|-----|-----------|----------|
| 1   | Ramesh   | 32  | Ahmedabad | 2000.00  |
| 2   | Khilan   | 25  | Delhi     | 1500.00  |
| 3   | kaushik  | 23  | Kota      | 2000.00  |
| 4   | Chaitali | 25  | Mumbai    | 6500.00  |
| 5   | Hardik   | 27  | Bhopal    | 8500.00  |
| 6   | Komal    | 22  | MP        | 4500.00  |
| 7   | Muffy    | 24  | Indore    | 10000.00 |

**Table 2** − `ORDERS` table is as follows.


| OID | DATE                | CUSTOMER_ID | AMOUNT |
|-----|---------------------|-------------|--------|
| 102 | 2009-10-08 00:00:00 | 3           | 3000   |
| 100 | 2009-10-08 00:00:00 | 3           | 1500   |
| 101 | 2009-11-20 00:00:00 | 2           | 1560   |
| 103 | 2008-05-20 00:00:00 | 4           | 2060   |

Now, let us join these two tables in our `SELECT` statement as shown below.
```
SELECT  ID, NAME, AMOUNT, DATE
FROM CUSTOMERS
LEFT JOIN ORDERS
ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID
EXCEPT
SELECT  ID, NAME, AMOUNT, DATE
FROM CUSTOMERS
RIGHT JOIN ORDERS
ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;
```
This would produce the following result.


| ID  | NAME   | AMOUNT | DATE |
|-----|--------|--------|------|
| 1   | Ramesh | NULL   | NULL |
| 5   | Hardik | NULL   | NULL |
| 6   | Komal  | NULL   | NULL |
| 7   | Muffy  | NULL   | NULL |
