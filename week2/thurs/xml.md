# XML

## Elements

The XML elements are the basic building block of the 
XML document. It is used as a container to store text 
elements, attributes, media objects etc. Every XML 
documents contain at least one element whose scopes are 
delimited by start and end tags or in case of empty elements
it is delimited by an empty tag. 

**Syntax**:

`<element-name attributes> Contents...</element-name>`

* **element-name**: It is the name of element.
* **attributes**: The attributes are used to define the XML 
element property and these attributes are separated by 
white space. It associates the name with a value, which 
is a string of characters.

**Example**:
```
name="Geeks"
Here, Geeks represents the value of attribute
```

**Rules to define XML elements**: 
There are some rules to create XML elements which are 
given below:

* An element can contain alphanumeric values or characters. 
But only three special characters are required in the names
these are hyphen, underscore and period.


* Names are case-sensitive. It means lower case letters 
have different meaning and upper case characters have 
different meaning. For example address, Address, aDDress 
are different names.


* Both start and end tags for elements need to be same.
An element, which is a container, can contain text or 
elements

**Empty Elements**: An element in XML document which does 
not contain the content is known as Empty Element. The 
basic syntax of empty element in XML as follows:

`<elements-name attributename/>`

## Attributes

The XML attribute is a part of an XML element. The 
addition of attribute in XML element gives more precise 
properties of the element i.e, it enhances the 
properties of the XML element.

**Syntax**:

`<element_name attribute1 attribute2 ... > Contents... </element_name>`

In the above syntax element_name is the name of an 
element which can be any name. The attribute1, attribute2,
… is XML attribute having unique attribute name. Then in 
the content section, any message can be written and at 
the end, the element name is ended.

Below some examples are given which illustrate the above 
syntax:
**Example 1:**

`<text category = "message">Hello Geeks</text>`

In the above example, XML element is text, the category 
is the attribute name and message is the attribute value, 
Attribute name and its value always appear in pair. 
The attribute name is used without any quotation but 
attribute value is used in single ( ‘ ‘ ) or double 
quotation ( ” ” ).

**Example 2:**


`<text category = "message" purpose ="Greet">Hello Geeks</text>`

In the above example, two attribute is used with 
different name. So, in a single element multiple 
attribute is used having unique attribute name.

But if we use two distinct element then we can use the 
attribute having the same attribute name. This can be 
understood with the help of below example:

**Example 3:**
```
<text category = "message" >Hello Geeks.</text>
<text category = "message">How are you.</text>
```
### Attribute Types
There are three types of attributes described below:


* **String types Attribute:** This type of attribute takes 
any string literal as a value.


* **Enumerated Type Attribute:** This attribute is further
distributed in two types-

    * **Notation Type:** This attribute is used to declares that 
an element will be referenced to a notation which is 
declared somewhere else in the XML document.

    * **Enumeration:** This attribute is used to specify a 
particular list of values which match with attribute 
values.


* **Tokenized Type Attribute:** This attribute is further distributed in many types:

    * **ID:** This attribute is used to identify the element.

    * **IDREF:** This attribute is used to refer an ID which has 
already been named for another element.

    * **IDREFS:** This attribute is used to refer all IDs of an 
element.

    * **ENTITY:** This attribute is used to indicate the attribute 
which will represent an external entity used in the document.

    * **ENTITIES:** This attribute is used to indicate the 
attribute which will represent external entities used 
in the document.


### Rules for creating an attribute
There are some rules that should be followed while 
creating an attribute:

* An attribute should not repeat itself in a single start 
or empty-element tag.


* An attribute should be declared using the attribute-list 
declaration in the DTD (Document Type Definition).


* An attribute element is used without any quotation and 
the attribute value is used in a single (‘ ‘) or double 
quotation (” “).


* An attribute name and its value should always appear in pair.


* An attribute value should not contain direct or indirect 
entity references to external entities.

## Namespaces

XML Namespaces provide a method to avoid element name conflicts.

### Name Conflicts
In XML, element names are defined by the developer. 
This often results in a conflict when trying to mix 
XML documents from different XML applications.

