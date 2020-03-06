**Spring Boot Implementation:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Boot is the core technology that is used for microservices implementation. It simplifies the implementation of the tasks of building REST-based microservices. Spring Boot also simplifies mapping HTTP style verbs (GET, PUT, POST and DELETE) to URLs and JSON protocol sterilization to and from Java objects. Also, mapping of java exceptions back to HTTP error codes. 

**Spring Cloud Configuration:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Cloud Configuration handles the management of cloud configuration data via centralized configuration which separates the application configuration data with the deployed microservices. It ensures that regardless of any new number of microservices being introduced in the application, their configurations remain the same. 
#### The spring cloud config has its property management repository but sometimes it integrates with open source projects like Git, Consul & Eureka.

**Service Discovery:**
--------------------------------------------------------------------------------------------------------------------------------------
#### In spring Cloud service discovery, the physical location of the servers deployed is hidden from the clients and it’s consumed using services. 
#### Thus, the servers call the business logic for the server using the name assigned to it rather than the physical location of the logic. It also handles the boot strap services and registration as well as the deregistration of the services. Some of the common examples for the service discovery are Consul and Eureka.

**Spring Cloud/Netflix Hystrix and Ribbon:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Cloud relies and integrates heavily on Netflix open source projects. For microservices client resiliency patterns, Spring cloud mixes Netflix Hystrix and Ribbon project. With Netflix Hystrix libraries, it implements the service client resiliency patterns like Circuit breaker as well as bulkhead patterns. With Netflix Ribbon projects, it simplifies integration with the service discovery projects like Eureka, it also helps with the client-side load-balancing of the service calls from a customer. It further allows the client to execute the service calls even when service discovery is not available. 

**Spring Cloud/Netflix Zuul:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Cloud utilizes Netflix Zuul Project for a microservice application to help with the service routing capabilities. Zuul is a service gateway that delegates service requests and assures that all calls to microservices go via a single front controller before the targeted service is called. This results in the centralization of the service calls, which can later help us in enforcing service policies like security authorization, service authentication, content filtering, and routing rules. 

**Spring Cloud Stream:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Cloud Stream is a framework for building highly scalable event-driven microservices connected with shared messaging systems. The framework provides a flexible programming model built on already established and familiar Spring idioms including support for persistent pub/sub semantics, consumer groups, and stateful partitions. Using Spring Cloud Stream, we can integrate our microservices with message brokers like RabbitMQ as well as Kafka. It can also build microservices that execute asynchronous events as they occur. 

**Spring Cloud Sleuth:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Cloud Sleuth helps integrate tracking identifiers into message brokers (RabbitMQ & Kafka) and HTTP calls being used in the microservices. These tracking identities are also known as trace IDs or Correlation, it allows the application to track the transactions flow in the microservices application. 
#### In Spring Cloud Sleuth, these tracking IDs are automatically stored in any logging statements of the microservices application. Sometimes, the spring cloud sleuth is combined with logging technology tools like Papertrail (It is a cloud-based logging platform that helps in clustering all the logs in real-time from various microservices into one database) and Tracing tools like Zipkin (It helps in taking data from the spring cloud sleuth and visualizing the flow of the service calls involved in a single transaction).

**Spring Cloud Security:**
--------------------------------------------------------------------------------------------------------------------------------------
#### Spring Cloud Security is the framework authorization and authentication that controls the service access and what can the service do when invoked by a customer. It’s a token-based framework that allows the services to communicate within themselves through the token issued by the authentication server. Each service that receives a call checks the token in the HTTP call to validate the identity of the user and their access rights for the service. Spring Cloud Security also supports the JavaScript web token which is a framework that standardizes the format of how OAuth token created and provides standards for digital signatures of the token. 

**Provisioning:**
--------------------------------------------------------------------------------------------------------------------------------------
#### The Spring framework is made for application development and it doesn’t have tools for building as well as deployment creation. To implement it we require various tools like Travis CI for Build Tool and Docker for creation of the final image of the microservice that helps in deployment. 
