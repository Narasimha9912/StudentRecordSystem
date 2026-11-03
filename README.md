# 🎓 Student Record Management System

A console-based **Student Record Management System** developed using **Java 17**, **JDBC**, **MySQL**, and **Maven**. This application helps manage student information through simple menu-driven operations.

---

## 🚀 Project Overview

The Student Record Management System is designed to simplify student data management. It allows users to perform CRUD (Create, Read, Update, Delete) operations and store student information in a MySQL database.

---

## ✨ Features

- ➕ Add new student records
- 📋 View all student records
- 🔍 Search students by ID
- ✏️ Update student information
- 🗑️ Delete student records
- 💾 Store student details in MySQL
- 🔗 Database connectivity using JDBC

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| Java 17 | Backend programming |
| MySQL | Database management |
| JDBC | Database connectivity |
| Maven | Project and dependency management |
| VS Code | Development environment |

---

## 📂 Project Structure

```
StudentRecordSystem/
│
├── src/
│   └── main/
│       └── java/
│           ├── model/
│           │   ├── Student.java
│           │   ├── SchoolStudent.java
│           │   └── CollegeStudent.java
│           ├── dao/
│           │   ├── StudentDAO.java
│           │   └── StudentDAOImpl.java
│           ├── database/
│           │   └── DBConnection.java
│           ├── service/
│           │   └── StudentService.java
│           └── Main.java
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## ⚙️ How to Use This Project

### Step 1: Prerequisites

Make sure you have the following installed on your system:

- ☕ [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- 🐬 [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- 📦 [Apache Maven](https://maven.apache.org/download.cgi)
- 💻 [Visual Studio Code](https://code.visualstudio.com/) or any Java IDE (IntelliJ, Eclipse)

Verify installations:
```bash
java -version
mvn -version
mysql --version
```

### Step 2: Clone the Repository

```bash
git clone https://github.com/Narasimha9912/StudentRecordSystem.git
cd StudentRecordSystem
```

Or download as ZIP: Go to the [repository](https://github.com/Narasimha9912/StudentRecordSystem) → Click the green **Code** button → **Download ZIP** → Extract it.

### Step 3: Create the MySQL Database

Open MySQL and execute the following SQL commands:

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);
```

### Step 4: Configure Database Connection

Open `src/main/java/database/DBConnection.java` and update your MySQL credentials:

```java
private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
private static final String USER = "root";          // your MySQL username
private static final String PASSWORD = "your_password";  // your MySQL password
```

> ⚠️ **Security Note:** Never upload your actual database password to GitHub. Use environment variables or a secure configuration file.

### Step 5: Build the Project

```bash
mvn compile
```

### Step 6: Run the Project

```bash
mvn exec:java -Dexec.mainClass="Main"
```

Or alternatively:
```bash
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=Main
```

You can also run `Main.java` directly from your IDE.

---

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

- ☕ Java programming and OOP concepts
- 🔗 JDBC database connectivity
- 🐬 MySQL database operations
- 📝 CRUD application development
- 📦 Maven project management
- 📂 Organizing Java applications into packages

---

## 🔮 Future Enhancements

- [ ] Develop a graphical user interface (GUI)
- [ ] Add student authentication
- [ ] Generate student reports
- [ ] Improve input validation and error handling
- [ ] Add unit tests

---

## 👨‍💻 Author

**Y. Yoganarasimha**

Aspiring Software Developer | Java Developer

🔗 GitHub: [Narasimha9912](https://github.com/Narasimha9912)

---

⭐ If you find this project useful, consider giving it a star!
