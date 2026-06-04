# Nexus

Nexus is an Internal Developer Platform (IDP) built to provide a centralized platform for managing projects, repositories, builds, deployments, monitoring, and operational workflows.

The project serves as a hands-on learning initiative focused on enterprise-grade backend development, platform engineering, cloud-native architecture, security, CI/CD, observability, and infrastructure automation.

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

---

## Development Journey

### Project Selection

Several enterprise-grade project ideas were evaluated:

* Insurance Claims Processing System
* Reinsurance Treaty Management Platform
* Workflow Automation Platform
* Internal Developer Platform (IDP)

### Final Choice

***Nexus – Internal Developer Platform***

### Why Nexus?

The project aligns with modern software engineering trends and provides exposure to:

* Platform Engineering
* Cloud-Native Development
* DevOps Practices
* Kubernetes Ecosystem
* Observability
* Developer Experience (DevEx)
* Security and Infrastructure Automation

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

Primary IDE used for development.

#### Extensions

* Extension Pack for Java

### PostgreSQL

Database used for application persistence.

Version:

```text
PostgreSQL 14
```

Verification:

```powershell
Get-Service *postgres*
```

### pgAdmin

Used for PostgreSQL administration and management.

Status:

```text
Installed and Operational
```

---

## Repository Setup

Repository Details:

```text
Repository: nexus
Platform: GitHub
Owner: sohammaity-1
```

Purpose:

* Source Code Management
* Documentation
* Version Control
* CI/CD Integration

---

## Spring Boot Project Initialization

The project was generated using Spring Initializr.

### Configuration

```text
Project Type : Maven
Language     : Java
Spring Boot  : 3.5.x
Packaging    : Jar
Java Version : 21
Config Type  : YAML
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

Provides support for building REST APIs.

### Spring Data JPA

Handles ORM and database persistence.

### PostgreSQL Driver

Enables communication between Spring Boot and PostgreSQL.

### Spring Security

Provides authentication and authorization mechanisms.

### Validation

Supports request and input validation.

### Flyway Migration

Manages version-controlled database schema migrations.

### Spring Boot Actuator

Provides health checks, metrics, and monitoring endpoints.

### Lombok

Reduces boilerplate code.

---

## Key Learnings

### Maven Wrapper

Generated Files:

```text
mvnw
mvnw.cmd
```

Purpose:

Ensures all developers use the same Maven version regardless of local installations.

```text
mvnw      -> Linux/macOS
mvnw.cmd  -> Windows
```

---

### Spring Boot Auto Configuration

#### Observation

After adding JPA and PostgreSQL dependencies, Spring Boot automatically attempted to configure a datasource.

#### Startup Error

```text
Failed to configure a DataSource
```

#### Cause

Datasource configuration properties were not provided.

#### Learning

Spring Boot automatically configures components based on dependencies present in the project.

This mechanism is known as **Auto Configuration**.

---

### Spring Security Auto Configuration

#### Observation

Accessing:

```text
http://localhost:8080
```

redirected to:

```text
http://localhost:8080/login
```

instead of returning a 404 response.

#### Reason

The following dependency was included:

```xml
spring-boot-starter-security
```

Spring Boot automatically enabled:

* Authentication
* Authorization
* Login Page
* Security Filters

## Learnings ##

When Spring Security is present on the classpath, Spring Boot applies a default security configuration.

Without custom configuration:

* All endpoints are secured
* A default login page is generated
* A temporary user account is created

This behavior will later be replaced with JWT-based authentication.

---

## Current Project Status

### Completed

* Project planning and architecture selection
* Git and GitHub setup
* Java installation
* PostgreSQL installation
* pgAdmin setup
* Spring Boot project generation
* Dependency configuration
* Initial application startup

### In Progress

* PostgreSQL database creation
* Datasource configuration
* Application configuration setup

### Upcoming Tasks

#### Database Layer

* Create Nexus database
* Configure datasource in `application.yml`
* Configure Flyway
* Create first migration script

#### Security

* Implement User module
* Add JWT Authentication
* Configure authorization rules

#### Core Platform Features

* Project Management Module
* Repository Management
* Build Management
* Deployment Management

#### Platform Engineering Features

* Kubernetes Integration
* Container Management
* CI/CD Pipelines
* Infrastructure Automation

#### Observability

* Metrics Collection
* Logging
* Monitoring Dashboards
* Alerting

---

## Project Goal

The primary objective of Nexus is to gain practical experience in designing and building an enterprise-grade Internal Developer Platform while learning modern backend engineering, DevOps, platform engineering, security, cloud-native development, and observability practices through a real-world project.
