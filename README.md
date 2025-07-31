# Helpdesk ORM

A Spring Boot 3.5.4 based Helpdesk Ticket Management System using Hibernate ORM and PostgreSQL.  
This project demonstrates a clean layered architecture with entities, repositories, services, and controllers.

## 📂 Project Structure
```
Directory structure:
└── adrin-bershik-c-j-day8proj2/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── helpdeskorm/
    │   │   │               ├── HelpdeskormApplication.java
    │   │   │               ├── controller/
    │   │   │               │   ├── TagController.java
    │   │   │               │   ├── TicketController.java
    │   │   │               │   ├── TicketTagController.java
    │   │   │               │   └── UserController.java
    │   │   │               ├── domain/
    │   │   │               │   ├── Tag.java
    │   │   │               │   ├── Ticket.java
    │   │   │               │   ├── TicketTag.java
    │   │   │               │   └── User.java
    │   │   │               ├── repository/
    │   │   │               │   ├── TagRepository.java
    │   │   │               │   ├── TicketRepository.java
    │   │   │               │   ├── TicketTagRepository.java
    │   │   │               │   └── UserRepository.java
    │   │   │               └── service/
    │   │   │                   ├── TagService.java
    │   │   │                   ├── TicketService.java
    │   │   │                   ├── TicketTagService.java
    │   │   │                   └── UserService.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── example/
    │                   └── helpdeskorm/
    │                       └── HelpdeskormApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties
```

## 🚀 Features
- CRUD operations for **Users**, **Tickets**, **Tags**, and **TicketTags**
- PostgreSQL database integration with Hibernate ORM
- REST API endpoints with Spring Web
- Layered architecture for maintainability

## 🛠️ Technologies Used
- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **Hibernate 6**
- **PostgreSQL**
- **Maven**

## ⚙️ Setup & Run

### 1️⃣ Configure Database
Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/helpdeskdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
