# Cyber Punk Design Bank
Project that integrates all Java, Spring Boot, JPA/Hibernate and SQL knowledge into a standard web services system.

Upon creating this project, I will use this space to document the business rules that were configured for the operation of this project.

# Documentation - Cyber Punk Design Bank:

## Introduction:
This system was created with the aim of putting into practice the knowledge acquired from technologies such as Java, Spring Boot, JPA, Hibernate and SQL. We modeled a simple system, but it helps us get a sense of the architecture and business rules, the concepts of which are present in any other web service system. In this case, we hope that the person trying to understand my project can really understand the fundamentals of these concepts that will be applied independently of the functionality of this system, which is a mere consequence of the applications of these fundamental concepts.

Throughout the documentation, in the explanations of the business rules, we will not only explain how it works, but we will also explain which techniques we use within the best practice that best optimizes the performance of this system and security.

## User entities and resource:

## H2 dataset, test profile, JPA:
The H2 dataset was used to link the sql database to the project. It's as if you were using cPanel, which is a mysql database service that can be linked to the IP address of a system in the form of a cloud.

## JPA repository, dependency injection, database seeding:

## Service layer, component registration:

## Order, Instant, ISO 8601:

## OrderStatus enum:

## Category:

## Many-to-many association with JoinTable:

## OrderItem, many-to-many association with extra attributes:

## Product-OrderItem one-to-many association:

## Payment, one-to-one association:

## Subtotal & Total methods:

## User Insert:

	{
		"name": "Bob Brown",
		"email": "bob@gmail.com",
		"phone": "977557755",
		"password": "123456"
	}
	
## User Delete:

## User Update:

	{
		"name": "Bob Brown",
		"email": "bob@gmail.com",
		"phone": "977557755"
	}

## Exception handling - findById:

## Exception handling - delete:

## Exception handling - update:

## Create Heroku app & provision PostgreSQL - From now on it is optional:

## Install local PostgreSQL:

## Dev profile:

## Get SQL script from local PostgreSQL:

## Run SQL Script:

## Heroku CLI:

## Deploy app to Heroku:
	