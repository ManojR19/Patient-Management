# Patient-Management System

A scalable **Patient Management System** built using **Spring Boot microservices architecture** and cloud infrastructure simulated with **AWS CDK and LocalStack**. The system demonstrates modern backend architecture patterns, including API Gateway routing, JWT-based authentication, service-to-service communication using gRPC, and event-driven processing with Kafka.

---

## Architecture Overview

The system is designed as a distributed microservices platform with multiple independent services communicating through REST and gRPC.

Main components include:

* API Gateway – Handles centralized routing of client requests
* Authentication Service – Provides JWT token-based authentication and authorization
* Patient Service – Manages patient records and operations
* Billing Service – Handles billing operations using gRPC communication
* Analytics Service – Processes analytical data using event-driven architecture

The infrastructure is simulated locally using **AWS CDK with LocalStack**, mimicking real AWS services such as container orchestration and networking.

---

## Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Cloud Gateway
* gRPC

**Security**

* JWT Token-based Authentication

**Infrastructure**

* AWS CDK
* LocalStack
* Docker
* ECS Fargate-style architecture

**Messaging & Communication**

* Apache Kafka
* REST APIs
* gRPC

**Database**

* PostgreSQL

**Testing**

* Integration Testing
* Service-level Test Cases

---

## Key Features

* Microservices-based architecture
* Secure login using **JWT token authentication**
* **API Gateway** for centralized routing and request handling
* Service-to-service communication using **gRPC**
* Event-driven architecture using **Apache Kafka**
* Containerized services using **Docker**
* Cloud infrastructure simulated using **AWS CDK + LocalStack**
* **Integration tests and test cases** implemented for validating service interactions

---

## Project Structure

```
patient-management
│
├── api-gateway
├── auth-service
├── patient-service
├── billing-service
├── analytics-service
├── infrastructure (AWS CDK + LocalStack)
└── docker
```

---

## Running the Project

### 1. Clone the Repository

```
git clone https://github.com/ManojR19/Patient-Management.git
```

### 2. Start Local Infrastructure

```
docker compose up
```

### 3. Deploy Infrastructure using CDK

```
cd infrastructure
cdk deploy
```

### 4. Run Services

Start each microservice individually using Maven or your IDE.

---

## API Security

The system uses **JWT (JSON Web Token)** based authentication.

Flow:

1. User logs in via Auth Service
2. Auth Service generates JWT token
3. Client sends JWT token with each request
4. API Gateway validates token before routing request to services

---

## Testing

Integration tests are implemented to validate:

* Service-to-service communication
* API endpoints
* Authentication and authorization flows
* Billing service gRPC interactions

---

## Learning Objectives

This project demonstrates:

* Microservices architecture design
* Secure API development
* Distributed system communication
* Cloud infrastructure simulation
* Event-driven system design
* Integration testing in microservices

---

## Author

Manoj Raske
