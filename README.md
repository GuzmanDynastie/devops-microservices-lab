# DevOps Microservices Lab

Laboratorio practico de **DevOps y Application Support L2**, construido desde cero sobre Ubuntu Server.

El objetivo de este proyecto es desarrollar una plataforma de microservicios y, al mismo tiempo, practicar **deployment, observabilidad, troubleshooting, incident management y root cause analysis**.

---

## Objetivos

Este laboratorio esta disenado para practicar:

- Linux / Ubuntu Server
- Git / GitHub
- REST APIs
- HTTP requests / responses
- Node.js
- Express
- Kotlin
- Spring Boot
- PostgreSQL
- Kafka
- Webhooks
- Docker
- Kubernetes
- Jenkins
- Terrafomr
- Prometheus
- Grafana
- Loki
- OpenThelemetry / Tempo
- Cloud
- Application Monitoring
- Incident Management
- L1/L2 Troubleshooting
- Root Cause Analysis

---

## Arquitectura

La arquitectura final sera una plataforma de copmercio electronico simplificada:

```text
                         ┌──────────────────┐
                         │      Client      │
                         │  Postman / curl  │
                         └────────┬─────────┘
                                  │
                                  ▼
                         ┌──────────────────┐
                         │   API Gateway    │
                         │   Node.js        │
                         │   Express        │
                         └────────┬─────────┘
                                  │
                 ┌────────────────┼────────────────┐
                 │                │                │
                 ▼                ▼                ▼
        ┌────────────────┐ ┌──────────────┐ ┌─────────────────┐
        │  User Service  │ │ Order Service│ │ Payment Service │
        │     Kotlin     │ │    Kotlin    │ │    Node.js      │
        │  Spring Boot   │ │ Spring Boot  │ │    Express      │
        └────────────────┘ └──────┬───────┘ └────────┬────────┘
                                  │                  │
                                  ▼                  ▼
                            ┌───────────┐       External API
                            │   Kafka   │
                            └─────┬─────┘
                                  │
                         ┌────────┴─────────┐
                         │                  │
                         ▼                  ▼
                ┌────────────────┐ ┌──────────────────┐
                │    Inventory   │ │   Notification   │
                │     Kotlin     │ │     Node.js      │
                │  Spring Boot   │ │     Express      │
                └────────────────┘ └──────────────────┘
```

## Servicios

| Servicio | Tecnología |
|---|---|
| API Gateway | Node.js / Express |
| User Service | Kotlin / Spring Boot |
| Order Service | Kotlin / Spring Boot |
| Payment Service | Node.js / Express |
| Inventory Service | Kotlin / Spring Boot |
| Notification Service | Node.js / Express |
