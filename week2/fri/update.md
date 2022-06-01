# Updating Data with JDBC
## Example
```
String sql = "UPDATE Registration SET age = 30 WHERE id in (100, 101)";
         
```

# Deleting Data with JDBC
## Example

```
String sql = "DELETE FROM Registration WHERE id = 101";
        
```

# Extracting Data from a ResultSet

```
//Creating a Statement object
Statement stmt = con.createStatement();
//Retrieving the data
ResultSet rs = stmt.executeQuery("select * from Dataset");
```