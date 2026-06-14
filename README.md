# java-hexagonal-structure

```
├── HELP.md
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── java-hexagonal-structure
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       └── main
│   │   │           └── com
│   │   │               └── app
│   │   │                   ├── JavaHexagonalStructureApplication.class
│   │   │                   └── config
│   │   │                       └── YMLConfig.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       └── main
│   │   │       └── headers
│   │   │           └── java
│   │   │               └── main
│   │   ├── libs
│   │   │   └── java-hexagonal-structure-0.0.1-SNAPSHOT.jar
│   │   ├── resolvedMainClassName
│   │   ├── resources
│   │   │   └── main
│   │   │       ├── application.yaml
│   │   │       ├── static
│   │   │       └── templates
│   │   └── tmp
│   │       ├── bootJar
│   │       │   └── MANIFEST.MF
│   │       └── compileJava
│   │           └── previous-compilation-data.bin
│   ├── build.gradle
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── app
│           │           ├── JavaHexagonalStructureApplication.java
│           │           └── config
│           │               └── YMLConfig.java
│           └── resources
│               ├── application.yaml
│               ├── static
│               └── templates
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
│                       ├── commands
│                       ├── queries
│                       └── usecase
├── java-hexagonal-structure-domain
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       └── main
│   │   │           └── com
│   │   │               └── app
│   │   │                   └── order
│   │   │                       └── OrderRoot.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       └── main
│   │   │       └── headers
│   │   │           └── java
│   │   │               └── main
│   │   ├── libs
│   │   │   └── java-hexagonal-structure-domain-0.0.1-SNAPSHOT.jar
│   │   └── tmp
│   │       ├── compileJava
│   │       │   └── previous-compilation-data.bin
│   │       └── jar
│   │           └── MANIFEST.MF
│   ├── build.gradle
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── app
│                       └── order
│                           └── OrderRoot.java
├── java-hexagonal-structure-infrastructure
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       └── main
│   │   │           └── com
│   │   │               └── app
│   │   │                   └── aws
│   │   │                       └── config
│   │   │                           └── S3Config.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       └── main
│   │   │       └── headers
│   │   │           └── java
│   │   │               └── main
│   │   ├── libs
│   │   │   └── java-hexagonal-structure-infrastructure-0.0.1-SNAPSHOT.jar
│   │   ├── resources
│   │   │   └── main
│   │   │       ├── static
│   │   │       └── templates
│   │   └── tmp
│   │       ├── compileJava
│   │       │   └── previous-compilation-data.bin
│   │       └── jar
│   │           └── MANIFEST.MF
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── app
│       │   │           └── aws
│       │   │               └── config
│       │   │                   └── S3Config.java
│       │   └── resources
│       │       ├── static
│       │       └── templates
│       └── test
│           └── java
│               └── com
│                   └── app
└── settings.gradle
```