# Nexus

## Project Status

🚧 **Active Development**

**Current Phase:** Phase 2 – Identity & Access Management

### Completed

* Phase 0 – Project Inception
* Phase 1 – Foundation & Platform Bootstrap

### In Progress

* Phase 2 – Identity & Access Management

---

## Overview

Nexus is an Internal Developer Platform (IDP) built to provide a centralized platform for managing projects, repositories, builds, deployments, monitoring, and operational workflows.

The project serves as a hands-on initiative focused on enterprise-grade backend development, platform engineering, cloud-native architecture, security, CI/CD, observability, and infrastructure automation.

Unlike traditional CRUD applications, Nexus is being developed using production-oriented engineering practices, emphasizing scalability, maintainability, security, and operational excellence.

---

## Project Vision

The goal of Nexus is to create a unified developer experience where users can:

* Manage projects and teams
* Connect source code repositories
* Trigger application builds
* Generate container images
* Deploy applications
* Monitor deployments and system health
* View logs and metrics
* Troubleshoot operational issues

### Planned Future Enhancements

* Kubernetes Integration
* Observability Stack (Prometheus, Grafana, Loki)
* Workflow Automation
* AI-Assisted Diagnostics
* Infrastructure Provisioning
* Multi-Environment Deployment Support
* Deployment Pipelines
* Build Orchestration
* Developer Self-Service Capabilities

---

## Development Journey

### Project Selection

Several enterprise-grade project ideas were evaluated:

* Insurance Claims Processing System
* Reinsurance Treaty Management Platform
* Workflow Automation Platform
* Internal Developer Platform (IDP)

### Final Choice

**Nexus – Internal Developer Platform**

### Why Nexus?

The project aligns with modern software engineering trends and provides exposure to:

* Platform Engineering
* Cloud-Native Development
* DevOps Practices
* Kubernetes Ecosystem
* Observability
* Developer Experience (DevEx)
* Security Engineering
* Infrastructure Automation
* Deployment Orchestration

The primary objective is not merely feature development but learning how modern enterprise platforms are designed, built, secured, deployed, and operated.

---

## Development Environment

### Machine Configuration

| Component        | Specification     |
| ---------------- | ----------------- |
| Operating System | Windows 11        |
| Processor        | AMD Ryzen 5 5500U |
| RAM              | 8 GB              |
| Storage          | SSD               |
| Architecture     | x64               |

### Development Strategy

GitHub Codespaces was evaluated during project planning.

Decision:

```text
Local Development First
```

Reasoning:

* Hardware is sufficient for foundation phases.
* Better understanding of runtime dependencies.
* Stronger understanding of environment setup.
* Easier debugging during early development.

Future migration to cloud development environments remains an option.

---

## Installed Software

### Git

Used for source control and version management.

```bash
git --version
```

### Java

Primary development language.

```bash
java -version
javac -version
```

Version:

```text
OpenJDK 21 LTS
```

### Visual Studio Code

Primary development IDE.

#### Extensions

* Extension Pack for Java

### PostgreSQL

Primary relational database.

Version:

```text
PostgreSQL 14
```

Verification:

```powershell
Get-Service *postgres*
```

### pgAdmin

Used for PostgreSQL administration.

Status:

```text
Installed and Operational
```

---

## Repository Setup

Repository Details:

```text
Repository : nexus
Platform   : GitHub
Owner      : sohammaity-1
```

Purpose:

* Source Control
* Documentation
* Collaboration
* CI/CD Integration
* Release Management

---

## Technology Stack

### Backend

* Java 21
* Spring Boot 3.5.x
* Spring Web
* Spring Data JPA
* Spring Security

### Database

* PostgreSQL 14
* Flyway

### Build Tool

* Maven

### Development Tools

* VS Code
* Git
* GitHub
* pgAdmin

### Future Technologies

* Docker
* Kubernetes
* Prometheus
* Grafana
* Loki
* OpenTelemetry
* GitHub Actions

---

## Spring Boot Project Initialization

Generated using Spring Initializr.

### Configuration

```text
Project Type : Maven
Language     : Java
Spring Boot  : 3.5.x
Packaging    : Jar
Java Version : 21
Configuration: YAML
```

### Metadata

```text
Group ID     : com.soham
Artifact ID  : nexus
Name         : nexus
Package Name : com.soham.nexus
```

---

## Dependencies

### Spring Web

Provides REST API capabilities.

### Spring Data JPA

Provides ORM and repository abstractions.

### PostgreSQL Driver

Enables PostgreSQL connectivity.

### Spring Security

