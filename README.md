🎓 Student Record Management System

A console-based Student Record Management System developed using Java 17, JDBC, MySQL, and Maven. This application helps manage student information through simple menu-driven operations.

🚀 Project Overview

The Student Record Management System is designed to simplify student data management. It allows users to perform CRUD (Create, Read, Update, Delete) operations and store student information in a MySQL database.

✨ Features

* ➕ Add new student records
* 📋 View all student records
* 🔍 Search students by ID
* ✏️ Update student information
* 🗑️ Delete student records
* 💾 Store student details in MySQL
* 🔗 Database connectivity using JDBC

🛠️ Technologies Used

Technology	Purpose
Java 17	Backend programming
MySQL	Database management
JDBC	Database connectivity
Maven	Project and dependency management
VS Code	Development environment

📂 Project Structure

StudentRecordSystem/
│
├── src/
│   └── main/
│       └── java/
│           ├── model/
│           ├── dao/
│           ├── database/
│           ├── service/
│           └── Main.java
│
├── pom.xml
└── README.md

⚙️ Installation and Setup

1. Prerequisites

Install the following:

* Java JDK 17
* MySQL Server
* Apache Maven
* Visual Studio Code

2. Clone the Repository

git clone https://github.com/Narasimha9912/StudentRecordSystem.git

3. Open the Project

cd StudentRecordSystem

4. Create the MySQL Database

Execute the following SQL commands:

CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);

5. Configure Database Connection

Configure your MySQL connection details in DBConnection.java.

Security: Never upload your actual database password to GitHub. Use environment variables or secure configuration.

6. Compile and Run

Compile the project:

mvn compile

Run the application:

mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=Main

🎯 Learning Outcomes

Through this project, I gained practical experience in:

* Java programming and OOP concepts
* JDBC database connectivity
* MySQL database operations
* CRUD application development
* Maven project management
* Organizing Java applications into packages

🔮 Future Enhancements

* Develop a graphical user interface
* Add student authentication
* Generate student reports
* Improve input validation and error handling

👨‍💻 Author

Y. Yoganarasimha

Aspiring Software Developer | Java Developer

GitHub: Narasimha9912

⸻

⭐ If you find this project useful, consider giving it a star!
