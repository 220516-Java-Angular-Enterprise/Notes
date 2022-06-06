# Servlet API

A Servlet, in its most general form, is an instance of a class which 
implements the `javax.servlet.Servlet` interface. Most Servlets, however, 
extend one of the standard implementations of that interface, namely the 
classes `javax.servlet.GenericServlet` and `javax.servlet.http.HttpServlet`.

<img src="https://secureservercdn.net/160.153.137.14/97i.128.myftpupload.com/wp-content/uploads/2019/11/adv04.png">

The Java Servlet API is a class library for Servlets. Servlets are Java 
programs that run on the server and send response to the client. Two packages 
are available for Servlet programmers: 1) `javax.servlet` and 2) `javax.servlet.http`.

The first one contains basic classes and interfaces that we can use to write 
Servlets from the scratch. The second package, `javax.servlet.http`, offers 
more advanced classes and interfaces that extend classes and interfaces from 
the first package. It is much more convenient to program using the second package.

## Servlet Containers

A user can normally only request static webpages from a web server. If the 
user wants to read the web page based on his input, the basic idea of servlet 
container is using java to dynamically generate the web page on the server side. 
A servlet container is essentially a part of a web server that interacts 
with the servlets.

A servlet is a class that you will use to receive HTTP requests as methods 
and reply with stuff (usually HTML).

## Life Cycle of a Servlet

<img src="https://static.javatpoint.com/images/servletlife.jpg">

### Servlet class is loaded
   The `classloader` is responsible to load the servlet class. 
   The servlet class is loaded when the first request for the servlet is 
   received by the web container.

### Servlet instance is created
   The web container creates the instance of a servlet after loading the 
   servlet class. The servlet instance is created only once in the servlet 
   life cycle.

### init method is invoked
   The web container calls the `init` method only once after creating the 
   servlet instance. The `init` method is used to initialize the servlet. 
   It is the life cycle method of the `javax.servlet.Servlet` interface. 
   Syntax of the init method is given below:
   `public void init(ServletConfig config) throws ServletException`
### service method is invoked
   The web container calls the service method each time when request for 
   the servlet is received. If servlet is not initialized, it follows the 
   first three steps as described above then calls the service method. 
   If servlet is initialized, it calls the service method. Notice that 
   servlet is initialized only once. The syntax of the service method of 
   the Servlet interface is given below:
```
public void service(ServletRequest request, ServletResponse response)   
throws ServletException, IOException
```
### destroy method is invoked
   The web container calls the `destroy` method before removing the servlet 
   instance from the service. It gives the servlet an opportunity to clean 
   up any resource for example memory, thread etc. The syntax of the destroy 
   method of the Servlet interface is given below:

`public void destroy()`  