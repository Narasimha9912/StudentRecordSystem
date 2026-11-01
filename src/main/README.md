# Student Record Management System

A console-based Java application to manage student records using MySQL database connectivity.

## Project Overview

The Student Record Management System allows users to add, view, search, update, and delete student information through a simple menu-driven interface.

## Technologies Used

- Java 17
- MySQL
- JDBC
- Apache Maven
- Visual Studio Code

## Features

1. Add Student
2. View All Students
3. Search Student by ID
4. Update Student Details
5. Delete Student
6. Exit Application

## Project Structure

```text
StudentRecordSystem/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            ├── model/
            ├── dao/
            ├── database/
            ├── service/
            └── Main.java
```

## Database Configuration

Database name: `studentdb`

Table name: `students`

Columns:
- id
- name
- age
- course

## How to Run

1. Install Java and Apache Maven.
2. Install MySQL and create the `studentdb` database and `students` table.
3. Configure your MySQL username and password in `DBConnection.java`.
4. Open the project folder in VS Code.
5. Open the terminal in the project root.
6. Run:

```bash
mvn compile
```

7. Start the application:

```bash
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=Main
```

## Project Status

Completed basic CRUD operations and tested the application with MySQL.

## Author

Y. Yoganarasimha