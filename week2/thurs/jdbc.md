# JDBC (Java Database Connectivity)

JDBC is an API(Application programming interface) used in java programming to 
interact with databases. The classes and interfaces of JDBC allow the application 
to send requests made by users to the specified database.

Enterprise applications created using the JAVA EE technology need to interact 
with databases to store application-specific information. So, interacting with a 
database requires efficient database connectivity, which can be achieved by using 
the ODBC(Open database connectivity) driver. This driver is used with JDBC 
to interact or communicate with various kinds of databases such as Oracle, 
MS Access, Mysql, and SQL server database.

## Components of JDBC
There are generally four main components of JDBC through which it can interact 
with a database. They are as mentioned below:

1. **JDBC API**: It provides various methods and interfaces for easy communication 
with the database. It provides two packages as follows, which contain the java SE 
and Java EE platforms to exhibit WORA(write once run everywhere) capabilities.

`java.sql.*;`

It also provides a standard to connect a database to a client application.

2. **JDBC Driver Manager**: It loads a database-specific driver in an application 
to establish a connection with a database. It is used to make a database-specific 
call to the database to process the user request.


3. **JDBC Test Suite**: It is used to test the operation(such as insertion, deletion, 
update) being performed by JDBC Drivers.


4. **JDBC-ODBC Bridge Drivers**: It connects database drivers to the database. 
This bridge translates the JDBC method call to the ODBC function call. It makes 
use of the sun.jdbc.odbc package which includes a native library to access ODBC 
characteristics.

### Architecture of JDBC
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200229213833/Architecture-of-JDBC2.jpg">

**Description:**

* **Application**: It is a java applet or a servlet that communicates with a data source.


* **The JDBC API**: The JDBC API allows Java programs to execute SQL statements and 
retrieve results. Some important classes and interfaces defined in JDBC 
API are as follows:


* **DriverManager**: It plays an important role in the JDBC architecture. It uses 
some database-specific drivers to effectively connect enterprise applications 
to databases.


* **JDBC Drivers**: To communicate with a data source through JDBC, you need a JDBC 
driver that intelligently communicates with the respective data source.

## JDBC Drivers

JDBC drivers are client-side adapters (installed on the client machine, not on 
the server) that convert requests from Java programs to a protocol that the DBMS 
can understand. There are 4 types of JDBC drivers:

1. Type-1 driver or JDBC-ODBC bridge driver
2. Type-2 driver or Native-API driver
3. Type-3 driver or Network Protocol driver
4. Type-4 driver or Thin driver

## JDBC Statement Types
| Interfaces	         | Recommended Use                                                                                                                                                      |
|---------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `Statement`         | 	Use this for general-purpose access to your database. Useful when you are using static SQL statements at runtime. The Statement interface cannot accept parameters. |
| `PreparedStatement` | 	Use this when you plan to use the SQL statements many times. The PreparedStatement interface accepts input parameters at runtime.                                   |
| `CallableStatement` | 	Use this when you want to access the database stored procedures. The CallableStatement interface can also accept runtime input parameters.                          |

### Statement Objects

#### Creating a Statement Object
Before you can use a Statement object to execute a SQL statement, 
you need to create one using the Connection object's createStatement( ) method, 
as in the following example:
```
Statement stmt = null;
try {
   stmt = conn.createStatement( );
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   . . .
}
```
Once you've created a Statement object, you can then use it to execute an 
SQL statement with one of its three execute methods.

* `boolean execute (String SQL)` - Returns a boolean value of true if a ResultSet 
object can be retrieved; otherwise, it returns false. Use this method to 
execute SQL DDL statements or when you need to use truly dynamic SQL.

* `int executeUpdate (String SQL)` − Returns the number of rows affected by the 
execution of the SQL statement. Use this method to execute SQL statements 
for which you expect to get a number of rows affected - for example, an 
INSERT, UPDATE, or DELETE statement.

* `ResultSet executeQuery (String SQL)` − Returns a ResultSet object. Use this 
method when you expect to get a result set, as you would with a SELECT statement.



#### Closing Statement Object
Just as you close a Connection object to save database resources, 
for the same reason you should also close the Statement object.

A simple call to the close() method will do the job. If you close the 
Connection object first, it will close the Statement object as well. 
However, you should always explicitly close the Statement object to 
ensure proper cleanup.

```
Statement stmt = null;
try {
   stmt = conn.createStatement( );
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   stmt.close();
}
```

### PreparedStatement Objects

The `PreparedStatement` interface extends the `Statement` interface, which 
gives you added functionality with a couple of advantages over a generic 
`Statement` object.

