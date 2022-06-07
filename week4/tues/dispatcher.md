# `RequestDispatcher` in Servlet

The `RequestDispatcher` interface provides the facility of dispatching the 
request to another resource it may be `html`, `servlet` or `jsp`. This interface 
can also be used to include the content of another resource also. It is one 
of the way of servlet collaboration.

There are two methods defined in the `RequestDispatcher` interface.

## Methods of `RequestDispatcher` interface
The `RequestDispatcher` interface provides two methods. They are:

### `public void forward(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException`
Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.

<img src="https://static.javatpoint.com/images/forward.JPG">

### `public void include(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException`
Includes the content of a resource (`servlet`, `JSP` page, or `HTML` file) in the response.

<img src="https://static.javatpoint.com/images/include.JPG">