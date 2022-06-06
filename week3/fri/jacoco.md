# How to Generate Code Coverage Report with JaCoCo in Java Application

But what is Code Coverage and what is **JaCoCo**? Code Coverage is a software metric that 
is used to measure how many lines of our code are executed during automated tests. 
In other words, we can also say Code Coverage describes the percentage of code 
covered by automated tests, and it checks which parts of code run during the test suite 
and which don’t. 

**JaCoCo** stands for Java Code Coverage. It is a free code coverage library for Java, 
which has been created by the EclEmma team. It creates code coverage reports and 
integrates well with IDEs like IntelliJ IDEA, Eclipse IDE, etc. JaCoCo also integrates 
with CI/CD tools like Jenkins, Circle CI, etc., and project management tools like 
SonarQube, etc. So in this article, we are going to create a sample Java application 
and generate the code coverage report with the help of the JaCoCo maven plugin. 

## Step-By-Step Implementation

### Step 1
Create a simple Java application and write down some test cases inside the 
application using **Junit** or you can also use **Mockito**. 

### Step 2
Add the **JaCoCo** maven plugin to your **pom.xml** file.

The plugins for the **JaCoCo** is given below is as follows: 

```
<build>
		<plugins>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.5</version>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<!-- attached to Maven test phase -->
					<execution>
						<id>report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
</build>
```

Below is the updated code for the **pom.xml** file after adding the **JaCoCo** plugin.

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>org.example</groupId>
	<artifactId>mockito-demo</artifactId>
	<version>1.0-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.8.2</version>
		</dependency>
		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-all</artifactId>
			<version>2.0.2-beta</version>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.5</version>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<!-- attached to Maven test phase -->
					<execution>
						<id>report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

	<properties>
		<maven.compiler.source>11</maven.compiler.source>
		<maven.compiler.target>11</maven.compiler.target>
	</properties>

</project>
```

### Step 3
After adding the dependency click on the Maven option which is present 
on the right upper side as shown in the below image. Then select clean and test 
and then select the run button (Green color triangle). 

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220106000851/jacoco-1.png">

### Step 4
To get you code coverage report navigate to the 
`target > site > jacoco > index.html > right-click > Open In > Browser > And your 
preferred browser`. So basically `index.html` is your code coverage report file. 

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220106000846/jacoco-3.png">

So you can see your report will be shown like this and the percentage completely 
depends on how you have written the test cases. 

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220106000856/jacoco-4.png">

**Note:** The green color shows that all lines of code have been covered which means 
you have written the test cases for all the units. If you have encountered the 
yellow color line then partial code has been covered and if you have encountered 
with the red color then the code has not been covered. 

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220106000853/jacoco-5.png">

