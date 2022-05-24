# Multiplicity in Entity Relationships

There are four types of multiplicities: one-to-one, one-to-many, 
many-to-one, and many-to-many.

## One-to-one: 

Each entity instance is related to a single instance of another 
entity. For example, to model a physical warehouse in which each 
storage bin contains a single widget, StorageBin and Widget would 
have a one-to-one relationship. One-to-one relationships use the 
javax.persistence.OneToOne annotation on the corresponding 
persistent property or field.

## One-to-many: 

An entity instance can be related to multiple instances of the 
other entities. A sales order, for example, can have multiple 
line items. In the order application, Order would have a 
one-to-many relationship with LineItem. One-to-many relationships 
use the javax.persistence.OneToMany annotation on the 
corresponding persistent property or field.

## Many-to-one: 

Multiple instances of an entity can be related to a single 
instance of the other entity. This multiplicity is the opposite 
of a one-to-many relationship. In the example just mentioned, 
from the perspective of LineItem the relationship to Order is 
many-to-one. Many-to-one relationships use the javax.persistence.
ManyToOne annotation on the corresponding persistent property or 
field.

## Many-to-many: 

The entity instances can be related to multiple instances of 
each other. For example, in college each course has many 
students, and every student may take several courses. 
Therefore, in an enrollment application, Course and Student 
would have a many-to-many relationship. Many-to-many 
relationships use the javax.persistence.ManyToMany annotation 
on the corresponding persistent property or field.