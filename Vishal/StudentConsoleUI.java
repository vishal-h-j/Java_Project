package Vishal;

// Contributed by Vishal: User Interaction and Input Handling

import java.util.Scanner;
import Prudhvi.Student; // Import Student model
import Abhishek.StudentManager; // Import Business Logic

public class StudentConsoleUI {
    private StudentManager manager;
    private Scanner scanner;

    public StudentConsoleUI(StudentManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    // Handles input for adding a student
    public void handleAddStudent() {
        System.out.println("\n═══ ADD NEW STUDENT ═══");
        
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();
        
        Student newStudent = new Student(id, name, age, course, gpa);
        
        if (manager.addStudent(newStudent)) {
            System.out.println("✓ Student added successfully!");
        } else {
            System.out.println("❌ Error: Student ID already exists!");
        }
    }

    // Handles input for searching
    public void handleSearchStudent() {
        System.out.print("\nEnter Student ID to search: ");
        int searchId = scanner.nextInt();
        
        Student foundStudent = manager.searchStudent(searchId);
        if (foundStudent != null) {
            System.out.println("\n✓ Student Found:");
            foundStudent.displayInfo();
        } else {
            System.out.println("❌ Student not found!");
        }
    }
    
    // Handles input for updating
    public void handleUpdateStudent() {
        System.out.print("\nEnter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Student student = manager.searchStudent(id);
        
        if (student != null) {
            System.out.println("\n═══ UPDATE STUDENT ═══");
            System.out.println("Current Information:");
            student.displayInfo();
            
            System.out.print("\nEnter new Name (or press Enter to keep current): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) student.setName(name);
            
            System.out.print("Enter new Age (or 0 to keep current): ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age != 0) student.setAge(age);
            
            System.out.print("Enter new Course (or press Enter to keep current): ");
            String course = scanner.nextLine();
            if (!course.isEmpty()) student.setCourse(course);
            
            System.out.print("Enter new GPA (or -1 to keep current): ");
            double gpa = scanner.nextDouble();
            if (gpa != -1) student.setGpa(gpa);
            
            System.out.println("✓ Student updated successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }

    // Handles input for deleting
    public void handleDeleteStudent() {
        System.out.print("\nEnter Student ID to delete: ");
        int deleteId = scanner.nextInt();
        if (manager.deleteStudent(deleteId)) {
            System.out.println("✓ Student deleted successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }
}