# Java: Reading From a Properties File

`Properties` is a subclass of `Hashtable` class, and it represents a persistent 
set of properties. `Properties` can be saved to a stream or loaded from a 
stream. Each key and its corresponding value in the property list is a string.

The Properties file can be used in Java to externalize the configuration 
and to store the key-value pairs. The `Properties.load()` method of `Properties` 
class is convenient to load `.properties` file in the form of key-value pairs.

## Example

### credentials.properties file
<img src="https://www.tutorialspoint.com/assets/questions/media/26664/propertiesfile.PNG">

```
import java.io.*;
import java.util.*;
public class ReadPropertiesFileTest {
   public static void main(String args[]) throws IOException {
      Properties prop = readPropertiesFile("credentials.properties");
      System.out.println("username: "+ prop.getProperty("username"));
      System.out.println("password: "+ prop.getProperty("password"));
   }
   public static Properties readPropertiesFile(String fileName) throws IOException {
      FileInputStream fis = null;
      Properties prop = null;
      try {
         fis = new FileInputStream(fileName);
         prop = new Properties();
         prop.load(fis);
      } catch(FileNotFoundException fnfe) {
         fnfe.printStackTrace();
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } finally {
         fis.close();
      }
      return prop;
   }
}
```

### Output
```
username: admin
password: admin@123
```
