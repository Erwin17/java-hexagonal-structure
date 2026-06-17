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