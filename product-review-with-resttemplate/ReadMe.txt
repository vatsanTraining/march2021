1. Create a Spring Starter Project with lombok and spring web

2. AutoWire RestTemplate with @LoadBalanced Annotations
   
     @Bean
     @LoadBalanced
     RestTemplate template(){ return new Resttemplate();}
     
 3. Create a Rest Controller and AutoWire RestTemplate 
 
 4. Add a Method with getMapping and use restTemplate.getForObject()
 
 5. To the getObject Method pass ServiceId and ReturnType as first and second argument
 
 6. Register with eureka and run the application
 
 7. Check from browser
     