Student Management System (Java)

A simple and modular console-based Student Management System built using Java.
The project is structured using multiple packages, each owned by a different teammate, making the code clean, organized, and easy to maintain.

Project Overview

This system allows users to:
Add new students
Display all students
Search students by ID
Update student details
Delete students
Calculate the average GPA
Exit the application

It runs completely in the console and follows a modular structure with separate responsibility for each teammate.

Package Structure
src/
 ├── Abhishek/
 │     └── StudentManager.java
 ├── Vishal/
 │     └── StudentConsoleUI.java
 ├── Prudhvi/
 │     └── Student.java
 └── Puneeth/
       └── StudentManagementSystem.java
Team Members & Roles
1. Abhishek — Core Business Logic

File: Abhishek/StudentManager.java
Responsibilities:

Manages all student-related operations

Add, delete, search, and display students

Calculates average GPA

Maintains internal list of students

Summary:
Designed the brain of the system — the actual logic that handles data and operations.

2. Vishal — User Interaction & Input Handling

File: Vishal/StudentConsoleUI.java
Responsibilities:

Takes user input from console

Handles Add, Search, Update, Delete UI workflows

Interacts with StudentManager

Ensures smooth user experience

Summary:
Built the bridge between the user and the system logic.

3. Prudhvi — Data Model Designer

File: Prudhvi/Student.java
Responsibilities:

Created the Student class

Defined attributes (id, name, age, course, gpa)

Getter & Setter methods

Display formatting for student details

Summary:
Designed the model that represents each student in the system.

4. Puneeth — Application Initialization & Main Control Flow

File: Puneeth/StudentManagementSystem.java
Responsibilities:

Wrote the main program loop
Displays menu options
Handles invalid inputs safely
Connects UI and Business Logic
Runs the entire application

Summary:
Built the entry point and overall program flow of the project.

 Features

Fully console-based
Modular design using packages
Error-handled user input
Prevents duplicate IDs
Dynamic student list
Clean output formatting
Beginner-friendly Java project structure

 How to Run
Clone the repository
Open in any Java IDE (VS Code, IntelliJ, Eclipse)
Ensure package structure is correct

Run:
Puneeth/StudentManagementSystem.java

Sample Output
════════════════════════════════════════
      STUDENT MANAGEMENT SYSTEM
════════════════════════════════════════
1. Add New Student
2. Display All Students
3. Search Student by ID
4. Update Student Information
5. Delete Student
6. Calculate Average GPA
7. Exit
Enter your choice: 
