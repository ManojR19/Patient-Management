# Patient-Management System

A scalable **Patient Management System** built using **Spring Boot microservices architecture** and cloud infrastructure simulated with **AWS CDK and LocalStack**. The project demonstrates real-world backend architecture patterns such as API Gateway routing, JWT-based authentication, gRPC communication, and event-driven services using Kafka.

---

## Architecture Diagram

![System Architecture](docs/architecture.png)

The system is deployed using a **container-based architecture on AWS ECS-style infrastructure**.

### Key Flow

1. Client requests enter through an **Application Load Balancer (ALB)**.
2. Requests are routed to the **API Gateway service**.
3. API Gateway validates **JWT tokens** and forwards requests to microservices.
4. Services communicate with each other using **REST and gRPC**.
5. **Patient Service publishes events to Kafka**.
6. **Analytics Service consumes Kafka events** for processing.
7. Each service stores data in **PostgreSQL databases hosted in RDS**.

---

## Microservices

* **API Gateway Service**
  Handles request routing and security validation.

* **Auth Service**
  Provides JWT token-based authentication and authorization.

* **Patient Service**
  Manages patient records and publishes patient events to Kafka.

* **Billing Service**
  Handles billing operations using **gRPC communication**.

* **Analytics Service**
  Consumes Kafka events and performs analytical processing.

---

## Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Cloud Gateway
* gRPC

**Security**

* JWT Authentication

**Infrastructure**

* AWS CDK
* LocalStack
* Docker
* ECS-style container deployment

**Messaging**

* Apache Kafka

**Database**

* PostgreSQL (RDS style)

**Testing**

* Integration Testing
* Service-level test cases

---

## Key Features

* Microservices architecture
* JWT-based secure login
* API Gateway centralized routing
* Service-to-service communication using gRPC
* Event-driven architecture using Kafka
* Containerized services with Docker
* Cloud infrastructure simulation using AWS CDK + LocalStack
* Integration tests validating service interactions

---

## Running the Project

Clone the repository:

```bash
git clone https://github.com/ManojR19/Patient-Management.git
```

Start infrastructure:

```bash
docker compose up
```

Deploy infrastructure:

```bash
cd infrastructure
cdk deploy
```

Run the services individually.

---

## Author

Manoj Raske
