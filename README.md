# 🏋️ FitTrack - Fitness Tracker Microservice Web Application

A full-stack **Fitness Tracker Microservice Web Application** designed to help users log, manage, and track their fitness activities in a secure, scalable, and distributed environment.

The application follows a **microservices architecture** with secure authentication, API Gateway routing, service discovery, centralized configuration, and asynchronous communication between services.

---

## 📌 Project Overview

FitTrack allows users to:

- 🏃‍♂️ Add and manage daily workout activities
- ⏱️ Track workout duration, calories burned, and fitness progress
- 🔐 Authenticate securely using Keycloak OAuth2 PKCE (with Google login support)
- ⚡ Enable communication between services using RabbitMQ
- 🐳 Run all microservices seamlessly using Docker

---

# 🏗️ Microservices Architecture

---

# ⚙️ Tech Stack

## Backend
- Java
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Hibernate

## Microservices Components
- Spring Cloud Gateway
- Eureka Service Discovery
- Spring Cloud Config Server

## Frontend
- React.js
- Material UI (MUI)
- Axios

## Database
- PostgreSQL
- MongoDB Atlas

## Security
- Keycloak
- OAuth2
- PKCE Authentication Flow
- Google Login Integration

## Messaging
- RabbitMQ
- Apache Kafka

## DevOps
- Docker
- Docker Compose

---

# ✨ Features

## 👤 User Management
- Secure user authentication
- User profile management
- Keycloak-based authorization

## 🏋️ Activity Tracking
- Add fitness activities
- Track:
  - Activity type
  - Duration
  - Calories burned
  - Workout details

## 🔄 Microservice Communication
- REST API communication
- Event-driven communication using RabbitMQ/Kafka
- Service registration using Eureka
- Centralized configuration using Config Server

---

  ## 🏗️ System Architecture

```mermaid
flowchart TD

    User([User])

    Frontend[React.js Frontend<br/>Material UI]

    Keycloak[Keycloak<br/>OAuth2 PKCE<br/>Google Login]

    Gateway[API Gateway<br/>Spring Cloud Gateway]

    UserService[User Service<br/>Spring Boot]

    ActivityService[Activity Service<br/>Spring Boot]

    RabbitMQ[RabbitMQ<br/>Message Broker]

    Eureka[Eureka Server<br/>Service Discovery]

    Config[Config Server<br/>Centralized Configuration]

    PostgreSQL[(PostgreSQL)]
    MongoDB[(MongoDB Atlas)]

    Docker[Docker<br/>Container Deployment]


    User --> Frontend

    Frontend --> Keycloak
    Keycloak --> Gateway

    Gateway --> UserService
    Gateway --> ActivityService

    UserService --> PostgreSQL
    ActivityService --> MongoDB

    ActivityService --> RabbitMQ

    UserService --> Eureka
    ActivityService --> Eureka
    Gateway --> Eureka

    UserService --> Config
    ActivityService --> Config
    Gateway --> Config

    Docker -. Deploys .-> Frontend
    Docker -. Deploys .-> Gateway
    Docker -. Deploys .-> UserService
    Docker -. Deploys .-> ActivityService
    Docker -. Deploys .-> Eureka
    Docker -. Deploys .-> Config
```