This XML carries HTML table information:
```
<table>
  <tr>
    <td>Apples</td>
    <td>Bananas</td>
  </tr>
</table>
```
This XML carries information about a table 
(a piece of furniture):
```
<table>
  <name>African Coffee Table</name>
  <width>80</width>
  <length>120</length>
</table>
```
If these XML fragments were added together, there would 
be a name conflict. Both contain a `<table>` element, 
but the elements have different content and meaning.

A user or an XML application will not know how to handle 
these differences.

## Solving the Name Conflict Using a Prefix

Name conflicts in XML can easily be avoided using a 
name prefix.

This XML carries information about an HTML table, and 
a piece of furniture:
```
<h:table>
<h:tr>
<h:td>Apples</h:td>
<h:td>Bananas</h:td>
</h:tr>
</h:table>

<f:table>
<f:name>African Coffee Table</f:name>
<f:width>80</f:width>
<f:length>120</f:length>
</f:table>
```
In the example above, there will be no conflict because 
the two `<table>` elements have different names.

### XML Namespaces - The xmlns Attribute
When using prefixes in XML, a **namespace** for the 
prefix must be defined.

The namespace can be defined by a **xmlns** attribute in 
the start tag of an element.

The namespace declaration has the following syntax. 
`xmlns:prefix="URI"`.
```
<root>

<h:table xmlns:h="http://www.w3.org/TR/html4/">
<h:tr>
<h:td>Apples</h:td>
<h:td>Bananas</h:td>
</h:tr>
</h:table>

<f:table xmlns:f="https://www.w3schools.com/furniture">
<f:name>African Coffee Table</f:name>
<f:width>80</f:width>
<f:length>120</f:length>
</f:table>

</root>
```

In the example above:

The xmlns attribute in the first `<table>` element gives 
the h: prefix a qualified namespace.

The xmlns attribute in the second `<table>` element gives 
the f: prefix a qualified namespace.

When a namespace is defined for an element, all child 
elements with the same prefix are associated with the 
same namespace.

Namespaces can also be declared in the XML root element:
```
<root xmlns:h="http://www.w3.org/TR/html4/"
xmlns:f="https://www.w3schools.com/furniture">

<h:table>
<h:tr>
<h:td>Apples</h:td>
<h:td>Bananas</h:td>
</h:tr>
</h:table>

<f:table>
<f:name>African Coffee Table</f:name>
<f:width>80</f:width>
<f:length>120</f:length>
</f:table>

</root>
```

**Note:** The namespace URI is not used by the parser to look 
up information.

The purpose of using an URI is to give the namespace a 
unique name.

However, companies often use the namespace as a pointer 
to a web page containing namespace information.

### Uniform Resource Identifier (URI)
A **Uniform Resource Identifier (URI)** is a string of 
characters which identifies an Internet Resource.

The most common URI is the **Uniform Resource Locator** (URL) 
which identifies an Internet domain address. Another, 
not so common type of URI is the **Uniform Resource Name** (URN).

### Default Namespaces

Defining a default namespace for an element saves us 
from using prefixes in all the child elements. It has 
the following syntax:

`xmlns="namespaceURI"`

This XML carries HTML table information:
```
<table xmlns="http://www.w3.org/TR/html4/">
  <tr>
    <td>Apples</td>
    <td>Bananas</td>
  </tr>
</table>
```

This XML carries information about a piece of furniture:
```
<table xmlns="https://www.w3schools.com/furniture">
  <name>African Coffee Table</name>
  <width>80</width>
  <length>120</length>
</table>
```

## XML: Well-Formed Syntax

An XML document with correct syntax is called "Well Formed".

The syntax rules are:

* XML documents must have a root element
* XML elements must have a closing tag
* XML tags are case sensitive
* XML elements must be properly nested
* XML attribute values must be quoted

## Valid XML Documents
A "well-formed" XML document is not the same as a "valid" XML document.

A "valid" XML document must be well-formed. In addition, it must conform to a 
document type definition.

There are two different document type definitions that can be used with XML:

* DTD - The original Document Type Definition
* XML Schema - An XML-based alternative to DTD

A document type definition defines the rules and the legal elements and 
attributes for an XML document.