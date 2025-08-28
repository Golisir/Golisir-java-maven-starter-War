# Java + Maven Starter

A minimal Java project you can build and test locally with Maven (JUnit 5).

## Build
```bash
mvn clean package
```

## Run tests
```bash
mvn test
```

## Run the app (two options)
```bash
# Option A: using exec plugin
mvn -q exec:java

# Option B: run the packaged jar
java -jar target/my-maven-project-1.0-SNAPSHOT.jar
```
# Golisir-java-maven-starter-War
