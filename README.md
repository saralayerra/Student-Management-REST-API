# 🎓 Student Management REST API

A RESTful backend application built using Spring Boot that performs CRUD operations on Student data.  
This project demonstrates layered architecture and real-world REST API development using Java and JPA.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman (API Testing)

---

## 🏗 Project Architecture

The application follows a clean layered architecture:

Controller → Service → Repository → Entity

- **Controller Layer** – Handles HTTP requests and responses  
- **Service Layer** – Contains business logic  
- **Repository Layer** – Handles database interaction using JPA  
- **Entity Layer** – Represents database table  

---

## 📌 Features

✔ Create Student  
✔ Get All Students  
✔ Get Student by ID  
✔ Update Student (PUT)  
✔ Partial Update (PATCH)  
✔ Delete Student  

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|------------|
| POST   | /students/ | Create a new student |
| GET    | /students/ | Get all students |
| GET    | /students/{id} | Get student by ID |
| PUT    | /students/{id} | Update entire student record |
| PATCH  | /students/{id} | Update specific fields |
| DELETE | /students/{id} | Delete student |

---

## 🗄 Database Configuration

Update `application.properties` with your MySQL credentials:

