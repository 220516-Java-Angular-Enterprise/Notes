# Transaction Isolation Levels

## Dirty Reads
A dirty read occurs when a transaction reads data that has 
not yet been committed. For example, suppose transaction 
1 updates a row. Transaction 2 reads the updated row before 
transaction 1 commits the update. If transaction 1 rolls 
back the change, transaction 2 will have read data that 
is considered never to have existed.

## Non-repeatable Reads 
A non-repeatable read occurs when a transaction reads the 
same row twice but gets different data each time. For 
example, suppose transaction 1 reads a row. Transaction 2 
updates or deletes that row and commits the update or delete. 
If transaction 1 rereads the row, it retrieves different row 
values or discovers that the row has been deleted.

## Phantom Reads
A phantom read is a row that matches the search criteria 
but is not initially seen. For example, suppose transaction 
1 reads a set of rows that satisfy some search criteria. 
Transaction 2 generates a new row (through either an update 
or an insert) that matches the search criteria for 
transaction 1. If transaction 1 re-executes the statement 
that reads the rows, it gets a different set of rows.

The four transaction isolation levels are defined in terms 
of these phenomena. In the following table, an "X" marks 
each phenomenon that can occur.

| Transaction isolation level | 	Dirty reads | 	Non-repeatable reads | 	Phantoms |
|-----------------------------|--------------|-----------------------|-----------|
| Read uncommitted            | 	X           | 	X                    | 	X        |
| Read committed              | 	--          | 	X                    | 	X        |
| Repeatable read             | 	--          | 	--                   | 	X        |
| Serializable                | 	--          | 	--                   | 	--       |

# Transaction Propagation

Any application involves a number of services or components 
making a call to other services or components. Transaction 
propagation indicates if any component or service will or 
will not participate in a transaction and how will it behave 
if the calling component/service already has or does not 
have a transaction created already.
