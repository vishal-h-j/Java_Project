package Puneeth;

// Contributed by Puneeth: Application Initialization and Main Control Loop

import java.util.Scanner;
import java.util.InputMismatchException;
import Abhishek.StudentManager; // Import Business Logic
import Vishal.StudentConsoleUI; // Import UI

public class StudentManagementSystem {
    private StudentManager manager;
    private StudentConsoleUI ui;
    private Scanner scanner;
    
    public StudentManagementSystem() {
        scanner = new Scanner(System.in);
        // Note: We need to instantiate classes from their respective packages
        manager = new StudentManager(); 
        ui = new StudentConsoleUI(manager, scanner);
    }
    
    // Display menu
    public void displayMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║  STUDENT MANAGEMENT SYSTEM             ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("1. Add New Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student Information");
        System.out.println("5. Delete Student");
        System.out.println("6. Calculate Average GPA");
        System.out.println("7. Exit");
        System.out.print("\nEnter your choice: ");
    }
    
    // Main program loop
    public void run() {
        while (true) {
            displayMenu();
            int choice = 0;
            try {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    // Handle non-integer input gracefully
                    System.out.println("\n❌ Invalid input type! Please enter a number.");
                    scanner.nextLine(); // Clear the buffer
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n❌ Invalid input! Please try again.");
                scanner.nextLine(); // Clear the buffer
                continue;
            }
            
            switch (choice) {
                case 1:
                    ui.handleAddStudent();
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    ui.handleSearchStudent();
                    break;
                case 4:
                    ui.handleUpdateStudent();
                    break;
                case 5:
                    ui.handleDeleteStudent();
                    break;
                case 6:
                    manager.calculateAverageGPA();
                    break;
                case 7:
                    System.out.println("\n👋 Thank you for using Student Management System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\n❌ Invalid choice! Please try again.");
            }
        }
    }
    
    // Main method - program starts here
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.run();
    }
}