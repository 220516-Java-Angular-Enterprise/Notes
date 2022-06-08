# Introduction to AWS

<br>

## What is AWS in simple terms?

<br>

AWS stands for Amazon Web Services, and it is a cloud service from Amazon, which provides services in the form of
building blocks, these building blocks can be used to create and deploy any type of application in the cloud.

These services or building blocks are designed to work with each other, and result in applications that are
sophisticated and highly scalable.

<br>

## What are the services provided by AWS?

<br>

- Computer
- Storage
- Database
- Migration
- Network and Content Delivery
- Management Tools
- Security & Identity Compliance
- Messaging

<br>

## AWS EC2

<br>

Amazon Elastic Compute Cloud (Amazon EC2) is a web service that provides secure, resizable compute capacity in the
cloud. It is designed to make web-scale cloud computing easier for developers. Amazon EC2’s simple web service interface
allows you to obtain and configure capacity with minimal friction. It provides you with complete control of your
computing resources and lets you run on Amazon’s proven computing environment.

<br>

## Why use AWS EC2?

<br>

### Reliable and Scalable Infrastructure

Increase or decrease capacity within minutes and provide 99.99% availability for each Amazon EC2 region.

### Secure Your Applications

Provide various security standards and features, reduce the risk of human error and eliminate the attack surface.

### Easy Migration

Get started quickly through AWS Migration Tools, AWS Managed Services, or Amazon Lightsail with the help from AWS
Professional Services, AWS Support and APN Partners.

### Flexible Pricing

Offer five pricing models to pay for Amazon EC2 instances: On-Demand, Savings Plans, Dedicated Hosts, Spot Instances and
Per Second Billing.

<br>

# RDS

<br>

## What is Amazon RDS?

<br>

Amazon Relational Database Service (RDS) is a managed SQL database service provided by AWS. Amazon RDS supports an array
of database engines to store and organize data. It also helps with relational database management tasks, such as data
migration, backup, recovery and patching.

Amazon RDS facilitates the deployment and maintenance of relational databases in the cloud. A cloud administrator uses
Amazon RDS to set up, operate, manage and scale a relational instance of a cloud database. Amazon RDS is not itself a
database, it is a service used to manage relational databases.

<br>

## How does Amazon RDS work?

<br>

Databases are used to store large quantities of data that applications can draw on to help them perform various
functions. A relational database uses tables to store data. It is called relational because it organizes data points
with defined relationships.

<br>

# Security Groups

<br>

A security group acts as a virtual firewall for your EC2 instances to control incoming and outgoing traffic. Inbound
rules control the incoming traffic to your instance, and outbound rules control the outgoing traffic from your instance.
When you launch an instance, you can specify one or more security groups. If you don't specify a security group, Amazon
EC2 uses the default security group.

You can add rules to each security group that allow traffic to or from its associated instances. You can modify the
rules for a security group at any time. New and modified rules are automatically applied to all instances that are
associated with the security group. When Amazon EC2 decides whether to allow traffic to reach an instance, it evaluates
all the rules from all the security groups that are associated with the instance.