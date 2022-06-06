# Client-Server Communication with HTTP

<img src="https://hackernoon.com/_next/image?url=https%3A%2F%2Fcdn.hackernoon.com%2Fimages%2Fjot3yv6.jpg&w=1920&q=75">

## What is HTTP?

HTTP or HyperText Transfer Protocol, as the name suggests it is a protocol, 
it is a set of rules that the server needs to follow to transmit all kinds of 
files like images, text, audio, video, and other kinds over the world wide 
web (www).

The internet is made up of clients and servers. So when you are accessing 
the internet through a web client like browsers like Google Chrome, Mozilla, 
IE, etc. When you enter the name of any website you want to visit, you are 
sending a request to a web server. Suppose, you type amazon.in, you 
(the browser which is the web client) is requesting the web server and often requesting a bunch of documents from that server.

Maybe it is an HTML, CSS, images, video, JSON. You make a request and the 
server responds, that is the basic relationship. This request is made using 
the HTTP protocol. A protocol is just a set of rules or standards that everyone 
on the internet has agreed to.

This is the client-server request-response model. HTTP is an application layer 
protocol and usually communicates with the server using the Transmission 
Control Protocol (TCP).

## HTTP is Stateless

Each request is executed independently without any knowledge of the requests 
that were executed before it, which means once the transaction ends the 
connection between the browser and the server is lost. This could be a 
problem for certain websites where you need to have yourself authenticated to 
perform any transaction. But HTTP Cookies make this connection stateful by 
sending a cookie along with every HTTP request. Thus, your experience of 
browsing and performing any transaction over the internet becomes better and 
secure.

## HTTP Methods

### `GET`

`GET` requests are read only, they are used to read the data, retrieve it, 
and return that to the client. It is the simplest among all the requests 
since it provides the required resource without any modifications.

### `POST`

`POST` requests are used to create or add a new item to the requested URL. 
For example, creating a new account or posting a new blog o medium. Based on 
your URL, it posts the data to a specific location. Once done, it responds 
with the status code 201 (CREATED), along with the location link of the 
posted data.

### `PUT`

`PUT` requests are used to modify or replace the current data with the requested 
data. For example, change the password on a website. It can also be used to 
create a new item like POST, but POST is used for that purpose.

### `DELETE`

`DELETE` request is used to delete all the data from the target location 
requested by the client. It is a risky operation because once deleted, 
it cannot be retrieved again.

If the above requests are a success, it returns the data asked by the client 
along with the status code 200 (SUCCESS). Else, returns with the status code 
404 (PAGE NOT FOUND) or returns status code 500 (Server error).

## HTTP Status Codes

<img src="https://hackernoon.com/_next/image?url=https%3A%2F%2Fhackernoon.com%2Fimages%2FpazJZnCJTqSZxQS4tltZo4Gatbo1-qjup3ybz.jpg&w=1920&q=75">

## Web Servers vs Web Clients

A web client is an application that communicates with a web server, 
using Hypertext Transfer Protocol (HTTP). The basic objective of the web 
server is to store, process and deliver web pages to the users. 

Web browser is an example of a web client. Web servers speak the HTTP 
protocol, so they are often called HTTP servers. These HTTP servers store the 
Internet’s data and provide the data when it is requested by HTTP clients.

