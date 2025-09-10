# 🗂️ Task Manager Backend

This is the backend of the Task Manager application, built with **Java** and **Spring Boot**. It provides a RESTful API to manage tasks, including CRUD operations and user authentication.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete tasks
- 🔐 User authentication and authorization
- 📅 Task scheduling and reminders
- 📊 Task categorization and filtering
- 📈 RESTful API with JSON responses

---

## 🛠️ Tech Stack

- **Backend Framework**: Spring Boot
- **Programming Language**: Java
- **Build Tool**: Maven
- **Database**: MySQL / PostgreSQL / H2 (configurable)
- **Authentication**: JWT (JSON Web Tokens)
- **API Documentation**: Swagger / OpenAPI

---

## 📂 Project Structure

```text
task-manager-backend/
├── .mvn/                  # Maven wrapper
├── src/
│   ├── main/java/com/yourorg/taskmanager/
│   │   ├── controller/    # REST API controllers
│   │   ├── model/         # Entity classes
│   │   ├── repository/    # JPA repositories
│   │   ├── service/       # Business logic
│   │   └── TaskManagerApplication.java  # Main application class
├── .gitignore             # Git ignore rules
├── mvnw                   # Maven wrapper script (Unix)
├── mvnw.cmd               # Maven wrapper script (Windows)
├── pom.xml                # Maven project configuration
└── README.md              # Project documentation
```

---

## ⚙️ Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/ines5101998/task-manager-backend.git
   ```

2. Navigate to the project directory:

   ```bash
   cd task-manager-backend
   ```

3. Build the project using Maven:

   ```bash
   ./mvnw clean install
   ```

4. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

---

## 🔗 API Endpoints

| Method | Endpoint               | Description                 |
|--------|------------------------|-----------------------------|
| GET    | `/api/tasks`           | Get all tasks               |
| GET    | `/api/tasks/{id}`      | Get task by ID              |
| POST   | `/api/tasks`           | Create a new task           |
| PUT    | `/api/tasks/{id}`      | Update an existing task     |
| DELETE | `/api/tasks/{id}`      | Delete a task               |
| POST   | `/api/auth/login`      | User login                  |
| POST   | `/api/auth/register`   | User registration           |

---

## 🛡️ Authentication

This application uses **JWT** for user authentication. To access protected endpoints, include the JWT token in the `Authorization` header as a Bearer token.

---

## 🧪 Testing

Unit tests are located in the `src/test/java` directory. To run the tests:

```bash
./mvnw test
```

---

## 📦 Build for Production

To create an optimized production build:

```bash
./mvnw clean package
```

The packaged application will be located in the `target/` directory.

---

## 📄 License

This project is licensed under the **MIT License**. See the `LICENSE` file for details.

---

👩‍💻 **By Ines**  

❤️ Made with love
