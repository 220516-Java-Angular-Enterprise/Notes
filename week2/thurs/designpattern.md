# Design Patterns

## Singleton Design Pattern

Singleton pattern is one of the simplest design patterns in Java. 

This pattern involves a single class which is responsible to create an object 
while making sure that only single object gets created. This class provides a 
way to access its only object which can be accessed directly without need to 
instantiate the object of the class.

### Example
```
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();
    
    //make the constructor private so that this class cannot be instantiated
    private SingleObject(){}
    
    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
```

### Use of Singletons in Java

Singletons can be used while working with databases. They can be used to create a 
connection pool to access the database while reusing the same connection for all 
the clients.

## Factory Design Pattern

It is a design pattern which talks about the creation of an object. The factory 
design pattern says to define an interface and let the subclasses decide which 
object to instantiate. The factory method in the interface lets a class defer 
the instantiation to one or more concrete subclasses. It is one of the best ways 
to create an object where object creation logic is hidden to the client. 

### Implementation:
1. Define a factory method inside an interface.
2. Let the subclasses implement the above factory method and decide which 
object to create.

In Java constructors are not polymorphic, but by allowing subclass to 
create an object, we are adding polymorphic behavior to the instantiation.
In short, we are trying to achieve pseudo polymorphism by letting the subclass 
decide what to create.

### Example

1. Create Notification interface
```
public interface Notification {
void notifyUser();
```

2. Create all Implementation Classes

```
public class SMSNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}
```
```
public class EmailNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}
```

```
public class PushNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification");
    }
}
```

3. Create a factory class NotificationFactory.java to instantiate concrete class
```
public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
```
Now let’s use factory class to create and get an object of concrete class 
by passing some information.

```
public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
```

### Implemented Examples

This design pattern has been widely used in JDK, such as

1. `getInstance()` method of `java.util.Calendar`, `NumberFormat`, and `ResourceBundle` 
uses factory method design pattern.


2. All the wrapper classes like `Integer`, `Boolean` etc, in Java uses this 
pattern to evaluate the values using `valueOf()` method.


3. `java.nio.charset.Charset.forName()`, `java.sql.DriverManager#getConnection()`, 
`java.net.URL.openConnection()`, `java.lang.Class.newInstance()`, 
`java.lang.Class.forName()` are some of the example where factory method 
design pattern has been used.

## State Design Pattern

State design pattern is used when an Object changes its behavior based on its 
internal state.

If we have to change behavior of an object based on its state, we can have 
a state variable in the Object and use if-else condition block to perform 
different actions based on the state. State pattern is used to provide a 
systematic and lose-coupled way to achieve this through Context and State 
implementations.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/State-Design-Pattern-Diagram.png">

* **Context**: Defines an interface to client to interact. It maintains 
references to concrete state object which may be used to define current 
state of object.


* **State**: Defines interface for declaring what each concrete state should do.


* **ConcreteState**: Provides implementation for methods defined in State.

### Example of State Design Pattern

In below example, we have implemented a mobile state scenario. 
With respect to alerts, a mobile can be in different states. For example, 
vibration and silent. Based on this alert state, behavior of the mobile 
changes when an alert is to be done.

```
// Java program to demonstrate working of
// State Design Pattern

interface MobileAlertState
{
	public void alert(AlertStateContext ctx);
}

class AlertStateContext
{
	private MobileAlertState currentState;

	public AlertStateContext()
	{
		currentState = new Vibration();
	}

	public void setState(MobileAlertState state)
	{
		currentState = state;
	}

	public void alert()
	{
		currentState.alert(this);
	}
}

class Vibration implements MobileAlertState
{
	@Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("vibration...");
	}

}

class Silent implements MobileAlertState
{
	@Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("silent...");
	}

}

class StatePattern
{
	public static void main(String[] args)
	{
		AlertStateContext stateContext = new AlertStateContext();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();		
	}
}
```
#### Output
```
vibration...
vibration...
silent...
silent...
silent...
```

### Advantages of State Design Pattern

* With State pattern, the benefits of implementing polymorphic behavior are 
evident, and it is also easier to add states to support additional behavior.


* In the State design pattern, an object’s behavior is the result of the 
function of its state, and the behavior gets changed at runtime depending 
on the state. This removes the dependency on the if/else or switch/case 
conditional logic. For example, in the TV remote scenario, we could have 
also implemented the behavior by simply writing one class and method that 
will ask for a parameter and perform an action (switch the TV on/off) with 
an if/else block.


* The State design pattern also improves Cohesion since state-specific behaviors 
are aggregated into the ConcreteState classes, which are placed in one location 
in the code.

## Data Access Object(DAO) Pattern

Data Access Object Pattern or DAO pattern is used to separate low level 
data accessing API or operations from high level business services. 
Following are the participants in Data Access Object Pattern.


* **Data Access Object Interface** - This interface defines the standard operations 
to be performed on a model object(s).

* **Data Access Object concrete class** - This class implements above interface. 
This class is responsible to get data from a data source which can be 
database / xml or any other storage mechanism.

* **Model Object or Value Object** - This object is simple POJO containing get/set 
methods to store data retrieved using DAO class.

### Implementation
We are going to create a `Student` object acting as a Model or 
Value Object. `StudentDao` is Data Access Object Interface. `StudentDaoImpl` is 
concrete class implementing Data Access Object Interface. `DaoPatternDemo`, 
our demo class, will use `StudentDao` to demonstrate the use of Data Access 
Object pattern.

<img src="https://www.tutorialspoint.com/design_pattern/images/dao_pattern_uml_diagram.jpg">

#### Step 1
Create Value Object.

*Student.java*
```
public class Student {
   private String name;
   private int rollNo;

   Student(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
}
```

#### Step 2
Create Data Access Object Interface.

*StudentDao.java*

```
import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}
```

#### Step 3

Create concrete class implementing above interface.

*StudentDaoImpl.java*

```
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   //list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   //retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}
```

#### Step 4
Use the StudentDao to demonstrate Data Access Object pattern usage.

*DaoPatternDemo.java*

```
public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
   }
}
```

#### Step 5
Verify the output.

```
Student: [RollNo : 0, Name : Robert ]
Student: [RollNo : 1, Name : John ]
Student: Roll No 0, updated in the database
Student: [RollNo : 0, Name : Michael ]
```