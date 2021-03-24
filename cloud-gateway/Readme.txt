1. Add the Spring Modules - web,lombok,actuator,admin client, cloud gateway
2. update the application.yml to read services in eureka 

spring:
  cloud:
    gateway:
      discovery:
        locator:
          enabled: true
          lower-case-service-id: true

3. Test the routes using actuator endpoints