Provides authentication and authorization.

### Validation

Provides request validation support.

### Flyway

Database schema versioning.

### Spring Boot Actuator

Health checks, metrics, and operational endpoints.

### Lombok

Boilerplate reduction.

---

## Architecture Decisions

### Architectural Style

Nexus follows a:

```text
Modular Monolith
```

### Why Modular Monolith?

Benefits:

* Faster development
* Simpler deployment
* Lower operational overhead
* Easier debugging
* Easier local development
* Future migration path to microservices if required

---

### Package Organization

Nexus follows:

```text
Package By Feature
```

instead of:

```text
Package By Layer
```

### Implemented Structure

```text
com.soham.nexus

├── common
│   └── entity
│
├── configuration
│
├── project
│
├── security
│
├── user
│   ├── controller
│   ├── dto
│   ├── entity
│   ├── repository
│   └── service
│
└── NexusApplication
```

### Benefits

* Higher cohesion
* Clear ownership
* Easier scaling
* Better maintainability
* Improved domain separation

---

## Database Strategy

### Database

```text
PostgreSQL
```

### Migration Framework

```text
Flyway
```

### Principles

* Database changes are treated as code.
* Applied migrations are immutable.
* New changes require new migration versions.
* Manual schema changes are avoided.

### Current Migrations

```text
V1__create_users.sql
V2__add_updated_at_to_users.sql
```

---

## Key Learnings

### Maven Wrapper

Generated Files:

```text
mvnw
mvnw.cmd
```

Purpose:

Ensures consistent Maven versions across environments.

---

### Spring Boot Auto Configuration

Observation:

After adding JPA and PostgreSQL dependencies, Spring Boot automatically attempted datasource initialization.

Startup Error:

```text
Failed to configure a DataSource
```

Root Cause:

Datasource properties were missing.

Learning:

Spring Boot automatically configures components based on dependencies present on the classpath.

---

### Spring Security Auto Configuration

Observation:

```text
http://localhost:8080
```

redirected to:

```text
http://localhost:8080/login
```

Reason:

```xml
spring-boot-starter-security
```

was present.

Learning:

Spring Security automatically enables:

* Authentication
* Authorization
* Login Page
* Security Filters

without custom configuration.

---

### Flyway Migration Lifecycle

Migration Issue Encountered:

```text
V1_create_users.sql
```

was incorrectly named.

Expected:

```text
V1__create_users.sql
```

Result:

Migration inconsistency and checksum mismatch.

Learning:

Applied Flyway migrations are immutable.

Schema evolution must occur through new migration versions.

---

## Current Database State

### Tables

```text
users
flyway_schema_history
```

### User Schema

```text
id
username
email
password
created_at
updated_at
```

---

## Current Project Status

### Phase 0 – Project Inception ✅

Completed:

* Product vision established
* Technology stack selected
* Architecture direction finalized
* Development roadmap created

---

### Phase 1 – Foundation & Platform Bootstrap ✅

Completed:

* Git & GitHub setup
* Java environment setup
* PostgreSQL installation
* pgAdmin setup
* Spring Boot initialization
* Datasource configuration
* Spring Security integration
* Flyway integration
* Initial database versioning
* Database schema creation

---

### Phase 2 – Identity & Access Management 🚧

Completed:

* BaseEntity
* User Entity
* UserRepository
* UserService
* RegisterUserRequest DTO
* Flyway V2 migration
* Package-by-feature structure

In Progress:

* User Registration Workflow
* Registration API
* Validation Layer

Upcoming:

* Password Hashing (BCrypt)
* Authentication
* JWT Implementation
* Authorization
* RBAC

---

## Roadmap

### Identity & Access Management

* User Registration
* Login API
* Password Hashing
* JWT Authentication
* JWT Authorization
* Role-Based Access Control

### Core Platform Features

* Project Management
* Repository Management
* Build Management
* Deployment Management

### Platform Engineering Features

* Docker Containerization
* Kubernetes Integration
* CI/CD Pipelines
* Infrastructure Automation

### Observability

* Metrics Collection
* Centralized Logging
* Monitoring Dashboards
* Alerting
* Distributed Tracing

---

## Project Goal

The primary objective of Nexus is to gain practical experience in designing and building an enterprise-grade Internal Developer Platform while applying modern backend engineering, security, DevOps, platform engineering, cloud-native architecture, and observability practices through a real-world product journey.

The project emphasizes:

* Engineering Discipline
* Architecture First Thinking
* Production-Oriented Development
* Incremental Delivery
* Long-Term Maintainability
* Continuous Learning