This statement gives you the flexibility of supplying arguments dynamically.

#### Creating PreparedStatement Object

```
PreparedStatement pstmt = null;
try {
   String SQL = "Update Employees SET age = ? WHERE id = ?";
   pstmt = conn.prepareStatement(SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   . . .
}
```

All parameters in JDBC are represented by the `?` symbol, which is known as 
the parameter marker. You must supply values for every parameter before 
executing the SQL statement.

The `setXXX()` methods bind values to the parameters, where `XXX` represents the 
Java data type of the value you wish to bind to the input parameter. If 
you forget to supply the values, you will receive an SQLException.

Each parameter marker is referred by its ordinal position. The first marker 
represents position 1, the next position 2, and so forth. This method differs 
from that of Java array indices, which starts at 0.

All the Statement object's methods for interacting with the database (a) 
`execute()`, (b) `executeQuery()`, and (c) `executeUpdate()` also work with the 
`PreparedStatement` object; however, the methods are modified to use `SQL`
statements that can input the parameters.

#### Closing PreparedStatement Object
Just as you close a `Statement` object, for the same reason you should also 
close the `PreparedStatement` object.

A simple call to the `close()` method will do the job. If you close the 
`Connection` object first, it will close the `PreparedStatement` object as well. 
However, you should always explicitly close the `PreparedStatement` object 
to ensure proper cleanup.

```
PreparedStatement pstmt = null;
try {
   String SQL = "Update Employees SET age = ? WHERE id = ?";
   pstmt = conn.prepareStatement(SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   pstmt.close();
}
```

### CallableStatement Objects

Just as a `Connection` object creates the `Statement` and `PreparedStatement` 
objects, it also creates the `CallableStatement` object, which would be used 
to execute a call to a database stored procedure.

#### Creating CallableStatement Object

Suppose, you need to execute the following Oracle stored procedure:
```
CREATE OR REPLACE PROCEDURE getEmpName
    (EMP_ID IN NUMBER, EMP_FIRST OUT VARCHAR) AS
BEGIN
    SELECT first INTO EMP_FIRST
    FROM Employees
    WHERE ID = EMP_ID;
END;
```

Three types of parameters exist: IN, OUT, and INOUT. The `PreparedStatement` 
object only uses the IN parameter. The `CallableStatement` object can use all 
the three.

| Parameter | 	Description                                                                                                                                             |
|-----------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| IN        | 	A parameter whose value is unknown when the `SQL` statement is created. You bind values to IN parameters with the `setXXX()` methods.                   |              
| OUT       | 	A parameter whose value is supplied by the `SQL` statement it returns. You retrieve values from the OUT parameters with the `getXXX()` methods.         |              
| INOUT     | 	A parameter that provides both input and output values. You bind variables with the `setXXX()` methods and retrieve values with the `getXXX()` methods. |              

The following code snippet shows how to employ the `Connection.prepareCall()` 
method to instantiate a `CallableStatement` object based on the preceding 
stored procedure:
```
CallableStatement cstmt = null;
try {
    String SQL = "{call getEmpName (?, ?)}";
    cstmt = conn.prepareCall (SQL);
. . .
}
catch (SQLException e) {
. . .
}
finally {
. . .
}
```

The String variable `SQL`, represents the stored procedure, with parameter 
placeholders.

Using the `CallableStatement` objects is much like using the `PreparedStatement` 
objects. You must bind values to all the parameters before executing the 
statement, or you will receive an `SQLException`.

If you have IN parameters, just follow the same rules and techniques that 
apply to a `PreparedStatement` object; use the `setXXX()` method that corresponds 
to the Java data type you are binding.

When you use OUT and INOUT parameters you must employ an additional 
`CallableStatement` method, `registerOutParameter()`. The `registerOutParameter()` 
method binds the JDBC data type, to the data type that the stored procedure 
is expected to return.

Once you call your stored procedure, you retrieve the value from the OUT 
parameter with the appropriate `getXXX()` method. This method casts the 
retrieved value of `SQL` type to a Java data type.

#### Closing CallableStatement Object
Just as you close other `Statement` object, for the same reason you should 
also close the `CallableStatement` object.

A simple call to the `close()` method will do the job. If you close the 
`Connection` object first, it will close the `CallableStatement` object as well. 
However, you should always explicitly close the `CallableStatement` object to 
ensure proper cleanup.
```
CallableStatement cstmt = null;
try {
   String SQL = "{call getEmpName (?, ?)}";
   cstmt = conn.prepareCall (SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   cstmt.close();
}

```

## Insert Data using JDBC

### Example

```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
   static final String USER = "guest";
   static final String PASS = "guest123";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
```