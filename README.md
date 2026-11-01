# Student Record Management System

A console-based Student Record Management System developed using Java 17, JDBC, Maven, and MySQL.

## Project Overview

This project helps manage student information through a simple menu-driven application. Users can add, view, search, update, and delete student records.

## Technologies Used

- Java 17
- MySQL
- JDBC
- Maven
- VS Code

## Features

- Add new student records
- View all student records
- Search students by ID
- Update student information
- Delete student records
- Store information in a MySQL database

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

## Database Setup

1. Open MySQL.
2. Create a database named `studentdb`.
3. Create a table named `students` with the following columns:

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

4. Configure your MySQL connection in `DBConnection.java`.

**Security:** Do not upload your actual database password. Use environment variables or another secure configuration method.

## How to Run

1. Install Java 17, Maven, and MySQL.
2. Open the project folder in VS Code.
3. Configure the database connection.
4. Open the terminal in the project root.
5. Run:

```cmd
mvn compile
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=Main
```

## Author

Y. Yoganarasimha

## Project Status

Completed – Basic CRUD operations tested successfully.
