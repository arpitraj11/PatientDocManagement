
<div align="center">
  <h1>Doctor-Patient Management System</h1>
  <img src="https://img.shields.io/badge/Java-8%2B-blue" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-2.5.5-brightgreen" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Hibernate-5.5.6-red" alt="Hibernate">
  <img src="https://img.shields.io/badge/Swagger-2.9.2-orange" alt="Swagger">
</div>

A Spring Boot application for efficiently managing doctors and patients in a healthcare system.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Examples](#examples)
- [Contributing](#contributing)

## Introduction

This Spring Boot project provides a robust backend solution for efficiently managing doctors and patients in a healthcare platform. Doctors can be added, updated, and deleted, and patients can be registered with their symptoms. Additionally, the system intelligently suggests doctors based on a patient's symptom and location.

## Features

- CRUD operations for doctors (Create, Read, Update, Delete)
- CRUD operations for patients (Create, Read, Update, Delete)
- Smart doctor suggestions based on patient symptoms and location

## Technologies Used

- **Java**: The core programming language.
- **Spring Boot**: The framework for building Java applications.
- **Spring Data JPA**: Simplifies data access using the Java Persistence API (JPA).
- **Hibernate**: An ORM (Object-Relational Mapping) tool for database interaction.
- **Swagger**: A tool for API documentation and testing.

## Getting Started

### Prerequisites

To run this application, ensure you have the following:

- Java Development Kit (JDK)
- Spring Boot development environment (e.g., IntelliJ IDEA)
- Database (e.g., MySQL)

### Installation

1. Clone this repository to your local machine.
2. Configure your database connection in `application.properties`.
3. Build and run the project.

## Usage

The project exposes RESTful API endpoints for efficient management of doctors and patients. You can interact with the API using tools like Postman or Swagger (if enabled).

## API Endpoints

- `POST /doctors/add`: Add a new doctor.
- `GET /doctors/{id}`: Retrieve a doctor by ID.
- `GET /doctors/all`: Retrieve a list of all doctors.
- `PUT /doctors/update/{id}`: Update an existing doctor by ID.
- `DELETE /doctors/delete/{id}`: Delete a doctor by ID.
- `POST /patients/add`: Add a new patient.
- `GET /patients/{id}`: Retrieve a patient by ID.
- `GET /patients/all`: Retrieve a list of all patients.
- `PUT /patients/update/{id}`: Update an existing patient by ID.
- `DELETE /patients/delete/{id}`: Delete a patient by ID.
- `GET /doctors/suggest`: Get a list of suggested doctors based on a patient's symptom and location.

## Examples

Here are some examples of how to use the API:

- To add a new doctor:
  ```http
  POST /doctors/add
  {
    "name": "Dr. John Smith",
    "city": "Delhi",
    "email": "john@example.com",
    "phoneNumber": "1234567890",
    "specialty": "Orthopedic"
  }

## Conclusion

The Doctor-Patient Management System in Spring Boot is designed to streamline healthcare operations by efficiently managing doctors and patients. Whether you're a healthcare provider or a developer, this project can serve as a solid foundation for creating and maintaining a healthcare platform. If you have any questions or suggestions, please feel free to reach out. We appreciate your interest and contributions!
