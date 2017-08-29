# MicroServiceArchitecture

Client -> API Gateway(Entry point) -> Microservices
 
API Gateway Responsibility
Securtiy
 
CLient -> API Gateway ->Auth Server ->API Gateway
Service Discovery -> Each and every service must be registered
In cloud based services where we have dynamic instances so the data is registered in service registry -> At time of creation it registers ,At the time of downtime the instance deregisters itself
Sends heartbeat for checking the instance
Load Balancer -> effieciently distributing incoming network traffic across a group of backend servers. Commonly used algorithm
 - Round Robin
- Availability filtering rule
- Weighted Response time
 Avalability based load balancer - enriches user experience
Dynamic Routing
Routing based on namespace http://www.website.com/service1
http://www.website.com/service2


Canary-> Netflix routes 1 % of traffic to new build and check if its score is more than 80% than uses that build else chucks it out

API gateway should never have buisness logic

- Interprocess Communication
one to one VS one to many
Synchronous VS Asynchronous(Donot wait for response)

Rest APIs are the most ideal choice for synchronous communication

Service Orchestration VS Choreography
Publish Subscribe Mechanism

- Distributed Data Management
Master Slave Concept
Two Phase Commit

Event Driven Architecture approach for distributed data management

Event Sourcing

Deployment
Multiple Servic Instance per host Pattern
Service instance per host pattern
Service Instance per conatiner pattern



