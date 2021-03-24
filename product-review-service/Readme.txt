Create a Spring Boot Starter Project 
Add Spring Web,EurekaClient,Lombok,Spring Data JPA, MySql Drive and Actuator Modules
Add the @EnableDiscoveryClient on the Java class with main method
Rename the application.properties as application.yml
Add the minimal Configuration properties required
Create the Entity Class add @Entity ,@Table and @Id 
Create a Repository by extending JPA Repository
Create a Service and AutoWire Repository
Create a Controller and and AutoWire Service

===================================

Add Config Client Module 

Update the application.yml and add reference of Config Server

spring
 config:
    import: configserver:http://localhost:8888

Expose Actuator End Points also 


Note : Before spring boot 2.4 we have bootstrap.yml and application.yml 
       Config Server Uri should be added in bootstrap.yml 
       But from 2.4 it has changed now there is no bootstrap.yml
       
============================================

Add Admin Client

1. Add the Admin Client Module 

2. Update the applicaiton.yml by making it point to Admin Server

==================================       
       