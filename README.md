# Spring Boot Simple API

This is a simple API that demonstrates how to create a RESTful API using Spring Boot.

## Requirements

1. Java 21
2. Docker

## Running the application

1. Clone the repository  
    ```bash
    git clone https://github.com/Harin3Bone/java-simple-api.git
    ```
2. Running Docker Compose file  
    ```bash
    docker-compose up -d
    ```
3. Starting the application  
    ```bash
    ./mvnw spring-boot:run -DDB_URL=jdbc:postgresql://localhost:5432/menu -DDB_USER=postgres -DDB_PASSWORD=pgP@ssw0rd 
    ```

## Contributor

[Harin Thananam](https://github.com/Harin3Bone)