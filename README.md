# 🚀 TaskFlow API
A RESTful backend service for task management.

## 🛠️ Tech Stack
* **Java 21** & **Spring Boot 3**
* **Spring Data JPA** (Data Persistence)
* **H2 Database** (In-memory storage)

## 🏗️ Architecture
This project follows the **MVC (Model-View-Controller)** pattern:
* `Task.java`: The Data Model.
* `TaskRepository.java`: The Data Access Layer.
* `TaskController.java`: The REST API Endpoints.

## 🚀 How to Run
1. Open in IntelliJ.
2. Run `TaskflowApplication.java`.
3. Access endpoints at `http://localhost:8081/api/tasks`.