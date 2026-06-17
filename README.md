# java-hexagonal-structure


## Application Entry Point

```
├── java-hexagonal-structure
│   ├── build
│   │   ├── libs
│   │   │   └── java-hexagonal-structure-0.0.1-SNAPSHOT.jar
│   ├── build.gradle
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── app
│           │           ├── JavaHexagonalStructureApplication.java
│           │           ├── config
│           │           │   └── YMLConfig.java
│           │           └── controller
│           │               ├── order
│           │               │   └── OrderController.java
│           │               └── product
│           │                   └── ProductController.java
│           └── resources
│               ├── application.yaml
│               ├── static
│               └── templates
```
* **config:** In this package we configure all the initial application reference properties related to AWS, external APIs, external resources, etc 
* * **application.yaml:**  in this point we make use from
* **controller:** Exposure of rest resource, at this point we make use of the use cases defined in the **application layer**. 



## Domain Layer
```
├── java-hexagonal-structure-domain
│   ├── build.gradle
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── app
│                       ├── commons
│                       │   ├── AggregateRoot.java
│                       │   ├── DomainEvent.java
│                       │   └── Entity.java
│                       ├── entities
│                       │   ├── client
│                       │   │   └── User.java
│                       │   ├── order
│                       │   │   └── OrderRoot.java
│                       │   └── product
│                       │       └── Product.java
│                       ├── exceptions
│                       │   └── BusinessException.java
│                       └── ports
│                           ├── events
│                           ├── repository
│                           └── services
```
* **common:** This package contains common classes for all entities.
* **entities:** Contains object domain (Entities, Values Object).
* **exceptions:** We define business exceptions 
* **ports:** Defines the contracts that will be implemented by the infrastructure layer.
  * **events:** Ports for publishing and consuming domain events through messaging systems such as Kafka or RabbitMQ.
  * **repository:** Ports for persisting and retrieving domain data from storage technologies such as MongoDB, PostgresSQL, or others.
  * **services:** Ports for integrating with external services and third-party APIs.


## Application Layer
```
├── java-hexagonal-structure-application
│   ├── build
│   │   ├── libs
│   │   │   └── java-hexagonal-structure-application-0.0.1-SNAPSHOT.jar
│   │   └── tmp
│   │       └── jar
│   │           └── MANIFEST.MF
│   ├── build.gradle
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── app
│                       └── usecase
│                           ├── order
│                           └── product
```
* **usecase:** Contains the application use cases that orchestrate the execution of business operations.
Use cases coordinate domain entities, value objects, and ports to fulfill specific business requirements while keeping 
the domain independent from infrastructure concerns.

## Infrastructure Layer
```
├── java-hexagonal-structure-infrastructure
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── app
│       │   │           ├── aws
│       │   │           │   ├── adapters
│       │   │           │   ├── config
│       │   │           │   │   └── S3Config.java
│       │   │           │   └── models
│       │   │           ├── jpa
│       │   │           │   ├── adapters
│       │   │           │   ├── entities
│       │   │           │   ├── mappers
│       │   │           │   └── repositories
│       │   │           ├── kafka
│       │   │           │   ├── adapters
│       │   │           │   ├── configs
│       │   │           │   └── dtos
│       │   │           ├── redis
│       │   │           │   └── configs
│       │   │           │       └── RedisConfig.java
│       │   │           └── rest
│       │   │               ├── adapters
│       │   │               ├── configs
│       │   │               ├── dtos
│       │   │               ├── mappers
│       │   │               └── models
│       │   └── resources
│       │       └── templates
│       └── test
│           └── java
│               └── com
│                   └── app
└── settings.gradle
```
* **aws:**
  * **adapters:** Implements the ports defined in the domain layer
  * **configs:** Configuration for AWS services such as S3, SNS, SQS, or others.
  * **models:** Mappings from application.yaml o Configuration mappings from application.yaml.
---
* **jpa:**
  * **adapters:** Implements the repository ports defined in the domain layer
  * **entities:** JPA Entities used to map database tables.
  * **mappers:** Maps domain entities to JPA entities and vice versa.
  * **repositories:** Contains Spring Data repositories that extend JpaRepository, CrudRepository, PagingAndSortingRepository, or other repository interfaces.
---
* **kafka:**
  * **adapters:** Implements the event ports defined in the domain layer.
  * **configs:** Configuration for Apache Kafka, RabbitMQ or others streaming platforms.
  * **dtos:** DTOs required for publishing and consuming events
---
* **redis:**
  * **configs:** Configuration for Redis connections, RedisTemplate configuration, etc.
---
* **rest:**
  * **adapters:**
  * **configs:**
  * **dtos:**
  * **mappers:**
  * **models:**