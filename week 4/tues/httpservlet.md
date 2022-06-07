# HttpServlet Class In Java

`HttpServlet` is an abstract class, it comes under package 
`javax.servlet.http.HttpServlet`. To create a servlet the class must extend 
the `HttpServlet` class and override at least one of its methods 
(`doGet`, `doPost`, `doDelete`, `doPut`). The `HttpServlet` class extends the 
`GenericServlet` class and implements a `Serializable` interface.

**Constructor of `HttpServlet` Class**

`HttpServlet()`

This is an abstract class so, the constructor does nothing.

## Methods of `HttpServlet` Class

### 1. `doGet()` Method
* This method is used to handle the `GET` request on the server-side.
* This method also automatically supports `HTTP HEAD` 
(`HEAD` request is a `GET` request which returns nobody in response) request.
* The `GET` type request is usually used to preprocess a request.

**Modifier and Type:**  `protected void`

**Syntax:**

`protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

Parameters:

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `GET` request.
* `ServletException` – Use to handle the `GET` request.

### 2. `doPost()` Method
* This method is used to handle the `POST` request on the server-side.
* This method allows the client to send data of unlimited length to the webserver at a time.
* The `POST` type request is usually used to post-process a request.

**Modifier and Type:**  `protected void`

**Syntax:**

`protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `POST` request.
* `ServletException` – Use to handle the `POST` request.


### 3. `doHead()` Method
* This method is overridden to handle the `HEAD` request.
* In this method, the response contains the only header but does not contain the message body.
* This method is used to improve performance (avoid computing response body).
   
**Modifier and Type:** `protected void`

**Syntax:**

`protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `HEAD` request.
* `ServletException` – Use to handle the `HEAD` request.

### 4. `doPut()` Method
* This method is overridden to handle the `PUT` request.
* This method allows the client to store the information on the server(to save the image file on the server).
* This method is called by the server (via the service method) to handle a `PUT` request.
   
**Modifier and Type:**  `protected void`

**Syntax:**

`protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `PUT` request.
* `ServletException` – Use to handle the `PUT` request.

### 5. `doDelete()` Method
* This method is overridden to handle the `DELETE` request.
* This method allows a client to remove a document or Web page from the server.
* While using this method, it may be useful to save a copy of the affected URL in temporary storage to avoid data loss.
   
**Modifier and Type:**  `protected void`

**Syntax:**

`protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `DELETE` request.
* `ServletException` – Use to handle the `DELETE` request.

### 6. `doOptions()` Method
* This method is overridden to handle the `OPTIONS` request.
* This method is used to determine which `HTTP` methods the server supports and returns an appropriate header.
   
**Modifier and Type:** `protected void`

**Syntax:**

`protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `OPTIONS` request.
* `ServletException` – Use to handle the `OPTIONS` request.

### 7. `doTrace()` Method
* This method is overridden to handle the `TRACE` request.
* This method returns the headers sent with the `TRACE` request to the client so that they can be used in debugging.
   
**Modifier and Type:**  `protected void`

**Syntax:**

`protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

`request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
`response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `TRACE` request.
* `ServletException` – Use to handle the `TRACE` request.

### 8. `getLastModified()` Method
* This method returns the time the `HttpServletRequest` object was last modified.
* If time is unknown the method will return a negative number.
* This method makes browser and proxy caches work more effectively.
* also reducing the load on server and network resources.
   
**Modifier and Type:** `protected long`

**Syntax:**

`protected long getLastModified(HttpServletRequest request)`

**Parameter:** 

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.

### 9. `service()` Method
This method receives standard HTTP requests from the public service method 
and dispatches them to the doXXX methods defined in this class.

**Modifier and Type:** `protected void`

**Syntax:**

`protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `HTTP` request.
* `ServletException` – Use to handle the `HTTP` request.

### 10. `service()` Method
This method is used to dispatch client requests to the protected service method.

**Modifier and Type:** `public void`

**Syntax:**

`public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException`

**Parameters:**

* `request` – an `HttpServletRequest` object that contains the request the client has made of the servlet.
* `response` – an `HttpServletResponse` object that contains the response the servlet sends to the client.

**Exceptions:**

* `IOException` – if an input or output error is detected when the servlet handles the `HTTP` request.
* `ServletException` – Use to handle the `HTTP` request.