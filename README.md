# Spring Microservices - Microservices + Spring Boot + Spring Cloud + Docker

Spring Framework Project for Practicing Microservices following in28minutes tutorial

Ports Standradization
    Application                          Port:
    
    Limits Microservice                  8080, 8081, ...
    Spring Cloud Config Server           8888
    Currency Exchange Microservice       8000, 8001, 8002, ...
    Currency Conversion Microservice     8100, 8101, 8102, ...
    Netflix Eureka Naming Server         8761
    API Gateway                          8765
    Zipkin Disctributed Tracing Server   8411



# Docker

## Images

- https://hub.docker.com/u/krstic8687
- Currency Exchange Service 
	- krstic8687/mmv1-currency-exchange-service:0.0.1-SNAPSHOT
- Currency Conversion Service
	- krstic8687/mmv1-currency-conversion-service:0.0.1-SNAPSHOT
- Eureka
	- krstic8687/mmv1-naming-server:0.0.1-SNAPSHOT
- API GATEWAY
	- krstic8687/mmv1-api-gateway:0.0.1-SNAPSHOT

## URLS

#### Currency Exchange Service
- http://localhost:8000/currency-exchange/from/USD/to/INR

#### Currency Conversion Service
- http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

#### Eureka
- http://localhost:8761/

#### Zipkin
- http://localhost:9411/

#### API GATEWAY
- http://localhost:8765/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
