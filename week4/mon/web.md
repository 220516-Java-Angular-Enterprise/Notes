# The Web

## URL, URI, and URN

**URI** stands for Uniform Resource Identifier. URI is a sequence of characters 
used to identify a resource location, a name or both over the World Wide Web. 
A URI can be further classified as a locator, a name, or both.

Syntax of URI: Starts with a scheme followed by a colon character, and then 
by a scheme-specific part.

The most popular URI schemes, are `HTTP`, `HTTPS`, and `FTP`.

**URL** stands for Uniform Resource Location. URL is a subset of URI that 
describes the network address or location where the source is available.
URL begins with the name of the protocol to be used for accessing the resource 
and then a specific resource location. 

URLs build on the Domain Name Service (DNS) to address hosts symbolically and 
use a file-path-like syntax to identify specific resources at a given host. 
For this reason, mapping URLs to physical resources is straightforward and is 
implemented by various Web browsers.

**URN** stands for Uniform Resource Name. It is a URI that uses a URN scheme.

“urn” scheme: It is followed by a namespace identifier, followed by a colon, 
followed by namespace specific string.

URN does not imply the availability of the identified resource.URNs are 
location-independent resource identifiers and are designed to make it easy to 
map other namespaces into URN space.

| No  | 	URI                                                                                | 	URL	                                                                                  | URN                                          |
|-----|-------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------|
| 1	  | URI stands for Uniform Resource Identifier                                          | 	URL stands for Uniform Resource Location                                              | 	URN stands for Uniform Resource Name        |
| 2	  | URI is a superset of URL & URN                                                      | 	URL is a subset of the Uniform Resource	                                              | URN  is a subset of the Uniform Resource.    |
| 3	  | It used to identify a resource on the internet either by location or a name or both | 	It is used to identify a resource on the internet either by location                  | 	It uniquely identifies the resource by name |
| 4	  | URI is not always a URL                                                             | 	All URLs are URIs                                                                     | 	All URNs are URIs                           |
| 5	  | URI includes components like scheme, authority, path, query, etc.                   | 	URL includes protocol,domain,path,hash,query,string etc                               | 	URN does not include any component          |
| 6   | Example: https://www.geeksforgeeks.org/setting-environment-java/?ref=lbp            | Example: https%3A%2F%2Fwww.geeksforgeeks.org%2Fsetting-environment-java%2F%3Fref%3Dlbp | Example:setting up the environment in java   |

Here is a diagram that shows the relationship between URL, URI, URN:

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20220113133700/uriurlurn.jpg">




