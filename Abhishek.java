package Abhishek;

// Contributed by Abhishek: Core Business Logic and Data Handling

import java.util.ArrayList;
import Prudhvi.Student; // Import the Student model

public class StudentManager {
    private ArrayList<Student> students;
    
    public StudentManager() {
        students = new ArrayList<>();
    }
    
    // Add a new student
    public boolean addStudent(Student newStudent) {
        // Check if ID already exists
        for (Student s : students) {
            if (s.getId() == newStudent.getId()) {
                return false; // ID already exists
            }
        }
        students.add(newStudent);
        return true;
    }
    
    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\n❌ No students in the system!");
            return;
        }
        
        System.out.println("\n═══ ALL STUDENTS ═══");
        for (Student student : students) {
            student.displayInfo();
        }
        System.out.println("Total Students: " + students.size());
    }
    
    // Search for a student by ID
    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    
    // Delete a student
    public boolean deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    
    // Calculate and display average GPA
    public void calculateAverageGPA() {
        if (students.isEmpty()) {
            System.out.println("\n❌ No students in the system!");
            return;
        }
        
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGpa();
        }
        double average = totalGPA / students.size();
        System.out.printf("\n📊 Average GPA: %.2f\n", average);
    }
}